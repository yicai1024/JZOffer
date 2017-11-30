package secondCharpter;
/*
  面试题3：二维数组中的查找
  二维数组，从左到右，从上到下递增
 时间复杂度：o(rol)
*/
public class FindInTwoDimenArr {
	/*
	 * 左下和右上开始考虑 
	*/
	public static boolean find(int arr[][],int target){
		int row=arr.length,col=arr[0].length;
		boolean found=false;
		if(target<arr[0][0] || target > arr[row-1][col-1]){//arr.length 行数 | arr[].length 列数
			//target过大或者过小
			return found;
		}
		else{
			//target有可能在arr数组中
			//target 大于右上的数字，砍掉这个数字位于的行，直接行++
			//target 小于右上的数字，砍掉这个数字位于的列，直接列--
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
