package recursion_and_loop;

public class Fibonacci {
	/*public static int fibonacci(int n){
		if(n==0){
			return 0;
		}else if(n==1)
		{
			return 1;
		} else {
			return fibonacci(n-1)+fibonacci(n-2);		
		}
       
    }*/
	public static int fibonacci(int n){
		int f1=1,f2=1,fn=0;//利用f1去保存fn的信息
		if(n==0)
			return 0;
		if(n==1||n==2)
			return 1;
		
		while(n>2){
			fn=f1+f2;
			f1=f2;
			f2=fn;	
			n--;
		}
		return fn;
       
    }
	
	
	public static void main(String arr[]){
	     System.out.print(fibonacci(10));
	}
}
