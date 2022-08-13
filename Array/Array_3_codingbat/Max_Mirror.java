//
//We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array,
//the same group appears in reverse order. For example, the largest mirror section in
//{1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.


//maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
//maxMirror([1, 2, 1, 4]) → 3
//maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2

public class Max_Mirror {
    public static void main(String[] args) {
        int[] arr={1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25};
        int a=maxMirror(arr);
        System.out.println(a);
    }
public int maxMirror(int[] nums) {
  int count=0;
  int count2=0;
  int max=0;
 
  int index1=nums.length-1;
  if(nums.length>=1) max=1;
  for(int i=0;i<nums.length;i++)
  {
    for(int k=index1;k>=i;k--)
    {
      int j=i;
      if(nums[j]==nums[k])
      {
        count=1;
        while(j+1<nums.length && k-1>=0 && nums[j]==nums[k] && nums[j+1]==nums[k-1])
        { 
          count++;
          k--;
          j++;
        }
        
      }//if end
      if(count>max)
      {
      max=count;
      }
    }//inner for
      
  }//outer for
    
  return max;
}



}

