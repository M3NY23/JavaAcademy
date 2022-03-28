import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ItemController {

    public static Optional<Item> getItemByName(List<Item> items, String name) {
        return items.stream().filter(element -> element.getName() == name).findFirst();
    }

    public static List<Item> sortElementsByPrice(List<Item> items) {
        return items.stream().sorted(Comparator.comparingDouble(Item::getPrice)).collect(Collectors.toList());
    }

    public static Optional<Item> getCheapest(List<Item> items) {
        return items.stream().min(Comparator.comparing(Item::getPrice));
    }

    public static Optional<Item> getMostExpensive(List<Item> items) {
        return items.stream().max(Comparator.comparing(Item::getPrice));
    }

    public static List<Item> getListItemWithoutIVA(List<Item> items) {
        return items.stream().map((item) -> {
            item.setPrice(item.getPrice() - (item.getPrice() * 0.16));
            return item;
        }).collect(Collectors.toList());
    }
}
