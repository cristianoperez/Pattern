package templateMethod;

public class ICMS extends Imposto{

	public ICMS(Double valor) {
		super(valor);
	}

	@Override
	void calcular() {
		valor = valor*2;
	}

}
