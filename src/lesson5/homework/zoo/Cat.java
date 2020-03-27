package lesson5.homework.zoo;

public class Cat implements Climb, Run, Element {
    @Override
    public void climb() {
        System.out.println("Cat climbs");
    }

    @Override
    public void run() {
        System.out.println("Cat runs");
    }
}
