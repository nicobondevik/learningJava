// Example of inheritance
// This class is identical to CommissionEmployee, except that there is a base-salary.

public class BaseCommissionEmployee extends CommissionEmployee{
    private double baseSalary; // adding one private attribute

    // six argument constructor
    public BaseCommissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, double grossSales,
            double commissionRate, double baseSalary){
        
        // explicit call to CommissionEmployee-constructor
        super(firstName, lastName, socialSecurityNumber, grossSales,
                commissionRate);
        
        // validate baseSalary
        if (baseSalary < 0.0){
            throw new IllegalArgumentException(
                    "Base salary must be higher than zero");
        }
        this.baseSalary = baseSalary;
    } // end constructor

    // set baseSalary
    public void setBaseSalary(double baseSalary){
        if (baseSalary < 0.0){
            throw new IllegalArgumentException(
                    "Base salary must be higher than zero.");
        }
        this.baseSalary = baseSalary;
    } // end set

    public double getBaseSalary(){
        return baseSalary;
    } // end get

    // new earnings-calculation
    @Override // gives errors if the function is not found in super
    public double earnings(){
        return baseSalary + super.earnings();
    }

    // new string representation
    @Override
    public String toString(){
        return String.format("%s%n"+
                "Base salary: %.2f", 
                super.toString(), getBaseSalary());
    } // end toString
} // end class

