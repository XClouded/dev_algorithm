package com.fightingtime.code.algorithm;

public class Sort {
	
	public static int[] insertionSort(int[] srcArray) {
		int j;
		for(int p = 1; p <= srcArray.length-1; p++) {
			int pValue = srcArray[p];
			for(j = p; j > 0 && pValue < srcArray[j-1]; j--)
				srcArray[j] = srcArray[j-1];
			srcArray[j] = pValue;
		}
		return srcArray;
	}
}
