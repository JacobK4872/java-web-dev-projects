package org.launchcode;

import java.util.HashMap;

public class CountingCharacters {
    public static void main(String[] args) {
        String myString = "abcdefggggggggggg";

        char[] charactersInString = myString.toLowerCase().toCharArray();
        HashMap<Character, Integer> characterCount = new HashMap<>();

        for (int i = 0; i < charactersInString.length; i++) {
            System.out.println(charactersInString[i]);
        }



    }
}
