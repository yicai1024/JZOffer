package secondCharpter;
/*
  ������3����ά�����еĲ���
  ��ά���飬�����ң����ϵ��µ���
 ʱ�临�Ӷȣ�o(rol)
*/
public class FindInTwoDimenArr {
	/*
	 * ���º����Ͽ�ʼ���� 
	*/
	public static boolean find(int arr[][],int target){
		int row=arr.length,col=arr[0].length;
		boolean found=false;
		if(target<arr[0][0] || target > arr[row-1][col-1]){//arr.length ���� | arr[].length ����
			//target������߹�С
			return found;
		}
		else{
			//target�п�����arr������
			//target �������ϵ����֣������������λ�ڵ��У�ֱ����++
			//target С�����ϵ����֣������������λ�ڵ��У�ֱ����--
			int rowIndex=0,colIndex=col-1;
			while(rowIndex<row&&colIndex>=0){
				if(target > arr[rowIndex][colIndex])
					rowIndex++;
				else {
					if(target < arr[rowIndex][colIndex])
					  colIndex--;
					else{
						found= true;
						System.out.println("arr["+rowIndex+"]["+colIndex+"]=target:"+target);
						break;
					}
					} 
			  }							
			}
			return found;
		}
		
	
	
	public static void main(String args[]){
		int arr[][] ={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		find(arr,9);
	}

}
