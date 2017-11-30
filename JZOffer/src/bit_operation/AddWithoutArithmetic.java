package bit_operation;

public class AddWithoutArithmetic {
/* 1.先做无进位相加（异或运算^）
 * 2.计算进位，做与运算的时候只有1和1做与运算，左移一位
 * 3. 将前两步骤的和进行相加（相加又是重复以上两部） 
	*/
	
public int Add(int num1,int num2) {
	int t1,t2;
	do{
	 t1=num1 ^ num2;
	 t2 = (num1 & num2)<<1;
	 
	 num1=t1;
	 num2=t2; //一步一步将其变为0的过程，直到最后再也不会有进位，所以会直接返回t1
	 
	}while(t2!=0);
	   
	return t1;
    }
}
