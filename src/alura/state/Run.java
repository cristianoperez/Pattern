package alura.state;

public class Run {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500.0);
		orcamento.aplicarDesconto();
		System.out.println(orcamento);
	}
}

