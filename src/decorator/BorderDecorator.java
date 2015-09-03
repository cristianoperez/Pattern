package decorator;

public class BorderDecorator implements Shape {

	private Shape shape;
	
	public BorderDecorator(Shape shape) {
		this.shape = shape;
	}

	@Override
	public void draw() {
		shape.draw();
		addBorder("Red");
	}
	
	private void addBorder(String color){
		System.out.println("Decorating with " + color + " border");
	}
}
