package decorator;

public class Run {

	public static void main(String[] args) {
		Shape circle = new Circle();
		circle.draw();
		
		System.out.println("");
		
		Shape square = new Square();
		square.draw();
		
		System.out.println("");
		
		Shape decorator = new BorderDecorator(circle);
		decorator.draw();
		
		System.out.println("");
		
		Shape decoratorSquare = new BorderDecorator(square);
		decoratorSquare.draw();
	}

}
