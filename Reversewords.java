package Bank;

public class Reversewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		//String input="muthulakshmi";
		char[] charArray = test.toCharArray();
		System.out.println(charArray);
		for(int i=charArray.length-1;i>=0;i--) {
			if(i%2==0) {
			System.out.println(charArray[i]);
			}
		}
		

	}

}
