package lesson3.classwork.memory;

import lesson3.classwork.Bicycle;
import lesson3.classwork.anon.Demo;

public class MemoryTest {

    public static void main(String[] args) {

        int number = 123;

        Bicycle bicycle = new Bicycle(10, "model12");

        Demo demo = new Demo();
        demo.print(bicycle);

    }

}
