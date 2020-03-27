package lesson5.homework.zoo;

public class Tiger implements Run, Climb, Element {

    @Override
    public void climb() {
        System.out.println("Tiger climbs");
    }

    @Override
    public void run() {
        System.out.println("Tiger runs");
    }
}
