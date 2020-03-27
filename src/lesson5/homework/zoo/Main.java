package lesson5.homework.zoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Please choose the animal: Cat, Dog, Duck or Tiger");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();

        Element element = createObject(input);

        if (element instanceof Climb) {
            ((Climb) element).climb();
        }

        if (element instanceof Fly) {
            ((Fly) element).fly();
        }

        if (element instanceof Run) {
            ((Run) element).run();
        }

    }

    public static Element createObject(String input) {
        switch (input) {
            case "Cat":
                return new Cat();
            case "Dog":
                return new Dog();
            case "Tiger":
                return new Tiger();
            case "Duck":
                return new Duck();
            default:
                throw new IllegalArgumentException("please enter correct animal");

        }

    }


}
