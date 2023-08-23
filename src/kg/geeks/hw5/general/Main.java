package kg.geeks.hw5.general;
import kg.geeks.hw5.templates.Hero;
import kg.geeks.hw5.templates.Boss;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setDefenceType("Magical");

        System.out.println("Boss Info:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defence Type: " + boss.getDefenceType());

        Hero[] heroes = createHeroes();
        System.out.println("\nHeroes Info:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth());
            System.out.println("Damage: " + hero.getDamage());
            System.out.println("Superpower: " + hero.getSuperpower());
            System.out.println();
        }
    }
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(200, 20, "Flying");
        Hero hero2 = new Hero(150, 15);
        Hero hero3 = new Hero(180, 18, "Invisibility");

        return new Hero[] {hero1, hero2, hero3};
    }
}
