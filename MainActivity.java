package com.example.application;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import java.util.ArrayList;
import java.util.Collection;


public class MainActivity extends AppCompatActivity {

    TextView textView2;
    Button button2;
    ArrayList<String> trivia = new ArrayList<>();
    int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        textView2 = findViewById(R.id.textView);
        button2 = findViewById(R.id.button2);

        trivia.add("“Dreamt” (the past tense of dream) is the only commonly used English word ending with “-mt.”");
        trivia.add("The longest word that doesn't repeat any of its letters is uncopyrightable.");
        trivia.add("Queueing is the only word with five vowels in a row.");
        trivia.add("Strengths is the longest word with only one vowel.");
        trivia.add("The longest word in the English language that has its letters in alphabetical order is almost.");
        trivia.add("Bookkeeper and bookkeeping are the only two words with three consecutive double letters.");
        trivia.add("A chicken once lived for 18 months without a head.");
        trivia.add("Wearing a tie can reduce blood flow to the brain by 7.5 per cent.");
        trivia.add("Most maps of the world are wrong.");
        trivia.add("Comets smell like rotten eggs. ");

        textView2.setText(trivia.get(currentIndex));
        button2.setOnClickListener(View_v -> {
            currentIndex++;

            if (currentIndex < trivia.size()) {
                textView2.setText(trivia.get(currentIndex));

            }

        else{
            button2.setEnabled((false));
            button2.setText("No available Trivia.");

            }
        });
    }
}

