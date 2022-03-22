// class for testing Employee-class

public class EmployeeTest{
	public static void main(String[] args){
		Date birth = new Date(30, 8, 1996);
		Date hire = new Date(11, 10, 2020);
		Employee employee = new Employee("Nico", "Bonde", birth, hire);
		System.out.println(employee);
	}
}
