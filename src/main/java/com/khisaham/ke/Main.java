package com.khisaham.ke;


import com.khisaham.ke.regEx.MetaCharacter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);
    public static final String EXAMPLE_TEST = "<p>Hello This is a sample TEXT with <br> <a href='regex.io'>Regex Library</a> and <b>Bold text</b>";
    private static String[] samplePattern = {"<p>","</p>","<a>", "</a>", "<b>", "</b>", "<img>"};
    public static void main(String[] args) {
//        System.out.println(EXAMPLE_TEST.matches("\\w.*"));
//        String[] splitString = (EXAMPLE_TEST.split("\\s+"));
//        System.out.println(splitString.length);// should be 14
//        for (String string : splitString) {
//            System.out.println(string);
//        }
//        //replace all whitespace with tabs
//        System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
       logger.info(MetaCharacter.extractTextBetweenAnElement(EXAMPLE_TEST, samplePattern));
        logger.info(MetaCharacter.isTrueForAPatternSequence(EXAMPLE_TEST, samplePattern) ? "true" : "false");

    }
}