package lesson4.classwork.phone;

public class CellPhone extends WirelessPhone {


    public CellPhone(int year, int hours) {
        super(year, hours);
    }

    @Override
    public void call(int number) {
        System.out.println("Вызываю " + number);

        }

    @Override
    public void ring(int number) {
        System.out.println("Звонит " + number);

    }
}
