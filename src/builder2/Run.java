package builder2;

public class Run {

	public static void main(String[] args) {
		ComboBuilder comboBuilder = new ComboBuilder();
		comboBuilder.escolherHamburguer(new HamburgerVeg());
		comboBuilder.escolherBebida(new CocaCola());
		comboBuilder.escolherAcompanhamento(new Nugget());
		Combo combo = comboBuilder.getCombo();
		
		Combo combo2 = new ComboBuilder().escolherAcompanhamento(new Batata()).escolherBebida(new CocaCola()).escolherHamburguer(new HamburguerCheedar()).getCombo();
		
		Pedido pedido = new Pedido();
		pedido.adicionarItem(combo);
		pedido.adicionarItem(combo2);
		
		pedido.showItens();
		System.out.println("Total R$ "+pedido.getPrice());
	}
}
