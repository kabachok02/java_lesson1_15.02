package lesson5.classwork.bodyguard;

public class ConcreteBodyGuard extends BodyGuard {

    public ConcreteBodyGuard(Gun gun) {
        super(gun);
    }

    @Override
    void applyMartialArts(Attacker attacker) {
        karate();
    }

    private void karate() {
        System.out.println("karate");
    }


}
