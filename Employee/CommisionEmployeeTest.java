// Testing for ComissionEmployee

public class ComissionEmployeeTest{
    public static void main(String[] args){
        ComissionEmployee employee = new ComissionEmployee(
                "Sue", "Jones", "222-22-222", 10000, .06);

        // get employee-data
        System.out.println("Employee information:\n");

        System.out.printf("Name: %s%n", employee.getName());

        System.out.printf("Social Security number: %s%n", employee.getSS());

        System.out.printf("Gross sales: %d%n", employee.getGross());

        System.out.printf("Comission rate: %d%n", employee.getComission());

        // set employee-data
        employee.setGross(5000);
        employee.setComission(.1);

        System.out.printf("Updated employee-information:%n%s%n", employee);
        System.out.printf("Earnings: %d", getEarnings());
    }
}

