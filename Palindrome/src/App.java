import models.Word;
import utils.Palindrome;


public class App {
    public static void main(String[] args) throws Exception {

        Word word = new Word("hola");
        Word word2 = new Word("reconocer");


        System.out.println(word.getWord() + ": " + Palindrome.isPalindrome(word));
        System.out.println(word2.getWord() + ": " + Palindrome.isPalindrome(word2));
    }

}
