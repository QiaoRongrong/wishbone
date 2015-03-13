package org.jory.wishbone.common.algorithm.sorting;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class SortorTest {

    private int[] a = {3, 1, 5, 7, 2, 8, 0};
    
    @BeforeClass
    public static void setup(){
	
    }
    
    @Test
    public void testInsertionSorting(){
	Sortor sortor = new InsertionSorting();
	
	
    }
    
    @Test
    public void testSelectionSorting(){
	Sortor sortor = new SelectionSort();
	sortor.sorting(a);
	//ArrayUtil.toString(sortor.sorting(a));
    }
    
    @Test
    public void testBubbleSorting(){
	Sortor sortor = new BubbleSort();
	ArrayUtil.toString(sortor.sorting(a));
    }
    
    @Test
    public void testCommon(){
	int arr[] = {1, 3, 7};
	ArrayUtil.toString(arr);
	
	int[] brr = arr;
	arr[2] = 8;
	ArrayUtil.toString(brr);
    }
    
    @Test
    public void testMath(){
	assertEquals(1, 3/2);
	//assertEquals(1.5f, 3f/2f);
	
	for(int i=0; i<100; i++){
	    System.out.println(Math.random());
	}
    }
}
