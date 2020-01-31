package final_java;

public class Student extends Person{
	private String schoolNmae;
	public Student(String name,String schoolNmae, double nbOfSleepHours) {
		super(name, nbOfSleepHours);
		this.schoolNmae = schoolNmae;
	}
	
	@Override
	public void showSleepQuality() {
		if(getNbOfSleepHours() < 7) {
			System.out.println("needs more sleep");
		}
		if(getNbOfSleepHours() > 7 && getNbOfSleepHours() < 9) {
			System.out.println("has enough sleep");
		}
		if(getNbOfSleepHours() >= 9) {
			System.out.println("is probably sleeping too much...");
		}
			
	}
	
	public String toString() {
		return "Student:[name: " + getName() + " , school: " + schoolNmae + "]";
		
	}
}
