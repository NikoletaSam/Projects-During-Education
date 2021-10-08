package DefiningClasses.Ex.Google;

import java.text.DecimalFormat;

public class Company {
    private String companyName;
    private String department;
    private double salary;

    public Company(String companyName, String department, double salary) {
        this.companyName = companyName;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.companyName + " "
                + this.department + " "
                + new DecimalFormat("0.00").format(this.salary) + System.lineSeparator();
    }
}
