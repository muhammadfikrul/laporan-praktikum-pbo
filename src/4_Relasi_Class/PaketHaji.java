
public class PaketHaji {

    public String paket;

    public PaketHaji() {
    }

    public PaketHaji(String paket) {
        this.paket = paket;
    }

    /**
     *
     * @param paket
     */

    public String info() {
        String info = "\n";
        info += "Biaya: " + paket + "\n";
        return info;
    }
}
