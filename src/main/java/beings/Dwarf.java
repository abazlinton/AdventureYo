package beings;

public class Dwarf extends Player {

    @Override
    public void takeDamage(float damage) {
        super.takeDamage(damage / 2);
    }
}
