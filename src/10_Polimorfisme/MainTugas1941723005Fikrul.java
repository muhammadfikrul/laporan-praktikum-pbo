
package Tugas.polimorfisme;

/**
 *
 * @author muhammadFikrulHaqi
 */
public class MainTugas1941723005Fikrul {

    public static void main(String[] args) {
        WalkingZombie1941723005Fikrul wz = new WalkingZombie1941723005Fikrul(100,1);
        JumpingZombie1941723005Fikrul jz = new JumpingZombie1941723005Fikrul(100,2);
        Barrier1941723005Fikrul b = new Barrier1941723005Fikrul(100);
        Plant1941723005Fikrul p = new Plant1941723005Fikrul();
        System.out.println(""+wz.getZombieInfoFikrul());
        System.out.println(""+jz.getZombieInfoFikrul());
        System.out.println(""+b.getBarrierInfoFikrul());
        System.out.println("---------------------");
        for (int i = 0; i<4; i++){
            p.doDestroyFikrul(wz);
            p.doDestroyFikrul(jz);
            p.doDestroyFikrul(b);
        }
        System.out.println(""+wz.getZombieInfoFikrul());
        System.out.println(""+jz.getZombieInfoFikrul());
        System.out.println(""+b.getBarrierInfoFikrul());
    } 
}
