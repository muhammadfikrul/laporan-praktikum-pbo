package percobaan1234;

/**
 *
 * @author muhammadFikrulHaqi
 */
public class PermanentEmployee1941723005Fikrul extends Employee1941723005Fikrul implements Payable1941723005Fikrul{
    private int salary;
    
    public PermanentEmployee1941723005Fikrul(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    @Override
    public int getPaymentAmount(){
        return (int) (salary+0.05*salary);
    }
    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as permanent employee with salary "+salary+"\n";
        return info;
    }
    
}
