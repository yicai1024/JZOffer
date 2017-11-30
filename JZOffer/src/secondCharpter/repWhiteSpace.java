package secondCharpter;

public class repWhiteSpace {
/*
 * 题4：替换空格 (%20 来替换空格) 时间复杂度：o(n)
 * 提示：1）从头开始遍历一个这个数组，找出空格的数量
 *      2）从尾到头开始复制每一个字符到新的位置
*/	public static int find(String s){
	    if(s.length()>0){
	    	int whiteSpaceNum=0;
	    	int i=0;
	    	while(i<s.toCharArray().length){
	    		if(s.toCharArray()[i]==' ' ){
	    			whiteSpaceNum++;
	    		}
	    		i++;
	    	}
	    	return whiteSpaceNum; 
	    }
	    else
	    	return -1;
	
    }

    public static String copy2newString(StringBuffer str){
    	String oldString = str.toString();
    	int whiteSpaceNum=find(oldString);
    	if(oldString.length()>0&&whiteSpaceNum>=0){
    	int newLen = oldString.length() + whiteSpaceNum*2;
    	int oldIndicator = oldString.length()-1;//指示器，从原始数组从后往前指
    	char newArr[] = new char[newLen];
    	int newIndicator = newLen;
    	newIndicator--;
    	while(oldIndicator>=0){
    		if(oldString.toCharArray()[oldIndicator]==' '){   		     
    			 newArr[newIndicator--] = '0';
    		     newArr[newIndicator--] = '2';
    		     newArr[newIndicator--] = '%';
    		     
    		}
    		else{//非空格
    			
    			newArr[newIndicator--] = oldString.toCharArray()[oldIndicator];
    		}   			
    		oldIndicator--;
    	}
    	return String.valueOf(newArr);
    	}
    	else  
    		return oldString;
   	
    }
    
    public static void main(String args[]){
    	StringBuffer s = new StringBuffer("");
    	System.out.println(copy2newString(s));
    	
    	
    }

}
