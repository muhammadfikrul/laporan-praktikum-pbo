
package Tugas.polimorfisme;

/**
 *
 * @author muhammadFikrulHaqi
 */
public class Barrier1941723005Fikrul implements Destroyable1941723005Fikrul {
    private int strength;
    
    public Barrier1941723005Fikrul (int strength){
        this.strength = strength;
    }
    public void setStrengthFikrul (int strength){
        this.strength = strength;
    }
    public int getStrengthFikrul(){
        return strength;
    } 
    public void destroyFikrul(){
        strength -= strength*0.1;
    }  
    @Override
    public void destroyedFikrul(){
        destroyFikrul();
    }
    public String getBarrierInfoFikrul(){
        return "Barrier Strength = "+strength+"\n";
    }
}
