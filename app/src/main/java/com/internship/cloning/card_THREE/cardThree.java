package com.internship.cloning.card_THREE;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.internship.cloning.R;
import com.internship.cloning.card_ONE.Model;
import com.internship.cloning.card_ONE.MyAdapter;

import java.util.ArrayList;

public class cardThree extends AppCompatActivity {
    Button a , b , c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_three);

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        a = (Button)findViewById(R.id.buttenvironment);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cardThree.this,cardInnerThree.class);
                startActivity(intent);
            }
        });
        b = (Button)findViewById(R.id.buttmathematical);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cardThree.this,cardInnerTwoThree.class);
                startActivity(intent);
            }
        });

        c = (Button)findViewById(R.id.buttdata);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cardThree.this,cardInnerThreeThree.class);
                startActivity(intent);
            }
        });

    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}