// Concrete implementation of an abstract class
public class SalariedEmployee extends Employee{
    private double weeklySalary;

    // constructor
    public SalariedEmployee(String firstName, 
            String lastName, String socialSecurityNumber,
            double weeklySalary){
        super(firstName, lastName, socialSecurityNumber);

        if (weeklySalary < 0.0){
            throw new IllegalArgumentException(
                    "Weekly salary must be over zero.");
        }
        this.weeklySalary = weeklySalary;
    } // end constructor

    // set salary
    public void setWeeklySalary(double weeklySalary){
        if (weeklySalary < 0.0){
            throw new IllegalArgumentException(
                    "Weekly salary must be above zero.");
        }
        this.weeklySalary = weeklySalary;
    } // end set method

    public double getWeeklySalary(){
        return weeklySalary;
    }

    // overwrite abstract earnings method
    @Override
    public double earnings(){
        return getWeeklySalary();
    }

    // overwrite toString
    @Override
    public String toString(){
        return String.format(
                "Salaried employee.%n%s%nWeekly salary: " +
                "%,.2f", super.toString(), earnings());
    } // end toString
} // end class
