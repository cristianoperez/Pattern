package templateMethod;

public abstract class Imposto {
	
	Double valor;
	
	public Imposto(Double valor) {
		this.valor = valor;
	}
	
	abstract void calcular();
	
	public Double getValor(){
		calcular();
		return valor;
	}
}
