package org.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String s1 = "ABCD ABCDEER ABCDERTG";
        Pattern pattern = Pattern.compile("[ABCD]");
        Matcher matcher = pattern.matcher(s1);

        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }
}
