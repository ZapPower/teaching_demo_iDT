public class monster {
    private int health;
    private String name;

    public monster(String name, int health) {
        this.health = health;
        this.name = name;
    }

    public void takeDamage(int amount) {
        this.health -= amount;
    }

    public int getHealth() {
        return this.health;
    }

    public String getName() {
        return this.name;
    }
}
