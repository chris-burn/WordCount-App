package com.example.user.wordcountapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;

import static com.example.user.wordcountapp.R.string.question;

public class MainActivity extends AppCompatActivity {

    EditText questionEditText;
    TextView answerText;
    Button countButton;
    WordCounter wordCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionEditText = (EditText) findViewById(R.id.wordToConvert);
        answerText = (TextView) findViewById(R.id.answer_text);
        countButton = (Button) findViewById(R.id.button);
        wordCounter = new WordCounter();
    }

    public void onButtonClicked(View button) {
        String question = questionEditText.getText().toString();
//        wordCounter.addToArrayList(question);
        Log.d("WordCounter", question);
        answerText.setText(wordCounter.getWordCount(question));
    }

}

//    Hash Map split words and qty.  BUGGY, only lists first word
//
//    String[] splitted = question.split(" ");
//    HashMap hm = new HashMap();
//
//        for (int i = 0; i < splitted.length; i++) {
//        if (!hm.containsKey(splitted[i])) {
//            hm.put(splitted[i], 1);
//        } else {
//            hm.put(splitted[i], (Integer) hm.get(splitted[i]) + 1);
//        }
//        }
//
//        for (Object word : hm.keySet()){
//        answerText.setText(word + " " + (Integer) hm.get(word));
//        }
