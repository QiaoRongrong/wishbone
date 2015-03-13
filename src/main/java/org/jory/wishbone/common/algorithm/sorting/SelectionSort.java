package org.jory.wishbone.common.algorithm.sorting;

public class SelectionSort implements Sortor {

    int[] a = {3, 1, 5, 7, 2, 8, 0};
    
    @Override
    public int[] sorting(int[] arr) {
	
	int temp = 0;
	int position = 0;
	
	for (int j=0; j<arr.length; j++){
	    	temp = arr[j];
	    	
	    	//find the minimum value
        	for (int i=j; i<arr.length; i++){
        	    if(temp > arr[i]){
        		temp = arr[i];
        		position = i;
        	    }
        	}
        	
        	
        	 System.out.println("Min value is : " + temp);
        	//put the minimum value into position
        	if(temp != arr[j]){
                	arr[position] = arr[j] ;
                	arr[j] = temp;
        	}
        	ArrayUtil.toString(arr);
        	
	}
	
	return arr;
    }

}
