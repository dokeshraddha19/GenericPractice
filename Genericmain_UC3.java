package Maxelement;

public class Genericmain_UC3 {
	public static void main(String[] args) {   
		String[] arr = {"Hello","Welcome","India"};
		
		printArray(arr);
		bubblesort(arr);  
        
		
	}
	//generic method
	private static <T> void printArray(T[] arr) {
		
	   for (int i=0;i<arr.length; i++) {
		   System.out.print(arr[i]+ " ");
		}
	   System.out.println();
	}
	//bubble sort method
	private static <T extends Comparable<T>> void bubblesort(T[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].compareTo(arr[j]) > 0){
					T temp = arr[i];
				    arr[i] = arr[j];
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
