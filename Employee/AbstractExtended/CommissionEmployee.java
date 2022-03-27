// Implementation of abstract employee class

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    // constructor
    public CommissionEmployee(String firstName, String lastName, 
            String socialSecurityNumber, double grossSales, double commissionRate){
        super(firstName, lastName, socialSecurityNumber);

        if ((commissionRate <= 0.0) || (commissionRate > 1.0)){
            throw new IllegalArgumentException(
                    "Commission rate must be between 0.1 and 1.0.");
        }

        if (grossSales < 0.0){
            throw new IllegalArgumentException(
                    "Gross sales must be above zero.");
        }
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    } // end constructor

    public void setGrossSales(double grossSales){
        if (grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be above zero.");
        }
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate){
        if ((commissionRate <= 0.0) || (commissionRate > 1.0)){
            throw new IllegalArgumentException(
                    "Commission rate must be between 0.1 and 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double getGrossSales(){
        return grossSales;
    }

    public double getCommissionRate(){
        return commissionRate;
    }

    // overwrite earnings-method from superclass
    @Override
    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }

    public String toString(){
        return String.format(
                "Commission employee.%n%s%nGross sales: %,.2f%n" +
                "Commission rate: %,.2f", 
                super.toString(), getGrossSales(), getCommissionRate());
    } // end toString
} // end class
