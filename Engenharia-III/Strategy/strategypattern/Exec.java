package strategypattern;

public class Exec {
    public static void main(String[] args) {
		
		Cliente Debora = new Cliente();
        Cliente Maria = new Cliente();
        Cliente Laura = new Cliente();
        Cliente Paulo = new Cliente();

		Debora.setAluguel(new AluguelSocio());
		Debora.realizarAluguel();
		
		System.out.println("-------------------------------------------");
		
		Maria.setAluguel(new AluguelNaoSocio());
		Maria.realizarAluguel();
		
        System.out.println("-------------------------------------------");
		
		Laura.setAluguel(new AluguelSocio());
		Laura.realizarAluguel();

        System.out.println("-------------------------------------------");
		
		Paulo.setAluguel(new AluguelNaoSocio());
		Paulo.realizarAluguel();

        System.out.println("-------------------------------------------");

	}
    
}
