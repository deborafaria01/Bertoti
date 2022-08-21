package antipattern;

//Comportamento de emprestar livros da biblioteca: Estudantes e Professores tem condicoes especiais

//O problema eh que o emprestimo sem condicoes especiais esta sendo
//duplicado nas classes Estudante e Outros

//Conclusao: Heranca eh um antipattern

public abstract class Cliente {
	
	private String cadastro;
	
	//emprestar com condicoes especiais
	public void emprestar() {
		
	}

}