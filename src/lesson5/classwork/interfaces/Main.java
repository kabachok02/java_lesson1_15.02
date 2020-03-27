package lesson5.classwork.interfaces;

public class Main {

    public static void main(String[] args) {

        Drawable cup = new Cup();
        Drawable lemon = new Lemon();

        cup.draw();

        if (cup instanceof Cup) {
            ((Cup) cup).cupMethod();
        }

        ((Cup)cup).cupMethod();
        lemon.draw();


    }


}
