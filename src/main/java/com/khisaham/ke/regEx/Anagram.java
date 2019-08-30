package com.khisaham.ke.regEx;

import java.util.Arrays;

public class Anagram {
    /*
     * One way to find if two Strings are anagram in Java. This method assumes both
     * arguments are not null and in lowercase.
     * Write a function to check if two strings are an Anagram
     * Write unit tests to validate that your function is correct
     * Ex: School master = The classroom
     *
     * @return true, if both String are anagram
     */
    public static boolean isAnagram(String word, String anagram) {
        //ensure strings are in lower case


        //convert string into an arrays first e.g word resulting to {"w","o","r","d"}
        char wordArray [] = word.toLowerCase().toCharArray();
        char anagramArray [] = anagram.toLowerCase().toCharArray();

        //start by sorting the two strings first .. getting the length of both strings (if the length of both strings is equal likelihood of being anagram)
        if(wordArray.length != anagramArray.length){
            return false;
        }else{


            Arrays.sort(wordArray);
            Arrays.sort(anagramArray);

            //compare the sorted strings using a loop -- for loop
            for(int i=0; i<wordArray.length; i++){
                if(wordArray[i] != anagramArray[i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //test class

        //declare and initialize two words to be tested if anagram
        String word = "";
        String anagram = "";
        if(isAnagram(word, anagram)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

    }

}

//class TestClass {
//    static String testString1 = "word";
//    static String testString2 = "world";
//    public static void testAnagram(){
//        Anagram main = new Anagram();
//        if(main.isAnagram(testString1, testString2)){
//            System.out.println("Test passed");
//        }else{
//            System.out.println("Error ");}
//    }
//
//
//
//}
