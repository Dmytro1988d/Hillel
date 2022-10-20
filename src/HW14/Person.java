package HW14;

import java.util.Scanner;

public class Person {
    public String personName;
    public String personsecondName;
    public String city;
    public int phonenumber;

    public void personinfo () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type First Name Person");
        personName = scanner.nextLine();
        System.out.println("Type Second Name Person");
        personsecondName = scanner.nextLine();
        System.out.println("Type city Person");
        city = scanner.nextLine();
        System.out.println("Type Phonenumber Person");
        phonenumber = scanner.nextInt();
    }
    public void personinfosay (){
        System.out.println("You can call to mr.(ms.)" + " " + personName + " " + personsecondName + " " + "from city " + city + " " + "By phonenumber" + " " + "+" + phonenumber);
    }
}
