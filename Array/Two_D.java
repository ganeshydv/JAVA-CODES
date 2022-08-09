class Two_D{
	public static void main(String[] args) {
	int[] nums={2,1,3};
	int[] a=new int[nums.length];
   
    for(int i=0;i<nums.length;i++){
        a[i]=nums[i];
        
        if(nums[i]==2 && nums[i+1]==3){
//            x=i+1;
            nums[i+1]=0;
            // break;  //this will break all the upcomig iteration so loop will not continue after this...
         }
         
    
    }

    for(int i=0;i<nums.length;i++){
    System.out.println(a[i]);
    }

  // return a;

}
}