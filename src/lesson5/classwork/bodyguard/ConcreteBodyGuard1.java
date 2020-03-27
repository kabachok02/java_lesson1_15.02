package lesson5.classwork.bodyguard;

public class ConcreteBodyGuard1 extends BodyGuard {

    public ConcreteBodyGuard1(Gun gun) {
        super(gun);
    }

    @Override
    void applyMartialArts(Attacker attacker) {
        boxing();
    }

    private void boxing() {
        System.out.println("boxing");
    }


}
