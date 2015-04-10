package Sorting;

public class InsertionSort {
  /**
   * insertionSort      sorts an array of integers using insertion sort
   * 
   * @param unsortedArray   an unsorted array of integers
   * @return          the input array, sorted least to greatest
   */
  public static int[] insertionSort(int[] unsortedArray) {
    int n = unsortedArray.length;
    for (int i=1; i<n; i++) {
      
      int curr = unsortedArray[i];
      int spot = i;
      while (spot > 0 && curr < unsortedArray[spot-1]) {
        
        unsortedArray[spot] = unsortedArray[spot - 1];
        spot = spot - 1;
      }
      unsortedArray[spot] = curr;
    }
    return unsortedArray;
  }
  

}
