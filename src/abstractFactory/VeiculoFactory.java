package abstractFactory;

public class VeiculoFactory {

	public Veiculo build(String location, String veiculo){
		/*
		String factoryLocation = loadLocationLogic();
		*/
		
		if(location.equalsIgnoreCase("china")){
			return new ChinaFactory().build(veiculo);
		}
		if(location.equalsIgnoreCase("america")){
			return new AmericaFactory().build(veiculo);
		}
		return null;
	}
}
