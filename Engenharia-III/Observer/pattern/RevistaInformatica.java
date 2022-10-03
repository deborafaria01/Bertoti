import java.util.Observable;

public class RevistaInformatica extends Observable {

	private int edicao;

	public void setNovaEdicao(int novaEdicao) {
		this.edicao = novaEdicao;

		setChanged();
		notifyObservers();
	}

	public int getEdicao() {
		return this.edicao;
	}

	public static void main(String[] args) {
		//poderia receber a nova edicao atraves de um recurso externo
		int novaEdicao = 3;
		RevistaInformatica revistaInformatica = new RevistaInformatica();
		new Assinante1(revistaInformatica);

		revistaInformatica.setNovaEdicao(novaEdicao);
	}

}

