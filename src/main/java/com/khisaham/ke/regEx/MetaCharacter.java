package com.khisaham.ke.regEx;

public class MetaCharacter {
private static String pattern;
    public static String removeWhiteSpaces(String inputText){
        // Removes whitespace between a word character and . or ,
        pattern = "(\\w)(\\s+)([\\.,])";
        return inputText.replaceAll(pattern, "$1$3");
    }

    public static String extractTextBetweenAnElement(String inputText, String [] element){
        // Extract the text between the two title elements
        String updated = "";
        for(int i=0; i<element.length; i++){
            pattern = "(?i)(<"+element[i]+".*?>)(.+?)()";
            updated = inputText.replaceAll(pattern, "$2");

        }
        return updated;
    }
    // returns true if the string does not have a number at the beginning
    public boolean isNoNumberAtBeginning(String inputText){
        return inputText.matches("^[^\\d].*");
    }
    // returns true if the string have a defined xter at the beginning
    public boolean characterIsAtTheBeginning(String inputText, String character){
        return inputText.matches("^[^"+character+"].*");
    }

    // returns true if the string contains a arbitrary number of characters except b
    public boolean isIntersection(String s){
        return s.matches("([\\w&&[^b]])*");
    }
    // returns true if the string contains a number less than 300
    public boolean isLessThenThreeHundred(String s){
        return s.matches("[^0-9]*[12]?[0-9]{1,2}[^0-9]*");
    }
    // returns true if the string matches exactly "true"
    public boolean isTrue(String s){
        return s.matches("true");
    }
    // returns true if the string matches exactly "true" or "True"
    public boolean isTrueVersion2(String s){
        return s.matches("[tT]rue");
    }

    // returns true if the string matches exactly "true" or "True"
    // or "yes" or "Yes"
    public boolean isTrueOrYes(String s){
        return s.matches("[tT]rue|[yY]es");
    }

    // returns true if the string contains exactly "true"
    public boolean containsTrue(String s){
        return s.matches(".*true.*");
    }


    // returns true if the string contains of three letters
    public boolean isThreeLetters(String s){
        return s.matches("[a-zA-Z]{3}");
        // simpler from for
//      return s.matches("[a-Z][a-Z][a-Z]");
    }

    // returns true if the string matches exactly parsed patternSequence e.g <p>, <img>, <li> etc
    public static boolean isTrueForAPatternSequence(String inputText, String[] patternSequence){
    int j;
        boolean finalBoolean = false;
        for(j=0; j<patternSequence.length; j++){

       finalBoolean = inputText.matches(patternSequence[j]);
        }
        return  finalBoolean;
    }
}
