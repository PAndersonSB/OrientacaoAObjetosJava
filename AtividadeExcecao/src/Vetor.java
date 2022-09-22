
public class Vetor {
	Aluno [] vetor = new Aluno[100];
	
	public Aluno getVetor(int matricula) {
		return vetor[matricula];
	}
	public void imprimir(int matricula) {
		
	}
	
	public void cadastrar(Aluno aluno) throws MatriculaRepetidaException {
		if (vetor[aluno.getMatricula()] == null) {
			vetor[aluno.getMatricula()] = aluno;
		}
		else {
			MatriculaRepetidaException erro = new MatriculaRepetidaException( aluno.getMatricula() );
			throw erro;
			//erro
		}
		
	}
	
}
