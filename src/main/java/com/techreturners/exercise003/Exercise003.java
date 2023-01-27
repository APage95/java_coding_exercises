package com.techreturners.exercise003;

import java.util.Arrays;

public class Exercise003 {

    IceCream iceCream0 = new IceCream("Pistachio", 0);
    IceCream iceCream1 = new IceCream("Raspberry Ripple", 1);
    IceCream iceCream2 = new IceCream("Vanilla", 2);
    IceCream iceCream3 = new IceCream("Mint Chocolate Chip", 3);
    IceCream iceCream4 = new IceCream("Chocolate", 4);
    IceCream iceCream5 = new IceCream("Mango Sorbet", 5);

    IceCream[] stock = {iceCream0, iceCream1, iceCream2, iceCream3, iceCream4, iceCream5};

    Exception error = new Exception("Hubba bubba get outta my shoppa!");

    int getIceCreamCode(String iceCreamFlavour) throws Exception {

        return switch (iceCreamFlavour) {
            case "Pistachio" -> iceCream0.getCode();
            case "Raspberry Ripple" -> iceCream1.getCode();
            case "Vanilla" -> iceCream2.getCode();
            case "Mint Chocolate Chip" -> iceCream3.getCode();
            case "Chocolate" -> iceCream4.getCode();
            case "Mango Sorbet" -> iceCream5.getCode();
            default -> throw error;
        };

    }
        String[] iceCreamFlavours() {
        return Arrays.stream(stock).map(IceCream::getFlavour).toArray(String[]::new);
    }

}
