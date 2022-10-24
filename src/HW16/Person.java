package HW16;

public class Person {
    private String firstName;
    public String lastName;
    private int dayOftheBirth;
    private int monthOftheBirth;
    private int yearOftheBirth;
    private String email;
    private String phoneNumber;
    public double weight;
    public String presure;
    public int countOfSteps;
    public int age;
    int defYear;

    {
        defYear = 2022 - age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getDayOftheBirth() {
        return dayOftheBirth;
    }

    public void setDayOftheBirth(int dayOftheBirth) {
        this.dayOftheBirth = dayOftheBirth;
    }

    public int getMonthOftheBirth() {
        return monthOftheBirth;
    }

    public void setMonthOftheBirth(int monthOftheBirth) {
        this.monthOftheBirth = monthOftheBirth;
    }

    public int getYearOftheBirth() {
        return yearOftheBirth;
    }

    public void setYearOftheBirth(int yearOftheBirth) {
        this.yearOftheBirth = yearOftheBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
