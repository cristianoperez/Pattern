package alura.decorator;

public abstract class Imposto {
	
	private Imposto imposto;
	
	public Imposto() {

	}
	
	public Imposto(Imposto imposto) {
		this.imposto = imposto;
	}

	public Double calcularImposto(Orcamento orcamento){
		if(deveUsarTaxacaoMaxima(orcamento)){
			return taxacaoMaxima(orcamento) + calcularNovoImposto(imposto, orcamento);
		} else {
			return taxacaoMinima(orcamento) + calcularNovoImposto(imposto, orcamento);
		}
	}
	
	private Double calcularNovoImposto(Imposto imposto, Orcamento orcamento){
		if(imposto == null){
			return 0.0;
		}
		return imposto.calcularImposto(orcamento);
	}

	abstract boolean deveUsarTaxacaoMaxima(Orcamento orcamento);

	abstract Double taxacaoMinima(Orcamento orcamento);

	abstract Double taxacaoMaxima(Orcamento orcamento);
	
	
}
