public class ValordaConsulta implements Observer{

    public void update(double valor){
		
		display(valor);
		
	}
	
	public void display(double v){
		
		System.out.println("Agendamento de Consulta");
		System.out.println("O valor da consulta eh: "+v);
	}
    
}
