
public class ControleRemoto{ //extends Brinquedo{
	private Brinquedo brinquedo;
	
	public void setBrinquedo(Brinquedo brinquedo){
		this.brinquedo = brinquedo;
	}
	
	public void virarDireita() {
		System.out.println("virou para direita");
		brinquedo.mover();
	}
	public void virarEsquerda() {
		System.out.println("virou para esquerda");
		brinquedo.mover();
	}
	
	public void acelerar(int vel) {
		brinquedo.velocidade(vel);
	}
	public void acelerar(double vel) {
		brinquedo.velocidade(vel);
	}
	public void acelerar(double vel ,double acel) {
		brinquedo.velocidade(vel, acel);
	}
	
}
