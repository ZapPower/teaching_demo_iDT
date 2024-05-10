public class monster {
    private int health;
    private String name;
    private boolean defeated;

    public monster(String name, int health) {
        this.health = health;
        this.name = name;
        defeated = false;
    }

    public void takeDamage(int amount) {
        this.health -= amount;
        if (health <= 0) {
            System.out.println(this.name + " was defeated!");
            this.defeated = true;
        }
    }

    public void heal(int amount) {
        if (health <= 0) {
            System.out.println(this.name + " was already defeated!");
            return;
        }
        this.health += amount;
    }

    public int getHealth() {
        return this.health;
    }

    public String getName() {
        return this.name;
    }

    public boolean isDefeated() {
        return this.defeated;
    }
}
