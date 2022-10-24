package HW16;

public class Person {
    private final String firstName;
    public String lastName;
    private final int dayOftheBirth;
    private final int monthOftheBirth;
    private final int yearOftheBirth;
    private final String email;
    private final String phoneNumber;
    private double weight;
    private String presure;
    private int countOfSteps;
    int defYear = 2022;

    public String getFirstName() {
        return firstName;
    }

    public int getDayOftheBirth() {
        return dayOftheBirth;
    }

    public int getMonthOftheBirth() {
        return monthOftheBirth;
    }

    public int getYearOftheBirth() {
        return yearOftheBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPresure() {
        return presure;
    }

    public void setPresure(String presure) {
        this.presure = presure;
    }

    public int getCountOfSteps() {
        return countOfSteps;
    }

    public void setCountOfSteps(int countOfSteps) {
        this.countOfSteps = countOfSteps;
    }

    public Person(String firstName, String lastName, int dayOftheBirth, int monthOftheBirth, int yearOftheBirth, String email, String phoneNumber, double weight, String presure, int countOfSteps) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOftheBirth = dayOftheBirth;
        this.monthOftheBirth = monthOftheBirth;
        this.yearOftheBirth = yearOftheBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.weight = weight;
        this.presure = presure;
        this.countOfSteps = countOfSteps;
    }

    public int getAge() {
        return defYear-getYearOftheBirth();
    }


    public void printAccountInfo(){
        System.out.println(getFirstName() + " " + getLastName() + ", " + getDayOftheBirth() + "." + getMonthOftheBirth() + "." + getYearOftheBirth() + " year of birth"
                + ", phone number:" + getPhoneNumber() + ", email:" + getEmail() + ", weight " + getWeight() + "kg" + ", presure " + getPresure() + "pA" + ", total Steps " + getCountOfSteps() + ".");
        System.out.println("Age of person " + getFirstName() + " " + getLastName() + " is " + getAge() + " years.");
    }

}
