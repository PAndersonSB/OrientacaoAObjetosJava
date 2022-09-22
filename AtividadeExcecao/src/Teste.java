
public class Teste {
	public static boolean teste1(Vetor vetor) { 
		//tem que ocorrer tudo sem erros
		
		boolean retorno = true;
		
		for(int c=0; c<10 ; c ++) {
			Aluno aluno = new Aluno("Anderson","Eunápolis", c);
			
			try {
				vetor.cadastrar(aluno);
			}
			catch(MatriculaRepetidaException erro){
				System.out.println("Erro: "+ erro.getMessage());
				retorno = false;
			}
		}
		return retorno;
		
	}
		
	public static boolean teste2(Vetor vetor) {
		//tem que ocorrer varios erros 
		
		boolean retorno = false;
		
			for(int c=0; c<10 ; c ++) {
				Aluno aluno = new Aluno("Anderson","Eunápolis", c);
			
				try {
					vetor.cadastrar(aluno);
					retorno = false;
				}
				catch(MatriculaRepetidaException erro){
					//System.out.println("Erro: "+ erro.getMessage());
					retorno = true;
					
				}
			}
			return retorno;
		
	}
	
	public static void main(String[] args) {
		Vetor vetor = new Vetor();
		
		System.out.println(teste1(vetor));
		
		System.out.println(teste2(vetor));
	}

}
