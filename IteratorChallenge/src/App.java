import java.util.Iterator;

import com.iterator.iterator.OperationIterator;
import com.iterator.math.Add;
import com.iterator.math.Operation;
import com.iterator.math.Product;
import com.iterator.school.Rubric;
import com.iterator.school.Score;

public class App {
    public static void main(String[] args) throws Exception {

        Rubric rubric = new Rubric(0.2, 0.1, 0.7);
        Score score = new Score(10, 7, 9);

        Product operation1 = new Product(score.getPractices(), rubric.getPracticesValue());
        Product operation2 = new Product(score.getBehavior(), rubric.getBehaviorValue());
        Product operation3 = new Product(score.getExam(), rubric.getExamValue());
        Add operation4 = new Add(operation2, operation3);

        Operation[] operations = new Operation[] {
                operation1, operation2, operation3, operation4,
                new Add(operation4.performOperation(), operation3.performOperation())
        };

        OperationIterator iterator = new OperationIterator(operations);
        while (iterator.hasNext())
        {
            Operation n = (Operation) iterator.next();
            System.out.println(n.toString());
        }
    }
}
