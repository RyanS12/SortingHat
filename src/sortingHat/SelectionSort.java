package sortingHat;

import java.util.Arrays;

public class SelectionSort extends PapaSort{

	
	public SelectionSort (int[] l, String name) {
		
		super(l, name);
		
	}
	
	public void executeAlgorithm() {
		
		for(int j = 0; j < getList().length; j++) {
		
			int big = getElement(0);
			int bigI = 0;
		
			for(int i = 0; i < getList().length - j; i++) {
				if(big < getElement(i)) {
					big = getElement(i);
					bigI = i;
				
				}
			}
			swap(bigI, super.getList().length - 1 - j);
		
		}
		
	}

	
	
}

