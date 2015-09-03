package builder2;

public class Combo {

	private Hamburguer hamburguer;
	private Bebida bebida;
	private Acompanhamento acompanhamento;

	public Hamburguer getHamburguer() {
		return hamburguer;
	}

	public void setHamburguer(Hamburguer hamburguer) {
		this.hamburguer = hamburguer;
	}

	public Bebida getBebida() {
		return bebida;
	}

	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}

	public Acompanhamento getAcompanhamento() {
		return acompanhamento;
	}

	public void setAcompanhamento(Acompanhamento acompanhamento) {
		this.acompanhamento = acompanhamento;
	}
	
	public Double getPrice(){
		Double total = 0.0;
		total += hamburguer.price();
		total += acompanhamento.price();
		total += bebida.price();
		return total;
	}

}
