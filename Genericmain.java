package Maxelement;
import java.util.Arrays;
public class Genericmain {
	//main method
	public static void main(String[] args) {   
		Integer[] arr = {21,34,32};
		printArray(arr);
		findmaximum(arr);
		
	}
	//generic method
	private static <T> void printArray(T[] arr) {
		
	   for (int i=0;i<arr.length; i++) {
		   System.out.print(arr[i]+ " ");
		}
	   System.out.println();
	}
	
	private static <T extends Comparable<T>> void findmaximum(T[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].compareTo(arr[j]) > 0){
					T temp = arr[j];
				    arr[j] = arr[j];
				    arr[j] = temp;
				     
				}
				
			}
			  
			
		}
		 
		for(int i=0; i < arr.length; i++){  
			 System.out.print(arr[i]+" " ); 
			}
		System.out.println();
			for(int i=arr.length-1;i>=0; i--){
			  System.out.print(arr[i] + " ");
			 	
	        	} 
			System.out.println();
			for(int i=0; i < arr.length; i++){
				for(int j=i+1;j<arr.length;j++){ 
				 T temp=arr[arr.length-1];
				 arr[arr.length-1]=arr[arr.length-2];
				 arr[arr.length-2]=temp;
				}
			}
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
			}   
	}
	
	}

