package bit_operation;

public class SumToN {
/* ˼·�����Ϊ0�ͷ���0���������0�ͷ���n+Sum_Solution(n-1)�����Դ���һ���ж�n�Ƿ�Ϊ0�����
 * 1. �����߼���·&& ���ǰ��Ϊ������߲��ᱻʵ�У�return (n>0)&&sum+=Sum_Solution(n-1)
 * 2. try...catch������Ϊn=0ʱ����쳣���׳�0����
 * 3. ����sizeof(a[n][n+1])>>1�����м���
 * 4. ����Math���� return  (int)(Math.pow(n,2)+n)>>1
	*/
	 public int Sum_Solution(int n) {
		/* int sum=n;
		 boolean f=(n>0)&&((sum+=Sum_Solution(n-1))>0);
		 return sum;*/
		 
		 return (int)(Math.pow(n, 2)+n)>>1;
	        
	    }
	 
	
}
