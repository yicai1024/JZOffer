package secondCharpter;

public class repWhiteSpace {
/*
 * ��4���滻�ո� (%20 ���滻�ո�) ʱ�临�Ӷȣ�o(n)
 * ��ʾ��1����ͷ��ʼ����һ��������飬�ҳ��ո������
 *      2����β��ͷ��ʼ����ÿһ���ַ����µ�λ��
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
    	int oldIndicator = oldString.length()-1;//ָʾ������ԭʼ����Ӻ���ǰָ
    	char newArr[] = new char[newLen];
    	int newIndicator = newLen;
    	newIndicator--;
    	while(oldIndicator>=0){
    		if(oldString.toCharArray()[oldIndicator]==' '){   		     
    			 newArr[newIndicator--] = '0';
    		     newArr[newIndicator--] = '2';
    		     newArr[newIndicator--] = '%';
    		     
    		}
    		else{//�ǿո�
    			
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
