
public class App {
	public static void fluxo(Vetor vetor,Aluno aluno) {
		try {
			vetor.cadastrar(aluno);
		}
		catch(MatriculaRepetidaException erro){
			System.out.println("Erro: "+ erro.getMessage());
		}
	}
	
public static void main(String[] args) {
	
		Vetor vetor = new Vetor();
		
		Aluno aluno = new Aluno();
		
		fluxo(vetor,aluno);
		fluxo(vetor,aluno);
		//System.out.println(vetor.getVetor(0)); null
		
		
	}

}
