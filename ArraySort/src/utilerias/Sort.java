package utilerias;

public class Sort {
    public static int[] ascendingSort(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++)
            for (int j = 0; j < inputArray.length; j++) {
                if (j != inputArray.length - 1 && inputArray[j] > inputArray[j + 1]) {
                    int carreo = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = carreo;
                }
            }
        return inputArray;
    }

    public static int[] descendingSort(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++)
            for (int j = 0; j < inputArray.length; j++) {
                if (j != inputArray.length - 1 && inputArray[j] < inputArray[j + 1]) {
                    int carreo = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = carreo;
                }
            }
        return inputArray;
    }

}
