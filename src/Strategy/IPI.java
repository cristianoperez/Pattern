package Strategy;

public class IPI implements Imposto{

	@Override
	public Double calcular(Double valor) {
		return valor*1.5;
	}

}
