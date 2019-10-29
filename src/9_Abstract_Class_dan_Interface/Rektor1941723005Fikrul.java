package interfacelatihan;

/**
 *
 * @author muham
 */
public class Rektor1941723005Fikrul {

    public void beriSertifikatCumlaude(ICumlaude1941723005Fikrul mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! Bagaimana Anda bisa cumlaude?");
        
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("---------------------------------------------");
    }

    public void beriSertifikatMawapres(IBerprestasi1941723005Fikrul mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! Bagaimana Anda bisa cumlaude?");

        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();

        System.out.println("---------------------------------------------");
    }
}
