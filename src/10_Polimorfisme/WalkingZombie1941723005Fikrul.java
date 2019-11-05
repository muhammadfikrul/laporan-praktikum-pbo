
package Tugas.polimorfisme;

/**
 *
 * @author muhammadFikrulHaqi
 */
public class WalkingZombie1941723005Fikrul extends Zombie1941723005Fikrul{
    public WalkingZombie1941723005Fikrul(int health, int level){
        this.health = health;
        this.level = level;
    }
    @Override
    public void healFikrul(){
        if (level == 1){
            health += health*0.2;
        }else if (level == 2){
            health += health*0.3;
        }else if (level == 3){
            health += health*0.4;
        }
    }   
    @Override
    public void destroyedFikrul(){
        health -= health*0.19;
    }
    @Override
    public String getZombieInfoFikrul(){
        String info = "Walking Zombie Data = ";
        info += super.getZombieInfoFikrul()+"\n";
        return info;
    }
}
