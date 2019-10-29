package pbominggu9.abstractclass;

/**
 *
 * @author muham
 */
public class Program1941723005Fikrul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kucing1941723005Fikrul kucingKampung = new Kucing1941723005Fikrul();
        Ikan1941723005Fikrul lumbaLumba = new Ikan1941723005Fikrul();
    
        Orang1941723005Fikrul ani = new Orang1941723005Fikrul("Ani");
        Orang1941723005Fikrul budi = new Orang1941723005Fikrul("Budi");
        
        ani.peliharaHewan(kucingKampung);
        budi.peliharaHewan(lumbaLumba);
        
        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
    
}
