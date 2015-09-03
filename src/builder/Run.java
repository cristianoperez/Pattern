package builder;

import builder.Pizza.Builder;

public class Run {

	public static void main(String[] args) {
		PizzaBuilder pizzaBuilder = new PizzaBuilder().adicionarMolho("vermelhor").adicionarRecheio("Queijo").escolherMassa("Integral");
		Pizza pizza = pizzaBuilder.getPizza();
		System.out.println(pizza);
		
		Pizza.Builder builder = new Builder("Integral", "Tomate", "Frango");
		Pizza p = builder.build();
		System.out.println(p);
		
		Pizza.Builder builder2 = new Builder("Integral", "Tomate", "Frango").adicionarBordaRecheada("Cheedar");
		Pizza pizza2 = builder2.build();
		System.out.println(pizza2);
	}
	
}
