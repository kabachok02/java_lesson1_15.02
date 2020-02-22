package lesson2.classwork;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.age = 3;
        cat.name = "Barsik";

        System.out.println(cat);

        System.out.println(cat.age);
        System.out.println(cat.name);

        cat.run();

    }
}
