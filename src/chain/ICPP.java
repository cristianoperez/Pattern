package chain;

public class ICPP extends Imposto {

	@Override
	boolean deveUsarTaxacaoMaxima(Orcamento orcamento) {
		if(orcamento.getValor() > 500){
			return true;
		}
		return false;
	}

	@Override
	Double taxacaoMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	Double taxacaoMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}


}
