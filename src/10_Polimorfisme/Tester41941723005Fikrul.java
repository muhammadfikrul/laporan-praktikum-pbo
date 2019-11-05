package percobaan1234;

/**
 *
 * @author muhammadFikrulHaqi
 */
public class Tester41941723005Fikrul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Owner1941723005Fikrul ow = new Owner1941723005Fikrul();
        ElectricityBill1941723005Fikrul eBill = new ElectricityBill1941723005Fikrul(5, "R-1");
        ow.pay(eBill);
        System.out.println("--------------------------------------------------------------");

        PermanentEmployee1941723005Fikrul pEmp = new PermanentEmployee1941723005Fikrul("Dedik", 500);
        ow.pay(pEmp);
        System.out.println("--------------------------------------------------------------");

        InternshipEmployee1941723005Fikrul iEmp = new InternshipEmployee1941723005Fikrul("Sunarto", 5);
        ow.showMyEmployee(pEmp);
        System.out.println("--------------------------------------------------------------");
        ow.showMyEmployee(iEmp);

        ow.pay((Payable1941723005Fikrul) iEmp);
    }

}
