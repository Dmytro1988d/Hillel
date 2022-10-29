package HW17;

public class User {
    private String name;
    private Smartphones smartphones;


    public User(String name, Smartphones smartphones) {
        this.name = name;
        this.smartphones = smartphones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Smartphones getSmartphones() {
        return smartphones;
    }

    public void setSmartphones(Smartphones smartphones) {
        this.smartphones = smartphones;
    }
}
