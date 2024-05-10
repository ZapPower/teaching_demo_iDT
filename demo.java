public class demo {
    public static void main(String[] args) {
        monster myMonster = new monster("Jerry", 20);
        myMonster.heal(10);
        while (!myMonster.isDefeated()) {
            System.out.println(myMonster.getName() + " has " + myMonster.getHealth() + " health!");
            myMonster.takeDamage(10);
        }
        myMonster.heal(5);
    }
}