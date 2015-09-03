package alura.state;

public class Aprovado implements OrcamentoState {

	@Override
	public void aplicarDesconto(Orcamento orcamento) {
		orcamento.setValor( orcamento.getValor() - orcamento.getValor() * 0.2 );
	}

}
