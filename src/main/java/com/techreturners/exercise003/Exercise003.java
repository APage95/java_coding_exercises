package com.techreturners.exercise003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise003 {

    IceCream iceCream0 = new IceCream("Pistachio", 0);
    IceCream iceCream1 = new IceCream("Raspberry Ripple", 1);
    IceCream iceCream2 = new IceCream("Vanilla", 2);
    IceCream iceCream3 = new IceCream("Mint Chocolate Chip", 3);
    IceCream iceCream4 = new IceCream("Chocolate", 4);
    IceCream iceCream5 = new IceCream("Mango Sorbet", 5);

    IceCream[] stock = {iceCream0, iceCream1, iceCream2, iceCream3, iceCream4, iceCream5};

    int getIceCreamCode(String iceCreamFlavour) {

        if (iceCreamFlavour.equals("Pistachio")){
            return iceCream0.getCode(); }

        else if(iceCreamFlavour.equals("Raspberry Ripple")){
            return iceCream1.getCode(); }

        else if(iceCreamFlavour.equals("Vanilla")){
            return iceCream2.getCode(); }

        else if(iceCreamFlavour.equals("Mint Chocolate Chip")){
            return iceCream3.getCode(); }

        else if(iceCreamFlavour.equals("Chocolate")){
            return iceCream4.getCode();}

        else if(iceCreamFlavour.equals("Mango Sorbet")){
            return iceCream5.getCode(); }

        else { return 00;}
    }

    String[] iceCreamFlavours() {

    }

}
