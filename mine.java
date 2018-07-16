
public class Mine{
	//ta
	//单例模式me
	private static Singleton uniqueInstance;
	private Singleton(){}
	public static Singleton getInstance(){
		if(uniqueInstance==null){
			uniqueInstance=new Singleton();
		}
		return uniqueInstance;
	}
}
