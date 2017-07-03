package com.example.user.wordcountapp;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static android.R.id.input;

/**
 * Created by user on 03/07/2017.
 */

public class WordCounter {

//    private ArrayList<String> sentence;
//    sentence = new ArrayList<String>();
//    }

//    public ArrayList<String> addToArrayList(String text){
//        sentence.add(text);
//        return sentence;
//    }

    public String getWordCount(String input){
        int words = 0;
        for (String string : input.split(" ")){
            words += 1;
        }
        int number = words;
        String numberToString = Integer.toString(number);
        return numberToString;
    }


}
