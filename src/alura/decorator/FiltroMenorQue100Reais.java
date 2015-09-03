package alura.decorator;

import java.util.ArrayList;
import java.util.List;

public class FiltroMenorQue100Reais extends Filter {

	public FiltroMenorQue100Reais() {

	}
	
	public FiltroMenorQue100Reais(Filter filter) {
		super(filter);
	}

	@Override
	public List<Conta> filtrar(List<Conta> contas) {
		List<Conta> c = new ArrayList<Conta>();
		for (Conta conta : contas) {
			if(conta.getSaldo() < 100){
				c.add(conta);
			}
		}
		if(filter != null){
			c.addAll(filter.filtrar(contas));
		}
		return c;
	}

}
