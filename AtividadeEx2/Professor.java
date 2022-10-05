import java.util.Scanner;

public class Professor {
	private String nome;
	private int idade;
	private String sexo;
	private String cpf;
	private String rg;
	private String endereco;
	private Dependente dependente ;
	//nome, idade,sexo,cpf,rg,endereço
	
	public Professor() {
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
		
		System.out.print("cpf: ");
		cpf= teclado.next();
		System.out.println("");
		
		System.out.print("rg: ");
		rg= teclado.next();
		System.out.println("");
		
		System.out.print("endereco: ");
		endereco = teclado.next();
		System.out.println("");
		
		System.out.print("este professor possui dependente? SIM ou não");
		String possuiDependente = teclado.next();
		
		if (possuiDependente == "SIM" || possuiDependente == "sim" || possuiDependente == "Sim") {
			dependente = new Dependente();
		}else {
			dependente = null;
		}
		
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void imprimir() {
		System.out.println("nome "+ nome);
		System.out.println("idade "+ idade);
		System.out.println("sexo "+ sexo);
		System.out.println("cpf "+ cpf);
		System.out.println("rg "+ rg);
		System.out.println("endereco "+ endereco);
		System.out.println("dependente "+ dependente);
	}
	
}
