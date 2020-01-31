package final_java;

public class Person {
	private String name;
	private double nbOfSleepHours;
	
	public Person(String name,double nbOfSleepHours) {
		this.name = name;
		this.nbOfSleepHours = nbOfSleepHours;
	}
	public String getName() {
		return name;
	}
	public double getNbOfSleepHours(){
		return nbOfSleepHours;
	}
	public void showSleepQuality() {
		
	}
}
