import utils.Pattern;

public class App {




    public static void main(String[] args) throws Exception {
        int firstPatternLenght = 7, spiralPatternLenght = 5;

        printArray(Pattern.printFirstPattern(firstPatternLenght));
        System.out.print("\n\n\n");
        printArray(Pattern.printSpiralPattern(spiralPatternLenght));
    }

    private static void printArray(int[][] inputArray) {
        for(int i = 0; i < inputArray.length; i++) {
            for(int j = 0; j < inputArray.length; j++){
                System.out.print(inputArray[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
