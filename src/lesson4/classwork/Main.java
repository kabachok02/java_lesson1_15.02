package lesson4.classwork;

public class Main {

    public static void main(String[] args) {

        Cow cow = new Whale();

        cow.printName();

        ((Whale) cow).whaleMethod();

    }

}
