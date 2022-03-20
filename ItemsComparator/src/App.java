import Models.Item;

import java.util.Arrays;
import java.util.Comparator;

public class App {

    public static void main(String[] args) throws Exception {

        Item[] arrayItem = {
            new Item("7", "iPhone", new Double("30")),
            new Item("3", "Xiaomi", new Double("75")),
            new Item("9", "Samsung", new Double("67"))
        };

        Arrays.sort(arrayItem, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o1.price.compareTo(o2.price);
            }
        });

        System.out.println(Arrays.asList(arrayItem));

    }

}
