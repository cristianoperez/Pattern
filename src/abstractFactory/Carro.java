package abstractFactory;

public class Carro implements Veiculo {

	@Override
	public void construir() {
		System.out.println("construindo carro");
	}

}
