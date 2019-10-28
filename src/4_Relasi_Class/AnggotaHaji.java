
public class AnggotaHaji {

    private String ktp;
    private String nama;
    BiayaHaji biaya;
    PaketHaji paket;
    TahunKeberangkatan tahun;

    public AnggotaHaji(String ktp, String nama, BiayaHaji biaya, PaketHaji paket, TahunKeberangkatan tahun) {
        this.ktp = ktp;
        this.nama = nama;
        this.biaya = biaya;
        this.paket = paket;
        this.tahun = tahun;
    }

    public String getKtp() {
        return ktp;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public BiayaHaji getBiaya() {
        return biaya;
    }

    public void setBiaya(BiayaHaji biaya) {
        this.biaya = biaya;
    }

    public PaketHaji getPaket() {
        return paket;
    }

    public void setPaket(PaketHaji paket) {
        this.paket = paket;
    }

    public TahunKeberangkatan getTahun() {
        return tahun;
    }

    public void setTahun(TahunKeberangkatan tahun) {
        this.tahun = tahun;
    }

    

    public String info() {
        String info = "\n";
        info += "Nama                : " + this.nama + "\n";
        info += "No. KTP             : " + this.ktp + "\n";
        info += "Paket Haji          : " + this.paket.info() + "\n";
        info += "Biaya Haji          : " + this.biaya.info() + "\n";
        info += "Tahun Keberangkatan : " + this.tahun.info() + "\n";
        return info;
    }

}
