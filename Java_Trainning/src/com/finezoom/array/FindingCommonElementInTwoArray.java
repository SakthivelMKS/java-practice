package com.finezoom.array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindingCommonElementInTwoArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first Array size");
		int avg = 0, sum = 0,secondArraySize, firstArraySize = scan.nextInt();
		System.out.println("Enter the second Array size");
		secondArraySize=scan.nextInt();
		// System.out.println("Enter the Element " + number + " of an Array");
		int[] firstArray = new int[firstArraySize];
		int[] secondArray = new int[secondArraySize];
		// Logic for length of array finding
		for (int i = 0; i < firstArray.length; i++) {
			System.out.println("Please enter" + i + " number");
			firstArray[i] = scan.nextInt();

		}
		for (int i = 0; i < secondArray.length; i++) {
			System.out.println("Please enter" + i + " number");
			secondArray[i] = scan.nextInt();

		}
		//String sameArray[];
		/*Set set =new HashSet();
		for(String value2:secondArray){
			
			for(String value1:firstArray){
				if(value2==value1){
					set.add(value2);
				}
			}
			
		}
		System.out.println(set);*/
		
		Set set =new HashSet();
		 for (int i = 0; i < firstArray.length; i++)
	        {
	            for (int j = 0; j < secondArray.length; j++)
	            {
	                if(firstArray[i]==secondArray[j])
	                {
	                    set.add(firstArray[i]);
	                }
	            }
	        }
	 
	        System.out.println(set);  
		
	}

}
