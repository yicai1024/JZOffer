package array;

public class GreatestSumOfSubArray {
	//temp������¼�ߵ���i��ǰ��i-1����ǰ��ĺͣ����ǰ���f(n-1)<=0����n����0����ôǰ��ĺ�ȫ����������n��ʼ�������¼���
	//������Ҫһ���������max��������ֹ������ֵ
   public static int FindGreatestSumOfSubArray(int[] array) {
       
	   int max_sum=array[0],temp=array[0];//��¼ ÿһ��������
        int index=1;
	    while(index<array.length){//�ҳ��ݹ����ֹ����
	    	if(temp<0){//���ǰ����ۼӺ�С��0��ôȫ�����еľ�Ӧ��������ֱ�����������Ԫ�س���
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
