package stack;

import java.util.Stack;

public class ImplyingQueueByUsingStack {
	
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	if(stack2.size()>0){//如果stack2不为空的话就让里面的内容先进行出栈
    		return stack2.pop();   		
    	}
    	else
    	{
    	  while(stack1.size()>0){
    		  stack2.push(stack1.pop());//先将stack1的出栈出到stack2里
    	}
    	 return stack2.pop(); 
    	}
    	  
    }

}
