// An employee who works on commission
public class CommissionEmployee extends Object{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    // constructor
    public CommissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, double grossSales,
            double commissionRate){
        if (grossSales < 0.0)
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0");

        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException(
                    "Commission rate must be between 0 and 1");

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    } // end constructor

    public String getName(){
        return String.format("%s, %s", lastName, firstName);
    }

    public String getSS(){
        return socialSecurityNumber;
    }

    public void setGross(double grossSales){
        if (grossSales < 0.0)
            throw new IllegalArgumentException(
                    "Gross sales must be over 0.");
        this.grossSales = grossSales;
    }

    public void setCommission(double commissionRate){
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException(
                    "Commission rate must be between 0 and 1.");
        this.commissionRate = commissionRate;
    }

    public double getGross(){
        return grossSales;
    }

    public double getCommission(){
        return commissionRate;
    }

    // calculate earnings
    public double earnings(){
        return commissionRate * grossSales;
    }

    // string representation of employee-object
    // @override used to override superclass method
    @Override
    public String toString(){
        return String.format("Commission employee: %s%n" +
                "Social Security number: %s%n" +
                "Gross sales: %.2f%n" +
                "Commission rate: %.2f\n" +
                "Earnings: %.2f",
                getName(), getSS(), getGross(), getCommission(),
                earnings());
    } // end toString
} // end class CommissionEmployee
