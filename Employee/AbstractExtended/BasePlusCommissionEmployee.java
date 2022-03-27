// subclass of commission employee, which is a subclass of Employee
// Indirect subclass of Employee

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    // constructor
    public BasePlusCommissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, double grossSales, double commissionRate,
            double baseSalary){
        super(firstName, lastName, socialSecurityNumber, grossSales,
                commissionRate);

        if (baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be over zero.");
        }
        this.baseSalary = baseSalary;
    } // end constructor

    public void setBaseSalary(double baseSalary){
        if (baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be over zero.");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    // override abstract earnings-method
    @Override
    public double earnings(){ // just need to add the baseSalary
        return getBaseSalary() + super.earnings();
    } // end earnings

    @Override
    public String toString(){
        return String.format(
                "Base salaried commission employee.%n" +
                "%s%nBase salary: %,.2f",
                super.toString(), getBaseSalary());
    } // end toString
} // end class
