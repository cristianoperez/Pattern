package bridge;

public class Circle implements DrawingAPI{

	@Override
	public void draw() {
		System.out.println("Drawing red circle");
	}

}
