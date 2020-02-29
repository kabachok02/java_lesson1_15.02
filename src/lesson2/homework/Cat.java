package lesson2.homework;

import java.io.CharArrayReader;

public class Cat {

    private String name;
    public String color;
    public String address;
    private int weight;
    private int age;
    private int averageWeight = 5;
    private int averageAge = 2;



    public Cat (String name) {
        this.name = name;
        this.age = averageAge;
        this.weight = averageWeight;
    }

    public Cat (String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat (String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = averageWeight;
    }

    public Cat (int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Cat (int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {
        Cat cat = new Cat ("Барсик");
        System.out.println(cat.name + ", возраст предположительно " + cat.age + " года, примерный вес " + cat.weight + " кг" );

        Cat cat1 = new Cat ("Марс", 4, 1);
        System.out.println(cat.name + ", вес " + cat.weight + " кг, возвраст " + cat.age + " лет" );

        Cat cat2 = new Cat("Мурчик", 2);
        System.out.println(cat.name + " возраст " + cat.age + " года, вес примерно " + cat.weight + " кг");

        Cat cat3 = new Cat(3, "белый");
        System.out.println("Имя неизвестно, вес " + cat.weight + " кг, примерный возраст " + cat.age + " лет, цвет шерсти " + cat.color);

        Cat cat4 = new Cat(2, "черный", "Пушкина 3");
        System.out.println("Имя неизвестно, вес " + cat.weight + " кг, цвет шерсти " + cat.color + " адрес хозяина " + cat.address);

    }





}
