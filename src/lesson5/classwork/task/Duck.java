package lesson5.classwork.task;

public class Duck implements Flyable, Swimmable, Runnable, Element {
    @Override
    public void fly() {
        System.out.println("duck fly");
    }

    @Override
    public void swim() {
        System.out.println("duck swim");
    }

    @Override
    public void run() {
        System.out.println("duck run");
    }
}
