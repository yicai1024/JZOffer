package bit_operation;

public class NumberOfOne {
/*	//ÿ������һλ��Ȼ��%2����1�Ļ��������һλΪ1�������ʱ�临�Ӷ�Ϊ�������������n�Ķ�����λ
	public static int NumberOf1(int n) {
		int index=0;
		if(n>0){
		     while(n!=0){
			    if(n%2==1)
				    index++;
			    n=n>>1;
		     }
	    }else if(n<0){//һ������ȡ����ض���һλΪ0�����Բ��õ���+1��������λ
			
			int a=(~n)+1;//��λȡ�������λԭ��Ϊ1ȡ�����Ϊ��0,Ȼ���1�����Ǹ����Ĳ����ʾ
			 System.out.println(a);
			while(a!=0){
				if(a%2==1)
					index++;
				a=a>>1;
			}
			index++;	//����Ǹ��������ʾ��ʽΪ �����ֵ��Դ�룩��λ(�����λ�������λһ��Ϊ1)ȡ�������룩���ڼ�1�����룩
		}
		return index;
	*/
	
	/*��һ��˼·�����nΪ�������ƿ��ܻ�������ѭ������ô�Ҿͽ�1��ͣ������n�������㣬
	ֱ������k��֮���1�Ѿ�������ԭ���Ϳ���ֹͣ�����ˣ���¼��������Ϊ1�ĸ����ʹ���ԭ���ж���λ1
	*/	
	public static int NumberOf1(int n) {
	   int index=0,temp=1;
	   while(temp<=Math.abs(n)){//��Ϊtemp!=0 ,�������0��ʾ�Ѿ���������������λ��
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
