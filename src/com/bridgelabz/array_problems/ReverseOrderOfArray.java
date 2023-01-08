package com.bridgelabz.array_problems;
import java.util.Scanner;
public class ReverseOrderOfArray {

	public static void main(String[] args) {
      Scanner elements =new Scanner(System.in);
      System.out.println(" enter the size of array");
      int size = elements.nextInt();
      int Numbers_Array[] = new int[size];
      int temporary;
    	  System.out.println("enter "+size+" elements of array");
      for(int i=0;i<size;i++) {
    	  Numbers_Array[i] = elements.nextInt();
    	  
      }System.out.println("reverse order of array:");
      for (int i=Numbers_Array.length-1;i>=0;i--) {
    	System.out.println(Numbers_Array[i]);
      }
     
      
	}

}
