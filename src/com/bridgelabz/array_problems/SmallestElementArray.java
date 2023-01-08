package com.bridgelabz.array_problems;
import java.util.Scanner;
public class SmallestElementArray {

	public static void main(String[] args) {
      Scanner elements =new Scanner(System.in);
      System.out.println(" enter the size of array");
      int size = elements.nextInt();
      System.out.println("enter "+size+" elements of array");
      int Numbers_Array[] = new int[size];
      
    // assigning elements to array through for loop  
      for(int i=0;i<size;i++) {
    	  Numbers_Array[i] = elements.nextInt();
      }//storing starting index element to minimum variable
      int min=Numbers_Array[0];
      //retrieving array data through for loop
      for(int i=0;i<Numbers_Array.length;i++) {
    	  System.out.println(Numbers_Array[i]+" ");

      }//finding smallest element in array
      for (int i=0;i<Numbers_Array.length;i++) {
    	  if(Numbers_Array[i]<min) {
    		  min = Numbers_Array[i];
    		  
    	  }
      }System.out.println(min+" is the smallest element in array");
	}

}
