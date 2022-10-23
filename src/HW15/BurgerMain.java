package HW15;

public class BurgerMain {
    public static void main(String[] args) {
        Burger burgerRegular = new Burger("bun","meat","cheese","herbs","mayo");
        Burger burgerDiet = new Burger("bun","meat" , "cheese", "herbs");
        Burger burgerdblmeat = new Burger("bun","meat",2,"cheese","herbs","mayo");

    }
}
