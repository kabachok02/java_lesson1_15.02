package lesson3.classwork;

import javax.print.DocFlavor;

public class Bicycle {

    int weight;
    String model;

    public Bicycle(int weight, String model) {
        this.weight = weight;
        this.model = model;
    }

    public void ride() {

    }

    class SteeringWheel {

        public void left() {
            System.out.println("left");
        }

        public void right() {
            System.out.println("right");
        }

    }

    class Seat {

        public void up() {
            System.out.println("up");
        }

        public void down() {
            System.out.println("down");
        }

    }

    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle(10, "model1");

        Seat seat = bicycle.new Seat();






    }

}
