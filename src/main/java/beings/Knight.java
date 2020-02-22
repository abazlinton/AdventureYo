package beings;

public class Knight extends Player {

    @Override
    public double getAttackingDamage() {
        return super.getAttackingDamage() * 2;
    }
}
