package proxy.dao.imp;

import proxy.dao.PessoaDAO;
import proxy.entity.Pessoa;

class PessoaDAOImpl implements PessoaDAO {
	
	private String entityManager;

	public PessoaDAOImpl(String entityManager) {
		this.entityManager = entityManager;
	}

	public Pessoa getPessoa(Long id) {
		System.out.println("Buscando pessoa "+ id +" no banco...");
		return new Pessoa(id, "Juquinha");
	}

}
