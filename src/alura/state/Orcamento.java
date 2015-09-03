package alura.state;



public class Orcamento {

	private Double valor;
	private int estadoNoBanco = 4;

	public Orcamento(Double valor) {
		this.valor = valor;
	}
	 
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public OrcamentoState getState() {
		return EstadoFactory.getEstado(estadoNoBanco);
	}

	public void aplicarDesconto(){
		getState().aplicarDesconto(this);
	}

	@Override
	public String toString() {
		return "Orcamento [valor=" + valor + ", state=" + getState().getClass().getName() + "]";
	}
 
	
}
