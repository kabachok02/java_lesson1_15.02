package lesson4.classwork.phone;

public abstract class AbstractPhone {

    private int year;

    public AbstractPhone(int year) {

        this.year = year;

    }

    public abstract void call(int number);

    public abstract void ring(int number);

    public int getYear() {
        return year;
    }

}
