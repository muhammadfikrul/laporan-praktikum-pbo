
package Tugas.polimorfisme;

/**
 *
 * @author muhammadFikrulHaqi
 */
public class JumpingZombie1941723005Fikrul extends Zombie1941723005Fikrul {
    public JumpingZombie1941723005Fikrul (int health, int level){
        this.level = level;
        this.health = health;
    }
    public void healFikrul(){
        if (level == 1){
            health += health*0.2;
        }else if (level == 2){
            health += health*0.3;
        }else if (level == 3){
            health += health*0.4;
        }
    }
    public void destroyedFikrul(){
        health -= health*0.093;
    }
    public String getZombieInfoFikrul(){
        String info = "Jumping Zombie Data = ";
        info += super.getZombieInfoFikrul()+"\n";
        return info;
    }
}
