/**me*/
public class Mine{
	//单例模式
	private static Singleton uniqueInstance;
	private Singleton(){}
	public static Singleton getInstance(){
		if(uniqueInstance==null){
			uniqueInstance=new Singleton();
		}
		return uniqueInstance;
	}
}
