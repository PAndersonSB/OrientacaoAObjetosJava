
public class Caminhao extends Brinquedo {
	private int direcao = 0;
	
	public void mover(int numero) {
		if ( (this.direcao + direcao) > -91 && (this.direcao + direcao) < 91)
			this.direcao += numero*5;
			System.out.println("direcao: "+ this.direcao);
		
	}

}
