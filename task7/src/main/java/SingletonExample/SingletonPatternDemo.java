 package singletonExample;

public class SingletonPatternDemo {


public static void main(String a[])
{
	SingleObject object=SingleObject.getInstance();
	object.showMessage();
}
}