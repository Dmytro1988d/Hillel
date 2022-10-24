package HW16;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Dmytro","Bolshoi",2,9,1988,"dbolshoy1988@gmail.com", "80989991233", 80, "120/80", 3335);
        person.printAccountInfo();

        Person person1 = new Person("Oleg","Vinnik",4,5,1975,"oleg@gfdsfm.com", "38096734849", 67, "118/33",9999);
        person1.printAccountInfo();

        Person person2 = new Person("Kostya","Gnedash",17,10,1987,"kostya@mail.ru","380973334456",92, "123/44",5563);
        person2.printAccountInfo();

        person.setLastName("Sezam");
        person2.setLastName("Ivanov");
        person.printAccountInfo();
        person2.printAccountInfo();
    }
}
