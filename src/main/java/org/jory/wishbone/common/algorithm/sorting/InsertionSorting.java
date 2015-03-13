package org.jory.wishbone.common.algorithm.sorting;

public class InsertionSorting implements Sortor {
    
    public static int arr[] = {2, 4, 1, 6, 3, 5, 99, 21, 33, 65, 78};
    
    public int[] sorting(int[] arr){
	for(int j=1; j<arr.length; j++) {
	    int key = arr[j];
	    for (int i = j - 1; i >= 0; i--) {
		if (key < arr[i]) {
		    arr[i + 1] = arr[i];
		    arr[i] = key;
		}
	    }
	}
	return arr;
    }
    
    public void output(int[] arr){
	System.out.println("result: ");
	for(int i : arr){
	    System.out.print(i + " ");
	}
	System.out.println();
    }
    
    public static void main(String[] args){
	InsertionSorting insertionSorting = new InsertionSorting();
	int[] outputArray = insertionSorting.sorting(arr);
	insertionSorting.output(outputArray);
    }
}
