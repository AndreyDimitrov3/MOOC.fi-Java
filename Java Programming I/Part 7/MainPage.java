package demo;

import java.util.Arrays;

public class MainPage {
    public static void main(String[] args) {
    	int[] numbers = {8, 3, 7, 9, 1, 2, 4};
    	sort(numbers);
    }
    
	public static int smallest(int[] array) {
		int smallest = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] < smallest) {
				smallest = array[i];
			}
		}
		return smallest;
	}
	
	public static int indexOfSmallest(int[] array){
	    int smallestValue = MainPage.smallest(array);
	    for(int i = 0; i < array.length; i++) {
	    	if(smallestValue == array[i]) {
	    		return i;
	    	}
	    }
	    return -1;
	}
	
	public static int indexOfSmallestFrom(int[] table, int startIndex) {
		int smallestIndex = startIndex;
		int smallestInt = table[startIndex];
		
		for(int i = startIndex; i < table.length; ++i) {
			if(smallestInt > table[i]) {
				smallestIndex = i;
				smallestInt = table[i];
			}
		}
		return smallestIndex;
	}
	
	public static void swap(int[] array, int index1, int index2) {
	    int temp = array[index1];
	    
	    array[index1] = array[index2];
	    array[index2] = temp;
	}
	
	public static void sort(int[] array) {
	    for (int i = 0; i < array.length - 1; i++) {
	        int smallestIndex = indexOfSmallestFrom(array, i);
	        swap(array, smallestIndex, i);
	        System.out.println(Arrays.toString(array));
	    }
	}
}
