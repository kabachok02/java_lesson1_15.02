package lesson5.classwork.Chess.interfaces;

import lesson5.classwork.interfaces.Drawable;

public class Main {

    public static void main(String[] args) {





    }

    public static void draw(Drawable drawable) {
        drawable.draw();
    }

    public static boolean compareValues(HasValue value1, HasValue value2) {
        if (value1.getValue() > value2.getValue()) {
            return true;
        }
        return false;
    }
}
