package lesson2.classwork;

public class PersonTest {

    public static void main(String[] args) {

        Person person = new Person();

        System.out.println(person.name);
        System.out.println(person.age);

        Person person1 = new Person("With name");

        System.out.println(person1.name);

        Person person2 = new Person("With name and age", 25);

        System.out.println(person2.name + " " + person2.age);

        Person person3 = new Person(15);

        System.out.println("With only age " + person3.age);

        person1 = person;
        if (person == person1) {

        }


    }


}
