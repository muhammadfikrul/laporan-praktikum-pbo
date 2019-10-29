package interfacelatihan;

/**
 *
 * @author muham
 */
public class PascaSarjana1941723005Fikrul extends Mahasiswa1941723005Fikrul implements ICumlaude1941723005Fikrul, IBerprestasi1941723005Fikrul {

    public PascaSarjana1941723005Fikrul(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,71");
    }

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");
    }

}
