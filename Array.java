package week2.day2;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};

		Arrays.sort(data);
		//System.out.println("sorted num : "+num[1]);
		//for (int i = 0; i < data.length-1; i++) {
			System.out.println("The second largerst element of an array is :"+data[data.length-2]);
		}
	}

