package builder2;

public class HamburguerSimples implements Hamburguer{

	@Override
	public String name() {
		return "Hamburger simples";
	}

	@Override
	public Double price() {
		return 2.50;
	}

}
