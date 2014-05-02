package com.fightingtime.code.algorithm;

public class AlgorithmMain {
	private static final String SUFFIX_SORT_BEFORE = " before";
	private static final String SUFFIX_SORT_AFTER = " after";
	private static final int[] SRC_ARRAY = {3,8,5,2,4,1,7,6,10,9};
	
	public static void main(String[] args) {
		insertionSort();
	}
	
	private static void insertionSort() {
		String currentMethodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		printArray(currentMethodName+SUFFIX_SORT_BEFORE, SRC_ARRAY);
		int[] resutArray = Sort.insertionSort(SRC_ARRAY);
		printArray(currentMethodName+SUFFIX_SORT_AFTER, resutArray);
	}

	private static void printArray(String sortFlag, int[] array) {
		System.out.println("---------------"+sortFlag+"--------------");
		for(int i = 0; i <= array.length -1 ; i++) 
			System.out.print(" "+array[i]);
		System.out.println();
	}
}
