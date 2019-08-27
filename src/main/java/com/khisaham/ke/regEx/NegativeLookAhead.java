package com.khisaham.ke.regEx;

public class NegativeLookAhead {
    //Negative look ahead provides the possibility to exclude a pattern. With this you can say that a string should not be followed by another string.
    //Negative look ahead are defined via (?!pattern). For example, the following will match "a" if "a" is not followed by "b"
    private static String negativeLookAheadPattern = "a(?!b)";
}
