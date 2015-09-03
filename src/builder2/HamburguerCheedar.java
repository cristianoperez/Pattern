package builder2;

public class HamburguerCheedar implements Hamburguer{

	@Override
	public String name() {
		return "Cheedar burguer";
	}

	@Override
	public Double price() {
		return 5.0;
	}

}
