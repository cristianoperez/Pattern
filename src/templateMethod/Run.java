package templateMethod;

public class Run {

	public static void main(String[] args) {
		Imposto icms = new ICMS(100.00);
		System.out.println(icms.getValor());
		
		Imposto ipi = new IPI(50.0);
		System.out.println(ipi.getValor());
	}
}
