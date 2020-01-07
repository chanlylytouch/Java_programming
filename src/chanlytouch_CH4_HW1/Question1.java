package chanlytouch_CH4_HW1;

import java.util.HashSet;
import java.util.Set;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] employee = { "Doung", "Chan", "Minea", "Mesa", "Romdoul", "Veha", "Por", "Kanika","lyly" };
		int[] salary = { 560, 560, 500, 500, 190, 190, 560, 700,700 };
		int max = salary[0];
		int min = salary[0];
		double sum = 0;
		int count=0;
		for (int i = 0; i < salary.length; i++) {
			count++;
			sum +=salary[i];
			if (max < salary[i]) {
				max = salary[i];
			}
			if(min > salary[i]) {
				min = salary[i];
			}
		}	
		System.out.println("1. Employee who has highest salry:");
		for (int j = 0; j < employee.length; j++) {
			if (max == salary[j]) {
				System.out.println(employee[j]+" has the highest salary of "+"$"+max);
			}	
		}
		System.out.println(".................................");
		System.out.println("2. Employee who has lower salry:");	
		for(int i=0; i<employee.length; i++) {
			if(min == salary[i]) {
				System.out.println(employee[i]+" has the lower salary of $"+min);
			}
		}
		System.out.println(".................................");
		System.out.println("3.Employee who has lower salary than average: "+sum/count);
		for(int i=0; i<salary.length; i++) {
			if(salary[i] < sum/count) {
				System.out.println(employee[i]+": $"+salary[i]);
			}
		}
		System.out.println(".................................");
		System.out.println("4.Employee who has higher salary than average: "+sum/count);
		for(int i=0; i<salary.length; i++) {
			if(salary[i] > sum/count) {
				System.out.println(employee[i]+": $"+salary[i]);
			}
		}
		System.out.println(".................................");
		System.out.println("5.Employee who has same value");
//		String salaryOfEmployees = "";
//		for(int i= 0; i < salary.length; i++) {
//			for(int j = 1; j < salary.length-1; j++) {
//				salaryOfEmployees = Integer.toString(salary[i]);
//				if(salary[i] == salary[j]) {
//					System.out.println(employee[i] + ": " + salaryOfEmployees + "$");                    
//					break;
//				}
//			}
//
//		} 
		Set dubplicate = new HashSet();
		for(int i=0; i<salary.length;i++) {
			for(int j= i+1; j<salary.length;j++) {
				if(salary[i]==salary[j]) {
					if(!dubplicate.contains(salary[i])) {
						dubplicate.add(salary[i]);
						for(int k=0; k<salary.length;k++) {
							if(salary[j]==salary[k]) {
								System.out.println(employee[k]+ " : $"+salary[k]);
							}
						}
					}
				}
			}
		}
	}

}
