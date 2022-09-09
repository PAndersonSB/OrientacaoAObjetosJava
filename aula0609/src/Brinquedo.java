
public abstract class Brinquedo {
	protected double velocidade;
	protected double aceleracao;
	
	public abstract void mover();
	
	public void velocidade(int vel) {
		velocidade = vel;
	}
	public void velocidade(double vel) {
		velocidade = vel;
	}
	
	public void velocidade(double vel ,double acel) {
		velocidade = vel;
		aceleracao = acel;
	}

}
