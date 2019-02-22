package sortingHat;

import java.util.Arrays;

public class SortingHat {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int howMany = 10;
		
		int numList[] = getRandom(howMany);
		int numList1[] = getRandom(howMany);
		
		
		
		//int[] nums0 = getDescendingOrder(howMany);
		//int[] nums0 = getAscendingOrder(howMany);
//		int[] nums0 = getRandom(howMany);
//		int[] nums1 = nums0.clone();
//		int[] nums2 = nums0.clone();
//		
//		
//		
		//SelectionSort sSort = new SelectionSort(numList, "Selection Sort");
//		
		//doTiming(sSort);
//		
//		
//		
		//BubbleSort bSort = new BubbleSort(numList1, "Bubble Sort");
//		
		//doTiming(bSort);
//		
//		
//		
//		InsertionSort iSort = new InsertionSort(nums2, "InsertionSort");
//		
//		doTiming(iSort);
		
		
	
		//MergeSortNR mSortNR = new MergeSortNR(numList, "Merge non-recursive");
		
		
		//doTiming(mSortNR);
		
		MergeSortR mSortR = new MergeSortR(numList1, "Merge recursive");
		
		
		doTiming(mSortR);
		
		if(listCheck(numList1)) {
			
			System.out.println("The list is sorted.");
			
			
		} else {
			
			System.out.println("The list is NOT sorted.");
		}
		
	}
	
	
	private static void merge(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		
	}


	public static void doTiming(PapaSort s) {
		
		long start = System.currentTimeMillis();
		long start2 = System.nanoTime();
		
		s.executeAlgorithm();
		
		long end = System.currentTimeMillis();
		long end2 = System.nanoTime();
		
		long theTime  = end-start;
		long theTime2 = end2-start2;
		
		
		if(s.getLength() <= 1000) {
			System.out.println("Time for "+ s.getSortName() + " on "+ s.getLength() +" number is: " + theTime2 + " nanoseconds.");
			
			//System.out.println(sSort);
		} else {
			System.out.println("Time for " + s.getSortName() + " on "+ s.getLength() +" number is: " + theTime + " miliseconds.");
		}
		
		
		
	}


	public static int[] getRandom(int n) {
		int[] nList = new int[n];
		
		for(int i = 0; i < nList.length; i++) {
			
			nList[i] = (int)(Math.random() * 1000);
			
		}
		
		
		
		return nList;
	}
	
	
	public static int[] getAscendingOrder(int n) {
		
		int[] nList = new int[n];
		
		for(int i = 0; i < nList.length; i++) {
			nList[i] = i+1;
		}
		
		return nList;
		
	}
	
	public static int[] getDescendingOrder(int n) {
		
		int[] nList = new int[n];
		
		for(int i = 0; i < nList.length; i++) {
			nList[i] = nList.length - i;
		}
		
		return nList;
		
	}
	
	
	public static boolean listCheck(int[] l) {
		
		for(int i = 0; i < l.length-1; i++) {
			
			if(l[i] > l[i+1]) {
				
				return false;
				
			}
			
		}
		return true;
		
		
	}
	
}



