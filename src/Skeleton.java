public class Skeleton extends Boss{
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        if (arrows>0){
            this.arrows = arrows;
        }
    }
    @Override
    public void printInfo(){
        System.out.println( "Это скелет Здоровье " + super.getDamage()+ " Урон "+super.getHealth()+" Тип оружия "+ weapon.getWeaponType() + " Название оружия "+ weapon.getWeaponName()+" Количество стрел "+ arrows);
    }
}
