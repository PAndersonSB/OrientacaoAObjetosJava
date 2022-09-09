
public class App {
	public static void main(String[] args) {
		
		ControleRemoto controle = new ControleRemoto();
		Brinquedo caminhao = new Caminhao();
		
		controle.setBrinquedo(caminhao);
		
		controle.virarDireita();
		
	}

}
