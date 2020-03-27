package lesson5.homework.zoo;

public class Duck implements Fly, Run, Element {
    @Override
    public void fly() {
        System.out.println("Duck fly");
    }

    @Override
    public void run() {
        System.out.println("Duck run");
    }
}
