package utils;

import java.util.LinkedList;
import java.util.Queue;

import models.Word;

public class Palindrome {

    public static boolean isPalindrome(Word word) {
        Queue<Character> charsQueue = _convertStringToQueue(word.getWord());
        String reverseWord = _getReverseWord(charsQueue);
        return (reverseWord.equals(word.getWord()));
    }

    private static Queue<Character> _convertStringToQueue(String word) {
        Queue<Character> charsQueue = new LinkedList<Character>();
        for (char c : word.toCharArray())
            charsQueue.offer(c);
        return charsQueue;
    }

    private static String _getReverseWord(Queue<Character> queue) {
        String word = "";
        while( !queue.isEmpty() ) 
            word = queue.remove() + word;
        return word;
    }
}
