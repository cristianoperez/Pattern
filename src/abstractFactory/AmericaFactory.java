package abstractFactory;

public class AmericaFactory {

	public Veiculo build(String veiculo) {
		if (veiculo.equalsIgnoreCase("carro")) {
			return new Carro();
		}
		if (veiculo.equalsIgnoreCase("moto")) {
			return new Moto();
		}
		return null;
	}

}
