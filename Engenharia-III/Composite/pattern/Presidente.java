public class Presidente extends Supervisor{

	public Presidente(String nomeDoSupervisor) {
		super(nomeDoSupervisor);
		this.nomeFuncionario = nomeDoSupervisor;
	}
	@Override
    public void printNomeDoFuncionario() {
        System.out.println(this.nomeFuncionario);
        for (Funcionario funcionarioTmp : funcionarios) {
            funcionarioTmp.printNomeDoFuncionario();
        }
    }
	
	@Override
	public void adicionar(Funcionario novoFuncionario) {
	}
	
	@Override
	protected void remover(Funcionario funcionario) {
	}
}