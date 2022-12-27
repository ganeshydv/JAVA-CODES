package SimpleRecurssionProblems;

import java.util.Arrays;

public class MergeSortEx {

	public static void main(String[] args) {
		int[] arr=new int[] { 21, 3, 15, 12,5, 41 };
		arr=mergeSortDivide(arr);
		System.out.println(Arrays.toString(arr));
	}

	static int[] mergeSortDivide(int[] arr) {
		
		if(arr.length==1) return arr;
		
		int mid = arr.length / 2;
		int[] leftArr = new int[mid];
		int[] rightArr = new int[arr.length - mid];
		for(int i=0;i<mid;i++) {
			leftArr[i]=arr[i];
		}
		int k=0; 
		for(int i=mid;i<arr.length;i++) {
			rightArr[k]=arr[i];
			k++;
		}
		System.out.println("left arr: "+Arrays.toString(leftArr));
		System.out.println("right arr: "+Arrays.toString(rightArr));
		leftArr=  mergeSortDivide(leftArr);
		rightArr= mergeSortDivide(rightArr);
		
		//-------
		
		return sortAndMerge(leftArr, rightArr);
		
	}
	
	static int[] sortAndMerge(int[] leftArr,int[] rightArr) {
		int k=0;
		int i=0;
		int j=0;
		int[] mixArr=new int[leftArr.length+rightArr.length];
		while(i<leftArr.length && j<rightArr.length) {
			if(leftArr[i]<rightArr[j]) {
				mixArr[k]=leftArr[i];
				i++;
			}else {
				mixArr[k]=rightArr[j];
				j++;
			}
			k++;
		}
		//------
		while(i<leftArr.length) {
			mixArr[k]=leftArr[i];
			i++;
			k++;
		}
		while(j<rightArr.length) {
			mixArr[k]=rightArr[j];
			j++;
			k++;
		}
		System.out.println("mix Arr: "+Arrays.toString(mixArr)+"\n");
		return mixArr;
	}
}
