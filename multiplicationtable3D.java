package com.bellinfo.task6;

import java.util.Scanner;

public class multiplicationtable3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
	     System.out.println("enter the number to print miltiplication table of");
	     Scanner mul =new Scanner(System.in);
	     a=mul.nextInt();
	     System.out.println("3d multiplivation table of " + a +" is " );
	     for ( b=1;b<=10;b++){
	    	 for(c=1;c<=10;c++){
	    	 System.out.println(a+ "×" +b + "×" +c+ " = " +(a*b*c));
	    	 }
	     } 	 
	}

}
