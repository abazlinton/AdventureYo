package beings;

public abstract class Player {

    private double health;
    private double attackingDamage;

    public Player() {
        this.health = 100;
        this.attackingDamage = 10;
    }

    public double getHealth() {
        return health;
    }

    public void takeDamage(float damage) {
        this.health -= damage;
    }

    public double getAttackingDamage(){
        return 10;
    }
}
