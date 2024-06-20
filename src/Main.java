//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(900);
        boss.setDamage(90);
        boss.setWeapon(boss.weapon);
        boss.weapon.setWeaponName("Sword");
        boss.weapon.setWeaponType(WeaponType.Melee);
        boss.setDamage(90);
        boss.setHealth(9000);

        boss.printInfo();

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setArrows(11);
        skeleton1.setDamage(10);
        skeleton1.setHealth(100);
        skeleton1.weapon.setWeaponType(WeaponType.Ranged);
        skeleton1.weapon.setWeaponName("Bow");

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setArrows(25);
        skeleton2.setDamage(12);
        skeleton2.setHealth(90);
        skeleton2.weapon.setWeaponType(WeaponType.Ranged);
        skeleton2.weapon.setWeaponName("Bow");

        skeleton1.printInfo();
        skeleton2.printInfo();
    }
}