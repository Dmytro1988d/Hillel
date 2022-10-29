package HW17;

public class Androids implements Smartphones, LinuxOs {
    @Override
    public void sendSms(String sms) {
        System.out.println("you send sms by Android");

    }

    @Override
    public void makeAcall(String call) {
        System.out.println("ypu call by Android");


    }

    @Override
    public void surf(String surfing) {
        System.out.println("you surf by Android");

    }
}

