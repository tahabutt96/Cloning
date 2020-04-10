package com.internship.cloning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button one , two , threee , four , five , six;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one =(Button)findViewById(R.id.btn_one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,cardOne.class);
                startActivity(intent);
            }
        });

        two =(Button)findViewById(R.id.btn_two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,cardTwo.class);
                startActivity(intent);
            }
        });

        threee =(Button)findViewById(R.id.btn_three);
        threee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,cardThree.class);
                startActivity(intent);
            }
        });

        four =(Button)findViewById(R.id.btn_four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,cardFour.class);
                startActivity(intent);
            }
        });

        five =(Button)findViewById(R.id.btn_five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,cardFive.class);
                startActivity(intent);
            }
        });

        six =(Button)findViewById(R.id.btn_six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,cardSix.class);
                startActivity(intent);
            }
        });


    }
}
