package lesson2.classwork;

public class DogTest {

    public static void main(String[] args) {
        Dog dog = new Dog("black", "mastiff 1", 10, 20 );
        Dog dog2 = new Dog("brown", "mastiff 2", 10, 25 );

        System.out.println(dog.getBreed());
        System.out.println(dog.getColor());

        dog.setColor("white");

        System.out.println(dog.getColor());
        System.out.println(dog.getBreed());

        System.out.println(dog.fight(dog2) + " won!");





    }
}
