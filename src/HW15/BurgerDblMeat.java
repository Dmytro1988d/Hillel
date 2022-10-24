package HW15;

public class BurgerDblMeat extends Burger{
   public int modificator;
    public BurgerDblMeat(String bun, String meat, String cheese, String herbs, String mayo, int modificator) {
        super(bun, meat, cheese, herbs, mayo);
        System.out.println("The Doublemeat burger of your choice consists of :" + " " + bun + ", " + meat + " x" +modificator + ", " + cheese + ", " + herbs + ", " + mayo + ".");
    }
}

