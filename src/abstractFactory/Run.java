package abstractFactory;

public class Run {
	public static void main(String[] args) {
		VeiculoFactory veiculoFactory = new VeiculoFactory();
		Veiculo veiculo = veiculoFactory.build("china", "carro");
		veiculo.construir();
	}
}
