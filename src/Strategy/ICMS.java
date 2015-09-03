package Strategy;

public class ICMS implements Imposto {

	@Override
	public Double calcular(Double valor) {
		return valor*2;
	}

}
