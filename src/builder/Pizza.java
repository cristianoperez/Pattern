package builder;

public class Pizza {

	private String massa;
	private String molho;
	private String recheio;
	private String borda = "Simples";

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	
	public String getBorda() {
		return borda;
	}

	public void setBorda(String borda) {
		this.borda = borda;
	}

	
	@Override
	public String toString() {
		return "Pizza [massa=" + massa + ", molho=" + molho + ", recheio="
				+ recheio + ", borda=" + borda + "]";
	}

	public static class Builder {

		private String molho;
		private String massa;
		private String recheio;
		private String borda = "Simples";
		
		public Builder(String massa, String molho, String recheio){
			this.massa = massa;
			this.molho = molho;
			this.recheio = recheio;
		}
		
		public Builder adicionarBordaRecheada(String sabor){
			this.borda = sabor;
			return this;
		}
		
		public Pizza build(){
			Pizza pizza = new Pizza();
			pizza.setBorda(borda);
			pizza.setMassa(massa);
			pizza.setMolho(molho);
			pizza.setRecheio(recheio);
			return pizza;
		}
	}
}


