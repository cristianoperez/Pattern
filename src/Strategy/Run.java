package Strategy;

public class Run {
public static void main(String[] args) {
	Imposto ipi = new IPI();
	System.out.println(ipi.calcular(20.0));
	
	Imposto icms = new ICMS();
	System.out.println(icms.calcular(30.0));
}
}
