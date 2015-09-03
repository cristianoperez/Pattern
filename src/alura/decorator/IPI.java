package alura.decorator;

public class IPI extends Imposto{

	public IPI() {
	}
	
	public IPI(Imposto imposto){
		super(imposto);
	}
	
	@Override
	boolean deveUsarTaxacaoMaxima(Orcamento orcamento) {
		return true;
	}

	@Override
	Double taxacaoMinima(Orcamento orcamento) {
		return taxacaoMaxima(orcamento);
	}

	@Override
	Double taxacaoMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.20;
	}

}
