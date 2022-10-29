package HW17;

public class Main {
    public static void main(String[] args) {
        User [] users = new User[2];
        users[0] = new User("User1",new Androids());
        users[1] = new User("User2",new Iphones());
        for (User u:users
             ) {u.getSmartphones().sendSms("Happy Easter");
        }
        for (User u:users
        ) {u.getSmartphones().makeAcall("Good Day");
        }
        for (User u:users
        ) {u.getSmartphones().surf("www.mobile.de");
        }

    }
}
