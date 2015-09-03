package bridge;

public class ColorShape {

	private DrawingAPI api;

	public ColorShape(DrawingAPI api) {
		this.api = api;
	}
	
	public void draw(){
		api.draw();
	}
	
	public void addRedBorder(){
		System.out.println("with red border.");
	}
}
