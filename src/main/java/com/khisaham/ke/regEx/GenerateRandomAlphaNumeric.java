package com.khisaham.ke.regEx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GenerateRandomAlphaNumeric {
    static Logger logger = LoggerFactory.getLogger(GenerateRandomAlphaNumeric.class);

    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public static String generateUniqueOrderCode() {
        int count = 10;
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        logger.debug(builder.toString());
        return builder.toString();
    }
}
