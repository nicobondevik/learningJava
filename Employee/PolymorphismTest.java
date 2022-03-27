// Assigning superclass and subclass references to superclass and
// subclass variables.

public class PolymorphismTest{
    public static void main(String[] args){
        // superclass reference to superclass variable
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Sue", "Jones", "222-22-2222", 1000, .06);

        // subclass reference to subclass variable
        BaseCommissionEmployee baseCommissionEmployee =
            new BaseCommissionEmployee(
                    "Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        // toString on superclass object using superclass variable
        System.out.printf(
                "Call CommissionEmployee's toString with superclass "+
                "reference to superclass object:%n%s%n",
                commissionEmployee.toString());

        // toString on subclass object using subclass variable
        System.out.printf(
                "Call BasePlusCommissionEmployee's toString with "+
                "subclass reference to the subclass object:%n%s%n",
                baseCommissionEmployee.toString());

        // toString on subclass object using superclass variable
        CommissionEmployee commissionEmployee2 = 
            baseCommissionEmployee;
        System.out.printf(
                "Call BasePlusCommissionEmployee's toString with " +
                "superclass reference to subclass object:%n%s%n",
                commissionEmployee2.toString());
    } // end main
} // end class

