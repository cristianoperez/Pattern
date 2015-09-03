package alura.decorator;

public class IKCP extends Imposto {

	public IKCP() {
	}
	
	public IKCP(Imposto imposto){
		super(imposto);
	}
	
	private boolean temItemMaior100(Orcamento orcamento) {
		for(Item item : orcamento.getItens()){
			if(item.getValor() > 100){
				return true;
			}
		}
		return false;
	}

	@Override
	boolean deveUsarTaxacaoMaxima(Orcamento orcamento) {
		if(orcamento.getValor() > 500 && temItemMaior100(orcamento)){
			return true;
		}
		return false;
	}

	@Override
	Double taxacaoMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.5;
	}

	@Override
	Double taxacaoMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.7;
	}

}
