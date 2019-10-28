public class BiayaHaji {

    private String biaya;

    public BiayaHaji() {
    }

    public BiayaHaji(String biaya) {
        this.biaya = biaya;
    }

    public String getBiaya() {
        return biaya;
    }

    public void setBiaya(String biaya) {
        this.biaya = biaya;
    }
    
    public String info(){
        String info = "";
        info += this.biaya;
        return info;
    }

}
