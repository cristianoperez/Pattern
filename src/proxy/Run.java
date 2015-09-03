package proxy;
import proxy.dao.imp.PessoaDAOProxy;
import proxy.entity.Pessoa;



public class Run {

	public static void main(String[] args) {
		PessoaDAOProxy pessoaDAOProxy = new PessoaDAOProxy("entityManager");
		
		Pessoa pessoa = pessoaDAOProxy.getPessoa(1L);
		System.out.println(pessoa);
		Pessoa pessoa2 = pessoaDAOProxy.getPessoa(2L);
		System.out.println(pessoa2);
		Pessoa pessoa3 = pessoaDAOProxy.getPessoa(2L);
		System.out.println(pessoa3);
	}
	
}
