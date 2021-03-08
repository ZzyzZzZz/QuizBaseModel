package com.bsisou.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    // TODO: Declare constants here


    // TODO: Declare member variables here:
Button trueButton;
Button falseButton;
TextView scoreTextView;
TextView questionView;
ProgressBar progressBar;

    // TODO: to create question bank



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        trueButton = findViewById(R.id.true_button);
        falseButton = findViewById(R.id.false_button);
        scoreTextView = findViewById(R.id.score);
        progressBar = findViewById(R.id.progress_bar);

        trueButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("Quiz" , "True button clicked");
                Toast.makeText(MainActivity.this, "true button clicked", Toast.LENGTH_SHORT).show();

            }
        });
//闭关gay
        falseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("Quiz" , "false button clicked");
                Toast.
            }
        });

    }
}
