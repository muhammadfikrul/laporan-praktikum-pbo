
public class TahunKeberangkatan {

    private String tahun;
    private PaketHaji paket;

    public TahunKeberangkatan() {
    }

    public TahunKeberangkatan(String tahun, PaketHaji paket) {
        this.tahun = tahun;
        this.paket = paket;
    }

    public PaketHaji getPaket() {
        return paket;
    }

    public void setPaket(PaketHaji paket) {
        this.paket = paket;
    }
    
    public String getTahun() {
        return this.tahun;
    }

    /**
     *
     * @param tahun
     * @param paket
     */
    public void setTahun(String tahun, PaketHaji paket) {
        this.tahun = tahun;
        this.paket = paket;
    }

    public String info() {
        String info = "\n";

        info += "Tahun: " + tahun + "\n";
        info += "Paket: " + paket + "\n";
        return info;
    }
}
