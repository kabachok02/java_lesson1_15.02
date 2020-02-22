package lesson2.classwork;

public class Person {

    private static int PERSON_COUNT;

    public String name;
    public int age;

    public Person() {
        name = "Default name";
        age = 30;
        PERSON_COUNT ++;
    }

    public Person(int age) {
        this.age = age;
        PERSON_COUNT ++;
    }

    public Person(String name) {
        this.name = name;
        PERSON_COUNT ++;
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
        PERSON_COUNT ++;
    }

    public void print() {
        System.out.println(this.name);
    }

    public static void printPersonCount() {
        System.out.println("Person count: " + PERSON_COUNT);
    }

    public String toString() {
        return "Person: " + this.name + ", " + age + ", " + super.toString();
    }




}
