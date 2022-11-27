public class AplicacaoCliente {

	public static void main(String[] args) {
		ClienteDoBanco cliente = new ClienteDoBanco("Maria Campos Rodrigues");
		ContaBancaria conta = new ContaBancaria("1365-9");

		Imprimir imprimir = new Imprimir();
		imprimir.fazerDeposito(150, cliente, conta);
	}
}