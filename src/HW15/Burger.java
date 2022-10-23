package HW15;

public class Burger {
    public String Bun;
    public String Meat;
    public String Cheese;
    public String Herbs;
    public String Mayo;
    public int Modificator;

    public Burger(String bun, String meat, String cheese, String herbs, String mayo) {
        Bun = bun;
        Meat = meat;
        Cheese = cheese;
        Herbs = herbs;
        Mayo = mayo;
        System.out.println("The Regular burger of your choice consists of :" + " " + Bun + ", " + Meat + ", " + Cheese + ", " + Herbs + ", " + Mayo + ".");
    }

    public Burger(String bun, String meat, String cheese, String herbs) {
        Bun = bun;
        Meat = meat;
        Cheese = cheese;
        Herbs = herbs;
        System.out.println("The Diet burger of your choice consists of :" + " " + Bun + ", " + Meat + ", " + Cheese + ", " + Herbs + ".");
    }

    public Burger(String bun, String meat, int modificator, String cheese, String herbs, String mayo) {
        Bun = bun;
        Meat = meat;
        Cheese = cheese;
        Herbs = herbs;
        Modificator = 2;
        Mayo = mayo;
        System.out.println("The Doublemeat burger of your choice consists of :" + " " + Bun + ", " + Meat + " x" +modificator + ", " + Cheese + ", " + Herbs + ", " + Mayo + ".");
    }
}
