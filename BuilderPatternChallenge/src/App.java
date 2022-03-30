import com.academy.pizza.Pizza;
import com.academy.pizza.PizzaSize;

public class App {

    public static void main(String[] args) throws Exception {

        Pizza firstPizza = new Pizza.PizzaBuilder("Catsup", "Mozzarela", "Bread", PizzaSize.Personal).build();
        Pizza seccondPizza = new Pizza.PizzaBuilder("Inglesa", "Cheddar", "Bread", PizzaSize.Personal)
            .setMushrooms(true).build();
        Pizza thirdPizza = new Pizza.PizzaBuilder("Tabasco", "Cheddar", "Bread", PizzaSize.Personal)
            .setPepperoni(true).setPineapple(true).build();

        System.out.println(firstPizza);
        System.out.println(seccondPizza);
        System.out.println(thirdPizza);

    }
    
}
