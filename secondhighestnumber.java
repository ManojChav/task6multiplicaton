package com.bellinfo.task6;

import java.util.Arrays;
import java.util.Scanner;

public class secondhighestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter number of inputs");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numAry = new int[n];
		System.out.println("Enter the input numbers");
		for(int i=0; i<n;i++){	
		numAry[i]=sc.nextInt();
		}
		
		Arrays.sort(numAry);
		System.out.println("second highest number is: "+ numAry[numAry.length-2]);
	}

}
