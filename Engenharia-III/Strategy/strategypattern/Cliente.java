package strategypattern;

public class Cliente{
    
    private Aluguel aluguel; 
	
	public void setAluguel(Aluguel aluguel){
		this.aluguel = aluguel;
	}
	
	public void realizarAluguel() {
		this.aluguel.alugar();
	}
}
