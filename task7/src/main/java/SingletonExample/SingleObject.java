 package SingletonExample;

public class SingleObject {

	private static SingleObject obj=new SingleObject();
	private SingleObject()
	{}
	static SingleObject getInstance() 
	{
		return obj;
		
	}
	public void showMessage()
	{
		System.out.println("hello World");
	}
	}