package com.bridgelabz.array_problems;
import java.util.Scanner;
public class CountFrequencyOfElements {

	public static void main(String[] args) {
      Scanner elements =new Scanner(System.in);
      System.out.println(" enter the size of array");
      int size = elements.nextInt();
      int Numbers_Array[] = new int[size];
      int frequency[] = new int[Numbers_Array.length];
      int counted =-1;
    	  System.out.println("enter "+size+" elements of array");
      for(int i=0;i<size;i++) {
    	  Numbers_Array[i] = elements.nextInt();
      }    	  
      for (int i=0;i<Numbers_Array.length;i++) {
    	int count =1;
    	for(int j=i+1;j<Numbers_Array.length;j++) {
    		if(Numbers_Array[i]==Numbers_Array[j]) {
    			count++;
    			frequency[j]=counted;
    		}
    	}if(frequency[i]!=counted) 
    		frequency[i]=count;
    	
      } for(int i = 0; i < frequency.length; i++){
          if(frequency[i] != counted)
              System.out.println("Element: "+Numbers_Array[i] + " Frequency: " + frequency[i]);
          }
      
	}

}
