package alura.decorator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RunFilter {

	public static void main(String[] args) {
		Filter filter = new FiltroMenorQue100Reais(new FiltroMaiorQue500Reais());
		
		List<Conta> contas = new ArrayList<Conta>();
		contas.add(new Conta(200.0, new Date()));
		contas.add(new Conta(50.0, new Date()));
		contas.add(new Conta(1000.0, new Date()));
		System.out.println(filter.filtrar(contas));
	}
}
