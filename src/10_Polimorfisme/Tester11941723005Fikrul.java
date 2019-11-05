package percobaan1234;

/**
 *
 * @author muhammadFikrulHaqi
 */
public class Tester11941723005Fikrul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PermanentEmployee1941723005Fikrul pEmp = new PermanentEmployee1941723005Fikrul("Dedik", 500);
        InternshipEmployee1941723005Fikrul iEmp = new InternshipEmployee1941723005Fikrul("Sunarto", 5);
        ElectricityBill1941723005Fikrul eBill = new ElectricityBill1941723005Fikrul(5, "A-1");
        Employee1941723005Fikrul e;
        Payable1941723005Fikrul p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }

}
