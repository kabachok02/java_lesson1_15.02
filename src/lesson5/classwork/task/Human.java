package lesson5.classwork.task;

public class Human implements Runnable, Swimmable, Element {
    @Override
    public void run() {
        System.out.println("human runs");
    }

    @Override
    public void swim() {
        System.out.println("human swims");
    }
}
