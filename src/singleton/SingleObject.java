package singleton;

public class SingleObject {

	private final static SingleObject singleObject = new SingleObject();
	
	private SingleObject() {
		new AssertionError("Not Singleton instance for you!");
	}
	
	public static SingleObject getInstance(){
		return singleObject;
	}
	
	public void msg(){
		System.out.println("Hello from the only SingleObject instance object");
	}
}
