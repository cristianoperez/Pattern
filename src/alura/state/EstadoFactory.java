package alura.state;

import java.util.HashMap;
import java.util.Map;

public class EstadoFactory {
	
	private static Map<Integer, OrcamentoState> stateMap = new HashMap<Integer, OrcamentoState>();

	static {
		stateMap.put(1, new Andamento());
		stateMap.put(2, new Aprovado());
		stateMap.put(3, new Reprovado());
		stateMap.put(4, new Finalizado());
	}

	public static OrcamentoState getEstado(int estado) {
		return stateMap.get(estado);
	}
	
	public Map<Integer, OrcamentoState> getStateMap() {
		return stateMap;
	}

}
