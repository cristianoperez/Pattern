package factory;

public class ShapeFactory {

	public Shape getShape(String shape){
		if(shape == null){
			return null;
		}
		if(shape.equals("CIRCLE")){
			return new Circle();
		}
		if(shape.equals("SQUARE")){
			return new Square();
		}
		return null;
	}
}
