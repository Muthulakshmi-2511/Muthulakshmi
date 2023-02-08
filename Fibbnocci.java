package week1.day2;

public class Fibbnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum=0,secNum=1,sum=0;
		System.out.println(firstNum);
		for(firstNum=1;firstNum<=11;firstNum++) {
			sum=firstNum+secNum;
			secNum=firstNum;
			secNum=sum;
			System.out.println(sum);
			
		}
		

	}

}
