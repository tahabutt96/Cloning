package com.internship.cloning.card_SIX;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.internship.cloning.R;

public class ActivityResult extends AppCompatActivity {
    private boolean exit = false;
    TextView tv, tv2, tv3;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tv = (TextView) findViewById(R.id.tvres);
        tv2 = (TextView) findViewById(R.id.tvres2);
        tv3 = (TextView) findViewById(R.id.tvres3);
        back = (Button) findViewById(R.id.back);

        StringBuffer sb = new StringBuffer();
        sb.append("Correct answers: " + ActivityQuiz.correct + "\n");
        StringBuffer sb2 = new StringBuffer();
        sb2.append("Wrong Answers: " + ActivityQuiz.wrong + "\n");
        StringBuffer sb3 = new StringBuffer();
        sb3.append("Final Score: " + ActivityQuiz.correct + "\n");
        tv.setText(sb);
        tv2.setText(sb2);
        tv3.setText(sb3);

        ActivityQuiz.correct = 0;
        ActivityQuiz.wrong = 0;

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
                finish();
            }
        });
    }

    public void onBackPressed() {
        if (exit) {
            Intent in = new Intent(ActivityResult.this, cardSix.class);
            startActivity(in);
            finish(); // finish activity
        } else {
            Toast.makeText(this, "Redirecting....",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);
        }
    }
}
