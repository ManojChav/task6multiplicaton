package com.bellinfo.task6;

import java.util.Scanner;

public class multiplicationtaTable2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a,b;
     System.out.println("enter the number to print miltiplication table of");
     Scanner mul =new Scanner(System.in);
     a=mul.nextInt();
     System.out.println("multiplivation table of " + a +" is " );
     for ( b=1;b<=10;b++){
    	 System.out.println(a+ "×" +b + " = " +(a*b));
     }
	}

}
