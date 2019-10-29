package interfacelatihan;

/**
 *
 * @author muham
 */
public class Sarjana1941723005Fikrul extends Mahasiswa1941723005Fikrul implements ICumlaude1941723005Fikrul, IBerprestasi1941723005Fikrul {

    public Sarjana1941723005Fikrul(String nama) {
        super(nama);
    }
    
    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,51");
    }

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("");
    }

}
