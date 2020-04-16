package com.internship.cloning.card_ONE;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.internship.cloning.R;

public class DataActivity extends AppCompatActivity {

    TextView mTextTv, mDescTv;
    ImageView mImageTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        ActionBar actionBar = getSupportActionBar();

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mTextTv = (TextView)findViewById(R.id.titleTv);
        mDescTv = (TextView)findViewById(R.id.description);
        mImageTv = (ImageView)findViewById(R.id.imageView);

        Intent intent = getIntent();

        String mTitle = intent.getStringExtra("iTitle");
        String mDescription = intent.getStringExtra("iDesc");
        byte[] mBytes = getIntent().getByteArrayExtra("iImage");

        Bitmap bitmap = BitmapFactory.decodeByteArray(mBytes,0,mBytes.length);

        actionBar.setTitle(mTitle);

        mTextTv.setText(mTitle);
        mDescTv.setText(mDescription);
        mImageTv.setImageBitmap(bitmap);

    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
