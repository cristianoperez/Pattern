package chain;

public abstract class Imposto {

	public Double calcularImposto(Orcamento orcamento){
		if(deveUsarTaxacaoMaxima(orcamento)){
			return taxacaoMaxima(orcamento);
		} else {
			return taxacaoMinima(orcamento);
		}
	}

	abstract boolean deveUsarTaxacaoMaxima(Orcamento orcamento);

	abstract Double taxacaoMinima(Orcamento orcamento);

	abstract Double taxacaoMaxima(Orcamento orcamento);
	
	
}
