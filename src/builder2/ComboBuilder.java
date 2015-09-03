package builder2;

public class ComboBuilder {
	
	private Combo combo;

	public ComboBuilder() {
		this.combo = new Combo();
	}
	
	public ComboBuilder escolherHamburguer(Hamburguer hamburger){
		combo.setHamburguer(hamburger);
		return this;
	}
	
	public ComboBuilder escolherBebida(Bebida bebida){
		combo.setBebida(bebida);
		return this;
	}
	
	public ComboBuilder escolherAcompanhamento(Acompanhamento acompanhamento){
		combo.setAcompanhamento(acompanhamento);
		return this;
	}
	
	public Combo getCombo() {
		return combo;
	}
	
}
