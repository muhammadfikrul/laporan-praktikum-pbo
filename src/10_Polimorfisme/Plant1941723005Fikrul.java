
package Tugas.polimorfisme;

/**
 *
 * @author muhammadFikrulHaqi
 */
public class Plant1941723005Fikrul {
    public void doDestroyFikrul (Destroyable1941723005Fikrul d){
        if (d instanceof WalkingZombie1941723005Fikrul){
            WalkingZombie1941723005Fikrul wz = (WalkingZombie1941723005Fikrul) d;
            wz.destroyedFikrul();
        }else if (d instanceof JumpingZombie1941723005Fikrul){
            JumpingZombie1941723005Fikrul jz = (JumpingZombie1941723005Fikrul) d;
            jz.destroyedFikrul();
        }else if (d instanceof Barrier1941723005Fikrul){
            Barrier1941723005Fikrul b = (Barrier1941723005Fikrul) d;
            b.destroyedFikrul();
        }
    }
}
