public class Boss extends GameEntity{
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void printInfo(){
        System.out.println( "Это босс Здоровье " + super.getDamage()+ " Урон "+super.getHealth()+" Тип оружия "+ getWeapon().getWeaponType() + " Название оружия "+ getWeapon().getWeaponName());
    }
}
