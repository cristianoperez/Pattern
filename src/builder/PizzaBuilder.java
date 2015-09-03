package builder;
class PizzaBuilder {

	private Pizza pizza;
	
	public PizzaBuilder() {
		this.pizza = new Pizza();
	}
	
	public Pizza getPizza(){
		return this.pizza;
	}
	
	public PizzaBuilder adicionarMolho(String molho){
		pizza.setMolho(molho);
		return this;
	}
	
	public PizzaBuilder escolherMassa(String massa){
		pizza.setMassa(massa);
		return this;
	}
	
	public PizzaBuilder adicionarRecheio(String recheio){
		pizza.setRecheio(recheio);
		return this;
	}
}