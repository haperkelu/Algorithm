package com.pieli.algorithm.sorting;

/**
 * 
 * @author pai.li
 *
 */
public class quickSortProvider {

	
	public void sort(double[] input, int beginPosition, int endPosition){
		
		//check para, suppress exception
		if(input == null || input.length == 0 
				|| beginPosition < 0 || beginPosition >= endPosition   
				|| endPosition > input.length - 1){
			return;
		}
		
		if(endPosition - beginPosition == 1){
			if(input[beginPosition] > input[endPosition]){
				double temp = input[beginPosition];
				input[beginPosition] = input[endPosition];
				input[endPosition] = temp;
			}
			return;
		}
		
		int i = beginPosition + 1, j = endPosition;
		double pivot = input[beginPosition];
		boolean toggle = true;
		while(i != j){
			if(toggle){
				
				//find first less than pivot
				while(input[i] < pivot && i < j){
					i ++;
				}
				
				toggle = !toggle;
				
				//reach end
				if(i == j){break;}
				
				//switch
				if(input[i] > input[j] && input[j] > pivot){
					double temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
				
				
			}else{
				
				//find first more that pivot
				while(input[j] >= pivot && j > i){
					j --;
				}
				
				toggle = !toggle;
				//reach end
				if(i == j){break;}					
				
				if(input[j] < input[i] && input[i] > pivot){
					double temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
								
			}
		}		
		
		if(input[i] < pivot){
			input[beginPosition] = input[i];
			input[i] = pivot;
		}

		if(i > beginPosition){
			sort(input, beginPosition, i - 1);
		}
		if(endPosition > i + 1){
			sort(input, i + 1, endPosition);
		}		
		
	}
	
}
