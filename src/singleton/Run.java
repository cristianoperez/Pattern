package singleton;

public class Run {

	public static void main(String[] args) {
		SingleObject singleInstance = SingleObject.getInstance();
		singleInstance.msg();
	}
}
