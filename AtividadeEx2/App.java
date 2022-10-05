import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Vetor vetor = new Vetor();
		Scanner teclado = new Scanner(System.in);
		int rotina ;
		
		while (true) {//inclusão,exclusão e pesquisa.
			System.out.println("você deseja ...1 inclusão 2 exclusão 3 pesquisa");
			rotina= teclado.nextInt();
			
			if (rotina == 1) {
				//try
				try {
					vetor.incluir();
				}
				catch(RepetidoException erro) {
					System.out.println("Erro: "+ erro.getMessage());
					vetor.setErros(erro.getMessage());
				}
				catch(ListaCheiaException erro){
					System.out.println("Erro: "+ erro.getMessage());
					vetor.setErros(erro.getMessage());
				}
				
				
			}
			else if(rotina == 2) {
				//try
				try {
					vetor.excluir();
				}
				catch(NaoEncontradoException erro) {
					System.out.println("Erro: "+ erro.getMessage());
					vetor.setErros(erro.getMessage());
				}
			}
			else if (rotina == 3) {
				//try
				try {
					vetor.pesquisar();	
				}
				catch(NaoEncontradoException erro) {
					System.out.println("Erro: "+ erro.getMessage());
					vetor.setErros(erro.getMessage());
				}
			}
			else {
				break;
			}
			
		}
		
	}
}
