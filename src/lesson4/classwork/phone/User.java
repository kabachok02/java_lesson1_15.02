package lesson4.classwork.phone;

public class User {

    String name;

    public User(String name) {
        this.name = name;
    }

    public void callAnotherUser(int number, AbstractPhone phone){
        phone.call(number);
    }

}
