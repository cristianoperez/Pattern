package alura.decorator;

import java.util.ArrayList;
import java.util.List;

public class FiltroMaiorQue500Reais extends Filter {

	public FiltroMaiorQue500Reais() {

	}
	
	public FiltroMaiorQue500Reais(Filter filter){
		super(filter);
	}
	
	@Override
	public List<Conta> filtrar(List<Conta> contas) {
		List<Conta> c = new ArrayList<Conta>();
		for (Conta conta : contas) {
			if(conta.getSaldo() > 500){
				c.add(conta);
			}
		}
		if(filter != null){
			c.addAll(filter.filtrar(contas));
		}
		return c;
	}

}
