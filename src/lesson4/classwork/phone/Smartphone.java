package lesson4.classwork.phone;

public class Smartphone extends CellPhone {

    private String os;

    public Smartphone(int year, int hours, String os) {
        super(year, hours);
        this.os = os;
    }

    public void install(String app) {
        System.out.println("Устанавливаю " + app);
        unpack();
        removeFiles();
    }

    private void unpack() {

    }

    private void removeFiles() {

    }
}
