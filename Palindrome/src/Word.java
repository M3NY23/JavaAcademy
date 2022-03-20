import java.util.LinkedList;
import java.util.Queue;

public class Word {
    private Queue<Character> letters = new LinkedList();
    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

}
