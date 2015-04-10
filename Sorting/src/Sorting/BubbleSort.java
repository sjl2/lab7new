package Sorting;

public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		//TODO: S1 implements bubble sort
		int swaps; 
		
	  do {
	    swaps = 0; 
	    int l= unsortedArray.length; 
	    
	    for (int i = 0; i < (l - 1); i++) {
	      if (unsortedArray[i + 1] < unsortedArray[i]) {
	        int temp = unsortedArray[i]; 
	        unsortedArray[i] = unsortedArray[i + 1]; 
	        unsortedArray[i + 1] = temp; 
	        swaps++; 
	      }
	    }
	    
	  } while (swaps > 0);
	  
		return unsortedArray;
	}
}
