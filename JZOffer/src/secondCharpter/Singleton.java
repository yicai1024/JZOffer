package secondCharpter;

/*public class Singleton { //线程不安全的
	private static Singleton instance;
	private Singleton(){};
	public static Singleton getInatance(){
		if(instance == null){
			instance =new Singleton();
		}
		return instance;
	}

}*/


/*
  2.getInstance加入同步锁：在一个时刻只有一个线程能够获得同步锁，其他线程需等待此线程释放同步锁
     加锁操作十分耗时
*/
/*public class Singleton { //线程安全，但效率低下：
	private static Singleton instance;
	private Singleton(){};
	public static synchronized Singleton getInatance(){
		if(instance == null){
			instance =new Singleton();
		}
		return instance;
	}

}*/

/*
  3.只存在一个实例：
      只需在实例还未创建之前加锁，检测到实例创建后就无需进行加锁操作了 
*/
/*public class Singleton { 
	private static Singleton instance;
	private Singleton(){};
	public static  Singleton getInatance(){
		if(instance == null){//加入匿名内部类来进行判断
			//还未创建就需要加锁
			synchronized(Singleton.class){
				if(instance == null){
					instance=new Singleton();
				}
			}
		}
		return instance;
	}
}*/

/* 推荐
   4. 使用静态构造函数(java中是否存在)
  
*/
public class Singleton { 
	private Singleton(){};
	private static Singleton instance =new Singleton();
	public static Singleton getInstance(){
		return instance;
	}
}
