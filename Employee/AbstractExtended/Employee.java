// Abstract employee superclass.

public abstract class Employee{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    // constructor
    public Employee(String firstName, String lastName,
            String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    } // end constructor

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

    @Override
    public String toString(){
        return String.format(
                "%s, %s%nSocial security number: %s",
                getLastName(), getFirstName(),
                getSocialSecurityNumber());
    } // end toString

    // abstract method to calculate earnings
    public abstract double earnings();
} // end abstract class
