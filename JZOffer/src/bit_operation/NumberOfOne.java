package bit_operation;

public class NumberOfOne {
/*	//每次右移一位，然后%2等于1的话代表最后一位为1，因此其时间复杂度为常量集，最多是n的二进制位
	public static int NumberOf1(int n) {
		int index=0;
		if(n>0){
		     while(n!=0){
			    if(n%2==1)
				    index++;
			    n=n>>1;
		     }
	    }else if(n<0){//一个正数取反后必定有一位为0，所以不用担心+1会加至最高位
			
			int a=(~n)+1;//按位取反，最高位原本为1取反后变为了0,然后加1，则是负数的补码表示
			 System.out.println(a);
			while(a!=0){
				if(a%2==1)
					index++;
				a=a>>1;
			}
			index++;	//如果是负数，其表示形式为 其绝对值（源码）按位(非最高位，其最高位一定为1)取反（反码），在加1（补码）
		}
		return index;
	*/
	
	/*另一种思路：如果n为负数右移可能会陷入死循环，那么我就将1不停左移与n做与运算，
	直到左移k次之后的1已经大于了原数就可以停止左移了，记录与运算结果为1的个数就代表原数有多少位1
	*/	
	public static int NumberOf1(int n) {
	   int index=0,temp=1;
	   while(temp<=Math.abs(n)){//改为temp!=0 ,如果等于0表示已经遍历完数的所有位了
		   if((n & temp) >0){
			   index++;
		   }
		   temp=temp<<1;
	   }
		return index;

    }
	
	/*
	*/
	 public static void main(String args[]){
		 System.out.println(NumberOf1(-2147483648));
		 
	 }

}
