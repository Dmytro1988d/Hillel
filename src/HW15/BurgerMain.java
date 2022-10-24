package HW15;

public class BurgerMain {
    public static void main(String[] args) {
        BurgerRegular burgerRegular = new BurgerRegular("bun","meat","cheese","herbs","mayo");
        BurgerDiet burgerDiet = new BurgerDiet("bun","meat" , "cheese", "herbs","");
        BurgerDblMeat burgerdblmeat = new BurgerDblMeat("bun","meat","cheese","herbs","mayo",2);
    }
}
