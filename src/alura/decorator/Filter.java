package alura.decorator;

import java.util.List;

public abstract class Filter {

	protected Filter filter;
	
	public Filter() {
	}
	
	public Filter(Filter filter){
		this.filter = filter;
	}
	
	public abstract List<Conta> filtrar(List<Conta> contas);
	
}
