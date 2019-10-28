public class TahunKeberangkatan {

    private String tahun;

    public TahunKeberangkatan() {
    }

    public TahunKeberangkatan(String tahun) {
        this.tahun = tahun;
    }
    
    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }
    
    public String info(){
        String info = "";
        info += this.tahun;
        return info;
    }
}
