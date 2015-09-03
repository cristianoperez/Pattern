package builder2;

public class HamburgerVeg implements Hamburguer {

	@Override
	public String name() {
		return "Veg burger";
	}

	@Override
	public Double price() {
		return 10D;
	}

}
