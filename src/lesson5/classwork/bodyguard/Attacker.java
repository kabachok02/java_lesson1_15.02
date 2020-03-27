package lesson5.classwork.bodyguard;

public class Attacker {

    Gun gun;

    public Attacker(){
    }

    public Attacker(Gun gun){
        this.gun = gun;
    }

    public boolean hasGun() {
        return  this.gun != null;
    }

}
