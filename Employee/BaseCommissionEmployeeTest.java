// Testing for ComissionEmployee

public class BaseCommissionEmployeeTest{
    public static void main(String[] args){
        BaseCommissionEmployee employee = new BaseCommissionEmployee(
                "Sue", "Jones", "222-22-222", (double) 10000, .06, 300);

        // get employee-data
        System.out.println("Base-salaried Employee information:");

        System.out.printf("Name: %s%n", employee.getName());

        System.out.printf("Social Security number: %s%n", 
                employee.getSS());

        System.out.printf("Gross sales: %.2f%n", employee.getGross());

        System.out.printf("Comission rate: %.2f%n", 
                employee.getCommission());

        System.out.printf("Base salary: %.2f%n", employee.getBaseSalary());

        System.out.printf("Earnings: %.2f\n\n", employee.earnings());

        // set employee-data
        employee.setGross(5000);
        employee.setCommission(.1);

        System.out.printf("Updated employee-information:%n%s%n", employee);
    }
}
