package org.jory.wishbone.common.algorithm.sorting;

public class BubbleSort implements Sortor {

    @Override
    public int[] sorting(int[] arr) {
	int temp = 0;
	
	for(int j=0; j<arr.length; j++){
        	for(int i=1; i<arr.length; i++){
        	    temp = arr[i-1];
        	    if(temp > arr[i]){
        		arr[i-1] = arr[i];
        		arr[i] = temp;
        		
        		temp = arr[i];
        	    }
        	}
	}
	
	return arr;
    }
    
    

}
