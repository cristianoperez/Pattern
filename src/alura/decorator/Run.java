package alura.decorator;

public class Run {
	public static void main(String[] args) {
		Imposto icpp = new ICPP(new IKCP());
		Orcamento orcamento = new Orcamento();
		orcamento.setValor(500.0);
		
		Double imposto = icpp.calcularImposto(orcamento);
		System.out.println(imposto);
	}
}
