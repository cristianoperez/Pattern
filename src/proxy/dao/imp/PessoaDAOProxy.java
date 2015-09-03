package proxy.dao.imp;

import java.util.ArrayList;
import java.util.List;

import proxy.dao.PessoaDAO;
import proxy.entity.Pessoa;

public class PessoaDAOProxy implements PessoaDAO {
	
	private List<Pessoa> pessoasCache = new ArrayList<Pessoa>();
	private PessoaDAO pessoaDAO;
	
	public PessoaDAOProxy(String entityManager) {
		this.pessoaDAO = new PessoaDAOImpl(entityManager);
	}
	
	public Pessoa getPessoa(Long id){
		Pessoa pessoaInCache = findPessoaInCache(id);
		if(pessoaInCache == null){
			Pessoa pessoa = pessoaDAO.getPessoa(id);
			pessoasCache.add(pessoa);
			return pessoa;
		}
		return pessoaInCache;
	}
	
	public Pessoa getPessoa(Long id, boolean cleanCache){
		if(cleanCache){
			cleanCache();
		}
		return getPessoa(id);
	}

	private Pessoa findPessoaInCache(Long id) {
		for(Pessoa pessoa : pessoasCache){
			if(pessoa.getId() == id){
				return pessoa;
			}
		}
		return null;
	}
	
	public void cleanCache(){
		pessoasCache.clear();
	}
	
}
