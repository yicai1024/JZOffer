package array;

import java.util.Arrays;

public class MultiplyArray {
	/*分成两部分：0~i-1相乘，i+1~n-1相乘，最后这两部分相乘
	 *
	 *另一种思路：求B[i]时，只要让A[i]=1即可
	*/
	public static int[] multiply(int[] A) {//B[i]=A[0]*...*A[i-1]*A[i+1]*...A[n-1],独独没有A[i]
        int[] B =new int[A.length];
 /*       int[] leftarr=new int[A.length];
        int[] rightarr=new int[A.length];
        leftarr[0]=A[0];    
        rightarr[A.length-1]=A[A.length-1];*/
        if(A.length>0){
        
        for(int i=0;i<A.length;i++){
        	int t1=1,t2=1;//分别存i-1之前和i+1之后的乘积之和
            for(int j=0;j<i;j++){//左
            	t1*=A[j];
            }
            for(int k=A.length-1;k>i;k--){//右
            	t2*=A[k];
            }
            
            if(i==0){//边界
               B[i]=t2;
            }else
              if(i==A.length-1){
            	 B[i]=t1;
            }else
               B[i]=t1*t2;	
        }
        
		return B;
        }
        else
        {
        	return null;
        }
    }
	
	public static void main(String args[]){
		int[] A = {1,2,3,4,5};
		System.out.print(Arrays.toString(multiply(A)));
		
	}
}
