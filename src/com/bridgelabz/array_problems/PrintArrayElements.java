package com.bridgelabz.array_problems;
import java.util.Scanner;
public class PrintArrayElements {

	public static void main(String[] args) {
		System.out.println("Welcome to array problems");
       Scanner numbers = new Scanner(System.in);
       System.out.println("enter size of an array");
       int size = numbers.nextInt();
       int Number_Array[] = new int[size];
	   System.out.println("enter "+size+" elements  of array");

       //storing elements in an array
       for (int i =0;i<size;i++) {	   
    	   Number_Array[i] = numbers.nextInt();
    	   
       }// retrieving elements from array
       for (int i=0; i<Number_Array.length;i++) {
    	   System.out.print(Number_Array[i]+"  ");
       }
	}

}
