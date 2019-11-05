package percobaan1234;

/**
 *
 * @author muhammadFikrulHaqi
 */
public class ElectricityBill1941723005Fikrul implements Payable1941723005Fikrul {

    private int kwh;
    private String category;

    public ElectricityBill1941723005Fikrul(int kwh, String category) {
        this.kwh = kwh;
        this.category = category;
    }

    public int getKwh() {
        return kwh;
    }

    public void setKwh(int kwh) {
        this.kwh = kwh;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getBasePrice() {
        int bPrice = 0;
        switch (category) {
            case "R-1":
                bPrice = 100;
                break;
            case "R-2":
                bPrice = 200;
                break;
        }
        return bPrice;
    }

    public String getBillInfo() {
        return "kWH = " + kwh + "\n"
                + "Category = " + category + "(" + getBasePrice() + " per kWH)\n";
    }

    @Override
    public int getPaymentAmount() {
        return kwh * getBasePrice();
    }
}
