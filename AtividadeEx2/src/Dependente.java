import java.util.Scanner;

public class Dependente {
	private String nome;
	private int idade;
	private String sexo;
	
	//nome,idade,sexo. Nem
	//todo professor possuirá um dependente.
	
	public Dependente() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("nome: ");
		nome= teclado.next();
		System.out.println("");
		
		System.out.print("idade: ");
		idade = teclado.nextInt();
		System.out.println("");
		
		System.out.print("sexo: ");
		sexo = teclado.next();
		System.out.println("");
		
	}

}
