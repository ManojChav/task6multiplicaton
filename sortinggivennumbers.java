package com.bellinfo.task6;

import java.util.Arrays;
import java.util.Scanner;

public class sortinggivennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("number of numbers you want to sort: ");
		int n = scn.nextInt();
		System.out.println("Enter the numbers:");
		int[] numAry = new int[n];
		for(int i=0;i<n;i++){
			numAry[i]=scn.nextInt();
		}
		Arrays.sort(numAry);
		System.out.println(" after sorting: \n");
		for(int i=0;i<n;i++){
			System.out.println(numAry[i]);
		}
			
	}

}
