package com.internship.cloning.card_ONE;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//wait
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.internship.cloning.R;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context c ;
    ArrayList<Model> models;

    public MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, null);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder holder, int position) {
        holder.mImaeView.setImageResource(models.get(position).getImg());
        holder.mTitle.setText(models.get(position).getTitle());
        //description null mil ri hai usko
        //debug kr.
//call pr aa utha
     holder.mDes.setText(models.get(position).getDescription());

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {
                String gTitle = models.get(position).getTitle();
             String gDes = models.get(position).getDescription();
                BitmapDrawable bitmapDrawable = (BitmapDrawable)holder.mImaeView.getDrawable();

                Bitmap bitmap = bitmapDrawable.getBitmap();

                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100,stream);

                byte[] bytes = stream.toByteArray();

                Intent intent = new Intent(c,DataActivity.class);
                intent.putExtra("iTitle", gTitle);
                intent.putExtra("iDesc",gDes);
//                intent.putExtra("iDesc", gDes);
                intent.putExtra("iImage",bytes);
                c.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
