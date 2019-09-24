
public class BiayaHaji {

    private String biaya;
    public AnggotaHaji anggota;

    public AnggotaHaji getAnggota() {
        return anggota;
    }

    public void setAnggota(AnggotaHaji anggota) {
        this.anggota = anggota;
    } 

    public String getBiaya() {
        return biaya;
    }

    public void setBiaya(String biaya) {
        this.biaya = biaya;
    }

    /**
     *
     * @param biaya
     */
    public String info() {
        String info = "\n";
        info += "Biaya: " + biaya + "\n";
        return info;
    }

}
