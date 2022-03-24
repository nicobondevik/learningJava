// An employee who works on comission
public class ComissionEmployee extends Object{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double comissionRate;

    // constructor
    public ComissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, double grossSales,
            double comissionRate){
        if (grossSales < 0.0)
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0");

        if (comissionRate <= 0.0 || comissionRate >= 1.0)
            throw new IllegalArgumentException(
                    "Comission rate must be between 0 and 1");

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.comissionRate = comissionRate;
    } // end constructor

    public String getName(){
        return String.format("%s, %s", lastName, firstName);
    }

    public String ss(){
        return socialSecurityNumber;
    }

    public void setGross(double grossSales){
        if (grossSales < 0.0)
            throw new IllegalArgumentException(
                    "Gross sales must be over 0.");
        this.grossSales = grossSales;
    }

    public void setComission(double comissionRate){
        if (comissionRate <= 0.0 || comissionRate >= 1.0)
            throw new IllegalArgumentException(
                    "Comission rate must be between 0 and 1.");
        this.comissionRate = comissionRate;
    }

    public double getGross(){
        return grossSales;
    }

    public double getComission(){
        return comissionRate;
    }

    // calculate earnings
    public double earnings(){
        return comissionRate * grossSales;
    }

    // string representation of employee-object
    // @override used to override superclass method
    @Override
    public String toString(){
        return String.format("Comission employee: %s%n:" +
                "Social Security number: %s%n" +
                "Gross sales: %.2f%n" +
                "Comission rate: %.2f%n",
                getName(), ss(), getGross(), getComission());
    } // end toString
} // end class ComissionEmployee
