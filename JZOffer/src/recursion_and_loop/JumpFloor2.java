package recursion_and_loop;

public class JumpFloor2 {
	public static int jumpFloor(int n){//f(n)=2^(n-1)
		// 0台阶时有一种跳法
		return (int) Math.pow(2, n-1);
		
       
    }
}
