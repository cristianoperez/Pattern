package templateMethod;

public class IPI extends Imposto {

	public IPI(Double valor) {
		super(valor);
	}

	@Override
	void calcular() {
		valor = valor*0.5;
	}
	
}
