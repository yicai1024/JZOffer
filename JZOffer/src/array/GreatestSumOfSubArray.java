package array;

public class GreatestSumOfSubArray {
	//temp用来记录走到第i步前的i-1步的前面的和，如何前面和f(n-1)<=0并且n大于0，那么前面的和全部抛弃，从n开始往后重新计算
	//但是需要一个额外变量max来保存出现过的最大值
   public static int FindGreatestSumOfSubArray(int[] array) {
       
	   int max_sum=array[0],temp=array[0];//记录 每一步的最大和
        int index=1;
	    while(index<array.length){//找出递归的终止条件
	    	if(temp<0){//如果前面的累加和小于0那么全面所有的就应该抛弃，直接让他从这个元素出发
	    		temp = array[index];	    		
	    	}
	    	else{
	    		temp+=array[index];
	    	}
	    	if(temp>max_sum)
	    		max_sum=temp;
	    	index++;
	    }
	      return max_sum;   
    }
   
  /* public static int max(int a,int b,int c){
	  return  Math.max(a, b)>c?Math.max(a, b):c;
   }*/
   
   public static void main(String args[]){
	   int[] array={-2,-8,-1,-5,-9};
		 System.out.println(FindGreatestSumOfSubArray(array));
		 
	 }
}
