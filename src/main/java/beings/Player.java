package beings;

public abstract class Player {

    private double health;

    public Player() {
        this.health = 100;
    }

    public double getHealth() {
        return health;
    }
}
