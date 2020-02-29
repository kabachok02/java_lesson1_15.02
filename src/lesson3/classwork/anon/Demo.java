package lesson3.classwork.anon;

import lesson3.classwork.Bicycle;

public class Demo {

    public void show() {
        System.out.println("Show demo");
    }

    public void print(Bicycle bicycle) {
        String bicycleString = bicycle.toString();
        System.out.println(bicycleString);
    }
}
