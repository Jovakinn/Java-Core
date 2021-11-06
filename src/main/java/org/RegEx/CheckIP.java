package org.RegEx;

import java.util.regex.Pattern;

public class CheckIP {

    private static void checkIP(String ip) {
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d) (\\.)){3}" +
                "(25[0-5]|2[0-4]\\d |[01]?\\d?\\d)";
        System.out.println(ip + " is ok? " + Pattern.matches(regex, ip));
    }

    public static void main(String[] args) {
        String ip1 = "255.38.192.99";
        String ip2 = "255.2138.11212192.199";
        CheckIP.checkIP(ip1);
        CheckIP.checkIP(ip2);
    }
}
