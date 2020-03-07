package lesson4.classwork.phone;

public class Main {


    public static void main(String[] args) {

        AbstractPhone thomasEdisonPhone = new ThomasEdisonPhone(1879);
        AbstractPhone phone = new Phone(1984);
        AbstractPhone smartphone = new Smartphone(2016, 12, "ios");

        User user = new User("Vova");

        user.callAnotherUser(102, thomasEdisonPhone);
        user.callAnotherUser(103, phone);
        user.callAnotherUser(101, smartphone);


    }

}
