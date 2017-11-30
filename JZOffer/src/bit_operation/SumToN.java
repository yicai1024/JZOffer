package bit_operation;

public class SumToN {
/* 思路：如果为0就返回0，如果大于0就返回n+Sum_Solution(n-1)：所以存在一个判断n是否为0的情况
 * 1. 利用逻辑短路&& 如果前者为假则后者不会被实行：return (n>0)&&sum+=Sum_Solution(n-1)
 * 2. try...catch来捕获为n=0时候的异常，抛出0即可
 * 3. 利用sizeof(a[n][n+1])>>1来进行计算
 * 4. 利用Math函数 return  (int)(Math.pow(n,2)+n)>>1
	*/
	 public int Sum_Solution(int n) {
		/* int sum=n;
		 boolean f=(n>0)&&((sum+=Sum_Solution(n-1))>0);
		 return sum;*/
		 
		 return (int)(Math.pow(n, 2)+n)>>1;
	        
	    }
	 
	
}
