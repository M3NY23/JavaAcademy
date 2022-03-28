import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {

    public static void main(String[] args) throws Exception {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item(1, 8000, "Asus", "Es una computadora", "Asus"));
        items.add(new Item(2, 3000, "HP", "Es una computadora", "HP"));
        items.add(new Item(3, 4000, "Lenovo", "Es una computadora", "Lenovo"));
        items.add(new Item(4, 5600, "ACER", "Es una computadora", "ACER"));

        System.out.println(ItemController.getItemByName(items, "Lenovo"));

        System.out.println("********");

        List<Item> itemsSorted = ItemController.sortElementsByPrice(items);
        for(Item item : itemsSorted) System.out.println(item);

        System.out.println("********");

        Optional<Item> cheapestItem = ItemController.getCheapest(items);
        System.out.println(cheapestItem);

        System.out.println("********");

        Optional<Item> mostExpensiveItem = ItemController.getMostExpensive(items);
        System.out.println(mostExpensiveItem);

        System.out.println("********");

        List<Item> itemsWithoutIva = ItemController.getListItemWithoutIVA(items);
        for(Item item : itemsWithoutIva) System.out.println(item);

        
    }
}
