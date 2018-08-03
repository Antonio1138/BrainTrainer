package com.antonio.braintrainer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button startButton;
    ArrayList<Integer> anwers = new ArrayList<Integer>();
    int locationOfCorrectAnswer;

    public void start (View view) {

        startButton.setVisibility(View.INVISIBLE);


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById(R.id.startButton);
        TextView someTextView = findViewById(R.id.someTextView);
        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        Random rand = new Random();

        int a = rand.nextInt(21);
        int b = rand.nextInt(21);

        someTextView.setText(Integer.toString(a) + " + " + Integer.toString(b));

        locationOfCorrectAnswer = rand.nextInt(4);
        int incorrectAnswer;

        for (int i = 0; i < 4; i++) {

            if (i == locationOfCorrectAnswer) {

                anwers.add(a + b);
            } else {

                incorrectAnswer = rand.nextInt(41);

                while (incorrectAnswer == a + b){

                    incorrectAnswer = rand.nextInt(41);
                }

                anwers.add(incorrectAnswer);
            }
        }

        button0.setText(Integer.toString(anwers.get(0)));
        button1.setText(Integer.toString(anwers.get(1)));
        button2.setText(Integer.toString(anwers.get(2)));
        button3.setText(Integer.toString(anwers.get(3)));

    }
}
