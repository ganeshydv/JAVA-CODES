package SimpleRecurssionProblems;

import java.util.Arrays;

public class MergeSortInPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] { 21, 3, 15, 12,5, 41 };

		mergeSort(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));
	}
	
	
	static void mergeSort(int[] arr,int start,int end)  //pass by REF to original object array
	{
		if(end-start==1) return ;
		int mid=start+(end-start)/2;
//		int mid=(start+end)>>1;
		mergeSort(arr, start, mid);
		mergeSort(arr, mid, end);
		mixArrays(arr, start, mid, end);
	}
	
	static void mixArrays(int[] arr,int start,int mid,int end) {
		
		int[] mixArr=new int[end-start];
		
		int i=start;
		int j=mid;
		int k=0;
		
		while(i<mid && j< end) {
			if(arr[i]<arr[j]) {
				mixArr[k]=arr[i];
				i++;
			}
			else {
				mixArr[k]=arr[j];
				j++;
			}
			k++;
		}
		
		while(i<mid) {
			mixArr[k]=arr[i];
			i++;
			k++;
		}
		while(j<end) {
			mixArr[k]=arr[j];
			j++;
			k++;
		}
		for(int m=0;m<mixArr.length;m++) {
			arr[start+m]=mixArr[m];
		}
//		return arr;
		
	}
}
