// Testing the employee-classes

public class PayrollSystemTest{
    public static void main(String[] args){
        // create subclass objects
        SalariedEmployee salariedEmployee = 
            new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);

        HourlyEmployee hourlyEmployee = 
            new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);

        HourlyEmployee overtimeEmployee =
            new HourlyEmployee("Ola", "Nordmann", "222-22-2223", 16.75, 60);

        CommissionEmployee commissionEmployee =
            new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);

        BasePlusCommissionEmployee basePlusCommissionEmployee =
            new BasePlusCommissionEmployee(
                    "Bob", "Lewis", "444-44-4444", 5000, .04, 300);

        // store all objects in an array
        Employee[] employees = new Employee[5];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = overtimeEmployee;
        employees[3] = commissionEmployee;
        employees[4] = basePlusCommissionEmployee;

        // process each element in array
        System.out.println("Employees processed polymorphically.");
        
        // for loop assigns every subclass-object to the abstract superclass
        for (Employee currentEmployee : employees){
            System.out.printf("%s%n", currentEmployee); // invokes toString
            
            // check whether the employee is a BasePlusCommissionEmployee
            if (currentEmployee instanceof BasePlusCommissionEmployee){
                // downcast Employee reference to BasePlusCommissionEmployee
                BasePlusCommissionEmployee employee = 
                    (BasePlusCommissionEmployee) currentEmployee;
                
                // increase salary by 10%
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf(
                        "New base salary: %,.2f%n",
                        employee.getBaseSalary());
            } // end if

            System.out.printf(
                    "Earned: %,.2f%n", currentEmployee.earnings());
        System.out.printf("%n");
        } // end for loop

        // get type name of each object in the employee array
        for (int j=0; j<employees.length; j++){
            System.out.printf(
                    "Employee %d is a %s%n", j, employees[j].getClass().getName());
        } // end for
    } // end main
} // end class
