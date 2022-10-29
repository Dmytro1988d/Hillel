package HW17;

public class Iphones implements Smartphones, IOS{

    @Override
    public void sendSms(String sms) {
        System.out.println("You send sms by Iphones");

    }

    @Override
    public void makeAcall(String call) {
        System.out.println("you call by Iphones");


    }

    @Override
    public void surf(String surfing) {
        System.out.println("you surf by Iphones");


    }
}

