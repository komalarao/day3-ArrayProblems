package com.bridgelabz.array_problems;
import java.util.Scanner;
public class SmallestElementArray {

	public static void main(String[] args) {
      Scanner elements =new Scanner(System.in);
      System.out.println(" enter the size of array");
      int size = elements.nextInt();
      int Numbers_Array[] = new int[size];
      if(size>=2) {   
    	  System.out.println("enter "+size+" elements of array");
      for(int i=0;i<size;i++) {
    	  Numbers_Array[i] = elements.nextInt();
    	  
      }for (int i=1;i<Numbers_Array.length;i+=2) {
    	  System.out.println(Numbers_Array[i]);
      }
      }else {
    	  System.out.println(size+" elements are not enough to print even position numbers");
      }
	}

}
