package com.example.user.wordcountapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/07/2017.
 */

public class TestWordCounter {

    WordCounter wordCounter;


    @Before
    public void before(){
        this.wordCounter = new WordCounter();
    }

    @Test
    public void canGetWordCount() throws Exception {
        assertEquals("4", wordCounter.getWordCount("see ya later mate"));
    }

    //    @Test
//    public void canAddToArray() throws Exception {
//        assertEquals(Arrays.asList("This is graham and Chris calling everyone in the world!"), wordCounter.addToArrayList("This is graham and Chris calling everyone in the world!"));
//    }

}
