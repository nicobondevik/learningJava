// concrete implementation of abstract employee class

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    // constructor
    public HourlyEmployee(String firstName, String lastName,
            String socialSecurityNumber, double wage, double hours){
        super(firstName, lastName, socialSecurityNumber);
        
        if (wage < 0.0){
            throw new IllegalArgumentException("Wage must be over zero.");
        }

        if ((hours < 0.0) || (hours > 168)){
            throw new IllegalArgumentException(
                    "Hours worked must be between zero and 168");
        }

        this.wage = wage;
        this.hours = hours;
    } // end constructor

    public void setWage(){
        if (wage < 0.0){
            throw new IllegalArgumentException("Wage must be over zero.");
        }
        this.wage = wage;
    }

    public double getWage(){
        return wage;
    }

    public void setHours(double hours){
        if ((hours < 0.0) || (hours > 168)){
            throw new IllegalArgumentException(
                    "Hours worked must be between zero and 168.");
        }
        this.hours = hours;
    }

    public double getHours(){
        return hours;
    }

    // overwrite abstract earnings method
    @Override
    public double earnings(){
        if (getHours() <= 40){ // no overtime
            return getWage() * getHours();
        }
        else{ //overtime
            return getWage() * 40 + (getHours() - 40) * getWage() * 1.5;
        }
    } // end earnings

    @Override
    public String toString(){
        return String.format(
                "Hourly employee.%n%s%nHourly wage: %,.2f%n" +
                "Hours worked: %,.2f", super.toString(), getWage(),
                getHours());
    } // end toString
} // end class HourlyEmployee
