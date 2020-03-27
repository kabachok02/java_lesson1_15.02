package lesson5.classwork.bodyguard;

public class Main {

    public static void main(String[] args) {

        BodyGuard bodyGuard1 = new ConcreteBodyGuard(new Gun());
        BodyGuard bodyGuard2 = new ConcreteBodyGuard1(new Gun());

        Attacker attacker = new Attacker();

        bodyGuard1.saveClientLife(attacker);
        bodyGuard2.saveClientLife(attacker);

        Attacker attacker1 = new Attacker(new Gun());

        bodyGuard1.saveClientLife(attacker);
        bodyGuard2.saveClientLife(attacker);






    }


}
