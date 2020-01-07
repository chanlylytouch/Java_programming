package chanlytouch_CH3_HW0;

public class homework {

	public static void main(String[] args) {
		
		// Answer 1
		String half = "1234";
		String hw = "homework";
		String pro = "programing";
		String mar = "marker";
		System.out.println(half.substring(0, half.length()/2)+" is the first half of 1234");
		System.out.println(hw.substring(0, hw.length()/2)+" is the first half of homework");
		System.out.println(pro.substring(0, pro.length()/2)+" is the first half of program");
		System.out.println(mar.substring(0, mar.length()/2)+" is the first half of marker");
		
		//Answer 2
		String uppercase = "welcome";
		String fs = uppercase.substring(0,4);
		String ls = uppercase.substring((uppercase.length()-3),	uppercase.length()).toUpperCase();
		String output = fs + ls;
		System.out.println("From "+ uppercase + " to " + output);	
		
		//Answer 3
		String lastString = "www.google.com/";
		if(lastString.contains("/")) {
			System.out.println(lastString  + "web2020");
		}else{
			System.out.println("This string doesn't end with/");
		}
		
		//Answer 4
		String str = "this is the most common way";
		int count = 0;
		char letter = 'o';
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == letter) {
				count++;
			}	
		}
		System.out.println("There are "+count+" letter o in This is the most common way");
		
		//Answer5
		String sentence = "This is the most common way of creating string";
		System.out.println("Replace sentence: "+sentence.replace("string", "STRING"));
	}
}
