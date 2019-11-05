package percobaan1234;

/**
 *
 * @author muhammadFikrulHaqi
 */
public class Owner1941723005Fikrul {

    public void pay(Payable1941723005Fikrul p) {
        System.out.println("Total payment = " + p.getPaymentAmount());
        if (p instanceof ElectricityBill1941723005Fikrul) {
            ElectricityBill1941723005Fikrul eb = (ElectricityBill1941723005Fikrul) p;
            System.out.println("" + eb.getBillInfo());
        } else if (p instanceof PermanentEmployee1941723005Fikrul) {
            PermanentEmployee1941723005Fikrul pe = (PermanentEmployee1941723005Fikrul) p;
            pe.getEmployeeInfo();
            System.out.println("" + pe.getEmployeeInfo());

        } else {
            System.out.println("Mbuh!!!");
        }
    }

    public void showMyEmployee(Employee1941723005Fikrul e) {
        System.out.println("" + e.getEmployeeInfo());
        if (e instanceof PermanentEmployee1941723005Fikrul) {
            System.out.println("You have to pay her/him monthly!!!");
        } else {
            System.out.println("No need to pay him/her :) ");
        }
    }
}
