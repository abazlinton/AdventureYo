package items;

public class Sword extends Weapon {

    private double damageInflicted;

    public Sword() {
        this.damageInflicted = 10;
    }

    @Override
    public double getDamageInflicted() {
        return this.damageInflicted;
    }
}
