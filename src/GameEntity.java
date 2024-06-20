public class GameEntity {
    private int health;
    private int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        if (damage>0){
            this.damage = damage;}
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health>0){
            this.health = health;}
    }
}
