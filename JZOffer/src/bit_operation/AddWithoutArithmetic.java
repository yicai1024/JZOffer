package bit_operation;

public class AddWithoutArithmetic {
/* 1.�����޽�λ��ӣ��������^��
 * 2.�����λ�����������ʱ��ֻ��1��1�������㣬����һλ
 * 3. ��ǰ������ĺͽ�����ӣ���������ظ����������� 
	*/
	
public int Add(int num1,int num2) {
	int t1,t2;
	do{
	 t1=num1 ^ num2;
	 t2 = (num1 & num2)<<1;
	 
	 num1=t1;
	 num2=t2; //һ��һ�������Ϊ0�Ĺ��̣�ֱ�������Ҳ�����н�λ�����Ի�ֱ�ӷ���t1
	 
	}while(t2!=0);
	   
	return t1;
    }
}
