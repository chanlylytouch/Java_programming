package chanlytouch_CH4_HW1;
import java.util.Random;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random objGenerator = new Random();
		int[] storeArray = new int[15];
		String index = "";
		int count = 0;
		for (int i = 0; i< storeArray.length; i++){
			int randomNumber = objGenerator.nextInt(11);
			storeArray[i] = randomNumber;
			System.out.print(storeArray[i]+" ");
			if(storeArray[i] == 5) {
				count++;
				index = index + i + " ";
			}
		}
		System.out.println();
		if(count !=0) {
			System.out.println("There are "+count+" number 5 found in index as below");
			System.out.println("Index: " +index+" ");
		}else {
			System.out.println();
		}
	}

}
