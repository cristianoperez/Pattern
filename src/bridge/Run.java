package bridge;

public class Run {
	public static void main(String[] args) {
		DrawingAPI c = new Circle();
		c.draw();
		
		DrawingAPI s = new Square();
		s.draw();
		
		ColorShape colorShape = new ColorShape(c);
		colorShape.draw();
		colorShape.addRedBorder();
	}
}
