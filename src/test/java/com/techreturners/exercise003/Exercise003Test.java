package com.techreturners.exercise003;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise003Test {

    private Exercise003 ex003;

    @BeforeEach
    public void setup() {
        ex003 = new Exercise003();
    }

    @Test
    public void checkGetIceCreamCodeForMintChocolateChip() throws Exception {
        String iceCreamFlavour = "Mint Chocolate Chip";
        int expected = 3;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));

    }

//    @Disabled("You can remove this @Disabled annotation to run the test")
    @Test
    public void checkGetIceCreamCodeForMangoSorbet() throws Exception {
        String iceCreamFlavour = "Mango Sorbet";
        int expected = 5;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

//    @Disabled("You can remove this @Disabled annotation to run the test")
    @Test
    public void checkGetIceCreamCodeForRaspberryRipple() throws Exception {
        String iceCreamFlavour = "Raspberry Ripple";
        int expected = 1;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

//    @Disabled("You can remove this @Disabled annotation to run the test")
    @Test
    public void checkPickMultipleIceCreamFlavours() {

        String[] expected = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };

        assertArrayEquals(expected, ex003.iceCreamFlavours());
    }

    /* Chris' tests below! :) */

    @Test
    public void checkGetIceCreamCodeForVanilla() throws Exception {

        String iceCreamFlavour = "Vanilla";
        int expected = 2;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));

    }

    @Test
    public void checkGetRandomFlavour() {

        Random random = new Random();
        Exercise003 e3 = new Exercise003();
        int randomFlavour = random.nextInt(e3.iceCreamFlavours().length);
        String expected = e3.iceCreamFlavours()[randomFlavour];

        assertEquals(expected, ex003.iceCreamFlavours()[randomFlavour]);

    }

    @Test
    public void checkGetIceCreamCodeForBubblegumInt() throws Exception {

        String iceCreamFlavour = "Bubblegum";

        assertEquals(-1, ex003.getIceCreamCode(iceCreamFlavour));

    }


    @Test
    public void checkGetIceCreamCodeForBubblegumException() {

        String iceCreamFlavour = "Bubblegum";

        assertThrows(Exception.class, () -> ex003.getIceCreamCode(iceCreamFlavour));

    }

}
