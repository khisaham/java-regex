package com.khisaham.ke.regEx;

public class MetaCharacter {
private static String pattern;
    public static String removeWhiteSpaces(String inputText){
        // Removes whitespace between a word character and . or ,
        pattern = "(\\w)(\\s+)([\\.,])";
        return inputText.replaceAll(pattern, "$1$3");
    }

    public static String extractTextBetweenAnElement(String inputText, String element){
        // Extract the text between the two title elements
        pattern = "(?i)(<"+element+".*?>)(.+?)()";
        String updated = inputText.replaceAll(pattern, "$2");

        return updated;
    }
}
