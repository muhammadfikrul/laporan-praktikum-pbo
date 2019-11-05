package percobaan1234;

/**
 *
 * @author muhammadFikrulHaqi
 */
public class InternshipEmployee1941723005Fikrul extends Employee1941723005Fikrul {

    private int lenght;

    public InternshipEmployee1941723005Fikrul(String name, int lenght) {
        this.lenght = lenght;
        this.name = name;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo() + "\n";
        info += "Registered as internship employee for " + lenght + " month/s\n";
        return info;
    }

}
