
public class Helicoptero extends Brinquedo{
	private int direcao = 0;
	
	public void mover() {
		if ( (this.direcao + direcao) > -4 && (this.direcao + direcao) < 4)
			this.direcao += numero;
			System.out.println("direcao: "+ this.direcao);
		
	}

}
