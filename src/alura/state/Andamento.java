package alura.state;

public class Andamento implements OrcamentoState {

	@Override
	public void aplicarDesconto(Orcamento orcamento) {
		orcamento.setValor( orcamento.getValor() - orcamento.getValor() * 0.05);
	}

}
