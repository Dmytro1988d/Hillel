package HW15;

public class BurgerDiet extends Burger{
    public BurgerDiet(String bun, String meat, String cheese, String herbs, String mayo) {
        super(bun, meat, cheese, herbs, mayo);
        System.out.println("The Diet burger of your choice consists of :" + " " + bun + ", " + meat + ", " + cheese + ", " + herbs + ".");
    }
}

