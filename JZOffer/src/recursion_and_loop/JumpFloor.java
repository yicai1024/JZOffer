package recursion_and_loop;

public class JumpFloor {
	public static int jumpFloor(int n){
		int f1=1,f2=2,fn=0;
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		
		while(n>2){
			fn=f1+f2;
			f1=f2;
			f2=fn;	
			n--;
		}
		return fn;
       
    }
	

}
