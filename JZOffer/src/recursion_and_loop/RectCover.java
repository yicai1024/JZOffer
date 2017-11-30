package recursion_and_loop;

public class RectCover {
	public int RectCover(int target) {
		 int f1=1,f2=2,fn=0;
		if(target ==0 )
        	fn=0;
        if(target ==1)
        	fn= 1;
        if(target==2)
        	fn= 2;
       
        while((target--)>2){
           fn=f1+f2;
           f1=f2;
           f2=fn;       	
        }
		return fn;
    }
}
