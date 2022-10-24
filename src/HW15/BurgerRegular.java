package HW15;

public class BurgerRegular extends Burger{
    public BurgerRegular(String bun, String meat, String cheese, String herbs, String mayo) {
        super(bun, meat, cheese, herbs, mayo);
        System.out.println("The Regular burger of your choice consists of :" + " " + bun + ", " + meat + ", " + cheese + ", " + herbs + ", " + mayo + ".");
    }
}
