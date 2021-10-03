package org.collection.com.service;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Logger;

public class ListIteratorExample {
    private static final Logger logger = Logger.getLogger(ListIteratorExample.class.getName());
    private static boolean isPalindrome = true;

    public static void fillList(String stringToCheck ,List<Character> list) {
        for (Character character : stringToCheck.toCharArray()) {
            list.add(character);
        }
    }

    public static boolean checkString(ListIterator<Character> iterator, ListIterator<Character> reverseIterator) {
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static void printResult(boolean isPalindrome) {
        if (isPalindrome) {
            logger.info("This is palindrome");
        } else {
            logger.info("This is not palindrome");
        }
    }

    public static void main(String[] args) {
        String stringToCheck = "madam";
        List<Character> list = new LinkedList<>();
        fillList(stringToCheck, list);

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        ListIteratorExample.printResult(checkString(iterator, reverseIterator));
    }
}
