package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        char firstLetter = word.charAt(0);
        String upperLetter = String.valueOf(Character.toUpperCase(firstLetter));
        return word.replaceFirst(String.valueOf(word.charAt(0)), upperLetter);
    }

    public String generateInitials(String firstName, String lastName) {
        char firstInitial = firstName.charAt(0);
        char secondInitial = lastName.charAt(0);
        String first = String.valueOf(firstInitial);
        String second = String.valueOf(secondInitial);
        return first + "." + second;
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        return 0.0;
    }

    public String reverse(String sentence) {
        // Add your code here
        return "";
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        return 0;
    }
}
