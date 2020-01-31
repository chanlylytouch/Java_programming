package final_java;

public class Employee extends Person implements ITaxPayable{
	private double salary;
	public Employee(String name, double nbOfSleepHours , double salary ) {
		super(name, nbOfSleepHours);
		this.salary = salary;

	}

	@Override
	public double calculateNetSalary() {
		double netSalary;
		double  tax;
		if(salary <= 200) {
			tax = (5*salary) / 100;
			netSalary = salary -tax;
		}else{
			tax = (10*salary) / 100;
			netSalary = salary -tax;
		}
		return netSalary;
//		return salary;
	}

	@Override
	public void showSleepQuality() {
		if(getNbOfSleepHours() < 5) {
			System.out.println("needs more sleep");
		}
		if(getNbOfSleepHours() >= 5 && getNbOfSleepHours() <= 8) {
			System.out.println("has enough sleep");
		}
		if(getNbOfSleepHours() > 8){
			System.out.println("is probably sleeping too much...");
		}
	}

	public String toString() {
		return "Employee: [name: " + getName() + " , school: " + calculateNetSalary() + "]";
	}
}
