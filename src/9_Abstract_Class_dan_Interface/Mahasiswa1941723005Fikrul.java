package interfacelatihan;

/**
 *
 * @author muham
 */
public class Mahasiswa1941723005Fikrul implements ICumlaude1941723005Fikrul {

    protected String nama;

    public Mahasiswa1941723005Fikrul(String nama) {
        this.nama = nama;
    }

    public void kuliahDiKampus() {
        System.out.println("Aku mahasiswa, namaku " + this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI"); 
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,51"); 
    }

}
