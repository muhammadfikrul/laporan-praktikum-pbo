
package Tugas.polimorfisme;

/**
 *
 * @author muhammadFikrulHaqi
 */
public abstract class Zombie1941723005Fikrul implements Destroyable1941723005Fikrul { 
    protected int health;    
    protected int level;     
    
    public String getZombieInfoFikrul(){  
        return "\nHealth = "+health+"\nLevel = "+level;
    }         
    public abstract void healFikrul();    
    @Override    
    public abstract void destroyedFikrul(); 
} 
   
