package builder2;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private List<Combo> combos = new ArrayList<Combo>();
	
	public Double getPrice(){
		Double total = 0.0;
		for(Combo combo : combos){
			total += combo.getPrice();
		}
		return total;
	}
	
	public void showItens() {
		int i = 1;
		for(Combo combo : combos){
			System.out.println("Combo "+i);
			System.out.println(combo.getHamburguer().name());
			System.out.println(combo.getBebida().name());
			System.out.println(combo.getAcompanhamento().name());
			System.out.println();
			i++;
		}
	}
	
	public void adicionarItem(Combo combo){
		combos.add(combo);
	}
}
