public class Exec {
    
    public static void main(String[] args) {
		
		Banco b = new Banco();
		TValordaConsulta tela = new ValordaConsulta();
		TelaCelular cel = new TelaCelular();
		b.registerObserver(tela);
		b.registerObserver(cel);
		
		Cliente marilia = new Cliente(500.0, "76767A", "njvd98078");
		
		marilia.saldo = b.sacar(marilia, 200.0);
		
		
		
		
	}

}
