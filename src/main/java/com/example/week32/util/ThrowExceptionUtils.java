package com.example.week32.util;

import java.util.Random;

public class ThrowExceptionUtils {
    public static void throwExceptionWithProbabilityOf50Percent() throws Exception {
        Random random = new Random();
        final int randomNum = random.nextInt(100);
        if (randomNum < 50) {
            throw new Exception("An exception occurred while getting DTO");
        }
    }
}
