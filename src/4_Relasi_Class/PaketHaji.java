public class PaketHaji {

    private String paket;

    public PaketHaji() {
    }

    public PaketHaji(String paket) {
        this.paket = paket;
    }    
    
    public String getPaket() {
        return paket;
    }

    public void setPaket(String paket) {
        this.paket = paket;
    }
    
    public String info(){
        String info = "";
        info += this.paket;
        return info;
    }
}
