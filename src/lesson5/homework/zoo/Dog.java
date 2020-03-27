package lesson5.homework.zoo;

public class Dog implements Run, Element {
    @Override
    public void run() {
        System.out.println("Dog runs");
    }
}
