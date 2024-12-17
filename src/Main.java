//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        Item coke = new Item("Coke", "Drink", 2.0);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item onion = new Item("Onion", "Topping", 0.5);
//        onion.printItem();
//
//        Burger hamburger = new Burger("Regular", 3.5);
//        hamburger.addToppings("AVOCADO", "BACON", "MAYO");
//        hamburger.printItem();
//
//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();
//
//        MealOrder secondMeal = new MealOrder("turkey", "pepsi", "wedges");
//        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("Deluxe", "pepsi", "wedges");
        deluxeMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO", "HAM", "KETCHUP");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();
    }
}