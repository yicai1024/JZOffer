package stack;

import java.util.Stack;

public class ImplyingQueueByUsingStack {
	
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	if(stack2.size()>0){//���stack2��Ϊ�յĻ���������������Ƚ��г�ջ
    		return stack2.pop();   		
    	}
    	else
    	{
    	  while(stack1.size()>0){
    		  stack2.push(stack1.pop());//�Ƚ�stack1�ĳ�ջ����stack2��
    	}
    	 return stack2.pop(); 
    	}
    	  
    }

}
