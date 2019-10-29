package interfacelatihan;
/**
 *
 * @author muham
 */
public class Program21941723005Fikrul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Rektor1941723005Fikrul pakRektor = new Rektor1941723005Fikrul();
        
        Sarjana1941723005Fikrul sarjanaCumlaude = new Sarjana1941723005Fikrul("Dini");
        PascaSarjana1941723005Fikrul masterCumlaude = new PascaSarjana1941723005Fikrul("Elok");
 
        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres(masterCumlaude);
        
    }

}

