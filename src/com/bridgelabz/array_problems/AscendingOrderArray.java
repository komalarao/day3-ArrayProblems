package com.bridgelabz.array_problems;
import java.util.Scanner;
public class AscendingOrderArray {

	public static void main(String[] args) {
      Scanner elements =new Scanner(System.in);
      System.out.println(" enter the size of array");
      int size = elements.nextInt();
      int Numbers_Array[] = new int[size];
      int temporary;
    	  System.out.println("enter "+size+" elements of array");
      for(int i=0;i<size;i++) {
    	  Numbers_Array[i] = elements.nextInt();
    	  
      }for (int i=0;i<Numbers_Array.length;i++) {
    	 for(int j=i+1;j<Numbers_Array.length;j++) {
    		 if(Numbers_Array[i]>Numbers_Array[j]) {
    			 temporary = Numbers_Array[i];
    			 Numbers_Array[i]=Numbers_Array[j];
    			 Numbers_Array[j]=temporary;
    		 }
    	 }
    	  
      }System.out.println("ascending order of array is:");
      for(int i=0;i<Numbers_Array.length;i++) {
    	  System.out.println(Numbers_Array[i]);
      }
      
	}

}
