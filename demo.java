public class demo {
    public static void main(String[] args) {
        monster myMonster = new monster("Jerry", 20);
        monster myMonster2 = new monster("John", 10);
        System.out.println(myMonster.getName() + " has " + myMonster.getHealth() + " health!");
        myMonster2.heal(10);
        System.out.println(myMonster2.getName() + " has " + myMonster2.getHealth() + " health!");
    }
}