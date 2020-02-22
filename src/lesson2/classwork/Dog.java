package lesson2.classwork;

public class Dog {

    private String color;
    private String breed;

    private int weight;
    private int strength;

    private Dog () {
    }

    public Dog(String color, String breed, int weight, int strength) {
        this.color = color;
        this.breed = breed;
        this.weight = weight;
        this.strength = strength;
    }

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {  //Геттер 1 (возвращает)
        return this.color;
    }

    public String getBreed() {  //Геттер 2
        return this.breed;
    }

    public void setColor(String color) { //Сеттер 1 (устанавливает)
        this.color = color;
    }

    private void setBreed(String breed) { // Сеттер 1
        this.breed = breed;
    }


    public String fight(Dog dog) {
        if (this.strength > dog.strength) {
            return this.breed;
        }
        return dog.breed;
    }
}
