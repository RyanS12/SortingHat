package sortingHat;

import java.util.Arrays;

public class SortingHat {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int howMany= 100;
		
		//int[] nums0 = getDescendingOrder(howMany);
		//int[] nums0 = getAscendingOrder(howMany);
		int[] nums0 = getRandom(howMany);
		int[] nums1 = nums0.clone();
		int[] nums2 = nums0.clone();
		
		
		
		
		SelectionSort sSort = new SelectionSort(nums0, "Selection Sort");
		
		doTiming(sSort);
		
		
		
		BubbleSort bSort = new BubbleSort(nums1, "Bubble Sort");
		
		doTiming(bSort);
		
		
		
		InsertionSort ISort = new InsertionSort(nums2, "InsertionSort");
		
		doTiming(ISort);
		
		//System.out.println(ISort.toString());
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
	
}



