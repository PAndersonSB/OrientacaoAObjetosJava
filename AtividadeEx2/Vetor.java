import java.util.Scanner;

public class Vetor {
	private Professor [] vetor =new Professor[20];
	private String [] erros = new String[100];
	private int posicao = 0;
	
	//inclusão,exclusão e pesquisa.
	
	//1 Caso haja a tentativa de incluir mais de 20 professores, o sistema
	//deverá disparar uma exceção com a mensagem apropriada;
	
	//2 Caso haja a tentativa de incluir um professor já existente no sistema,
	//o sistema deverá disparar uma exceção com a mensagem
	//apropriada
	
	//3 Caso haja a tentativa de excluir um professor inexistente no cadastro,
	//o sistema deverá disparar uma exceção com a mensagem
	//apropriada; A exclusão deverá ocorrer pelo número do cpf;
	
	//4 Caso haja algum problema qualquer na pesquisa, o sistema deverá
	//disparar uma exceção com a mensagem apropriada;
	
	public void incluir() throws RepetidoException , ListaCheiaException{
		System.out.println("ensira os dados do professor !");
		Professor professor = new Professor();
		
		int indiceVazio = null;
		
		for (int c =0 ; c < 20; c+=1) {
			if (vetor[c] == null) {
				indiceVazio = c;
			}
			if (vetor[c] != null) {
				Professor prof = vetor[c];
				
				if (prof.getCpf() == professor.getCpf()) {
					//exception repetido;
					RepetidoException erro = new RepetidoException();
					throw erro;
				}
			}
			
		}
		if (indiceVazio) {
			vetor[indiceVazio] = professor;
		}
		else {
			//exception +20 professores
			ListaCheiaException erro = new ListaCheiaException();
			throw erro;
		}
	}
	
	
	public void excluir() throws NaoEncontradoException{
		System.out.println("ensira o cpf do professor !");
		Scanner teclado = new Scanner(System.in);
		String cpf = teclado.next();
		
		for (int c =0 ; c < 20; c+=1) {// vai do indice 0-20
			
			if (vetor[c] != null) { //verifica se tem um professor naquele indice
				Professor professor = vetor[c];
				
				if (professor.getCpf() == cpf) { // verifica se o cpf daquele professor é == ao do digitado pelo usuario;
					vetor[c] = null;
					break;
				}
				
			}
			
		}
		NaoEncontradoException erro = new NaoEncontradoException();
		throw erro;
		//exception não encontrado;
	}
	
	public void pesquisar() throws NaoEncontradoException{
		System.out.println("ensira o cpf do professor !");
		Scanner teclado = new Scanner(System.in);
		String cpf = teclado.next();
		
		for (int c =0 ; c < 20; c+=1) {
			
			if (vetor[c] != null) {
				Professor professor = vetor[c];
				
				if (professor.getCpf() == cpf) {
					professor.imprimir();
					break;
				}
			}
			
		}
		//exception não encontrado.;
		NaoEncontradoException erro = new NaoEncontradoException();
		throw erro;
		
	}
	public void setErros(String erro) {
		erros[posicao] =erro;
		posicao+=1;
	}
	public void imprimirErros() {
		for(int c = 0; c<posicao ; c++) {
			System.out.println(erros[c]);
		}
	}
	
}
