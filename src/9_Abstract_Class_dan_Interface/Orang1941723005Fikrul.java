package pbominggu9.abstractclass;

/**
 *
 * @author muham
 */
public class Orang1941723005Fikrul {

    private String nama;
    private Hewan1941723005Fikrul hewanPeliharaan;

    public Orang1941723005Fikrul(String nama) {
        this.nama = nama;
    }

    public void peliharaHewan(Hewan1941723005Fikrul hewanPeliharaan) {
        this.hewanPeliharaan = hewanPeliharaan;
    }

    public void ajakPeliharaanJalanJalan() {
        System.out.println("Namaku " + this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara: ");
        this.hewanPeliharaan.bergerak();
        System.out.println("-----------------------------------------");
    }
}
