package com.techreturners.exercise001;

import java.util.ArrayList;
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
        double multiplier = 100;
        double total = ((vatRate / multiplier) * originalPrice) + originalPrice;
        double fin = Math.round(total * 100) / 100D;
        return fin;
    }

    public String reverse(String sentence) {
        StringBuilder gobble = new StringBuilder(sentence);
        gobble.reverse();
        return gobble.toString();
    }

    public int countLinuxUsers(List<User> users) {

        ArrayList<User> lads = new ArrayList<>(users);

        int counter = 0;

        for (User useR : lads) {

            String hiUser = useR.getType();

            if (hiUser.equals("Linux")) {
                counter++;
            }

        }    return counter;

    }


//        String[] band = new String[]{"Posh", "Baby", "Sporty", "Ginger", "Scary", "Sleepy"};
//
//        for (String member : band) {
//            member = member.concat(" Spice");
//        }
//
//        for (int counter = 0 ; counter < band.length ; counter++) {
//            band[counter] = band[counter].concat(" Spice");
//        }
//

}
