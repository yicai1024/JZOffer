package secondCharpter;

/*public class Singleton { //�̲߳���ȫ��
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
  2.getInstance����ͬ��������һ��ʱ��ֻ��һ���߳��ܹ����ͬ�����������߳���ȴ����߳��ͷ�ͬ����
     ��������ʮ�ֺ�ʱ
*/
/*public class Singleton { //�̰߳�ȫ����Ч�ʵ��£�
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
  3.ֻ����һ��ʵ����
      ֻ����ʵ����δ����֮ǰ��������⵽ʵ���������������м��������� 
*/
/*public class Singleton { 
	private static Singleton instance;
	private Singleton(){};
	public static  Singleton getInatance(){
		if(instance == null){//���������ڲ����������ж�
			//��δ��������Ҫ����
			synchronized(Singleton.class){
				if(instance == null){
					instance=new Singleton();
				}
			}
		}
		return instance;
	}
}*/

/* �Ƽ�
   4. ʹ�þ�̬���캯��(java���Ƿ����)
  
*/
public class Singleton { 
	private Singleton(){};
	private static Singleton instance =new Singleton();
	public static Singleton getInstance(){
		return instance;
	}
}
