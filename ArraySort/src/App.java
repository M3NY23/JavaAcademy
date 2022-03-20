import java.util.Arrays;

import utilerias.Sort;

public class App {

    public static void main(String[] args) throws Exception {

        int[] messyArray = new int[]{6,3,1,2,7,5,4,8,9};
        
        int[] upwardArray = Sort.ascendingSort(messyArray);
        System.out.println("Ordenado ascendentemente:");
        System.out.println(Arrays.toString(upwardArray));
        
        int[] fallingArray = Sort.descendingSort(messyArray);
        System.out.println("Ordenado descendentemente:");
        System.out.println(Arrays.toString(fallingArray));
        
        Arrays.sort(messyArray);
        System.out.println("Ordenado con Array.sort():"); 
        System.out.println(Arrays.toString(messyArray));
    }
}
