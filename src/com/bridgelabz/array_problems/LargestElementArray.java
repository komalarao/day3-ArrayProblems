package com.bridgelabz.array_problems;
import java.util.Scanner;
public class LargestElementArray {

	public static void main(String[] args) {
      Scanner elements =new Scanner(System.in);
      System.out.println(" enter the size of array");
      int size = elements.nextInt();
      System.out.println("enter "+size+" elements of array");
      int Numbers_Array[] = new int[size];
      int max=0;
      for(int i=0;i<size;i++) {
    	  Numbers_Array[i] = elements.nextInt();
      }for(int i=0;i<Numbers_Array.length;i++) {
    	  System.out.println(Numbers_Array[i]+" ");

      }
      for (int i=0;i<Numbers_Array.length;i++) {
    	  if(Numbers_Array[i]>max) {
    		  max = Numbers_Array[i];
    	  }
      }System.out.println(max+" is the greater element in array");
	}

}
