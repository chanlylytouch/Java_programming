package final_java;

public class Main {

	public static void main(String[] args) {
		Student student = new Student("Daro", "PNC", 10);
		System.out.println(student);
		System.out.print(student.getName() + " ");
		student.showSleepQuality();
		
		Employee employee = new Employee("Teb", 8, 600);
		System.out.println(employee);
//		System.out.println(employee.calculateNetSalary());
		System.out.print(employee.getName() + " ");
		employee.showSleepQuality();
//		employee.calculateNetSalary();
	}

}
