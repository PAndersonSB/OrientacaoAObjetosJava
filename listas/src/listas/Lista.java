package listas;
import java.util.ArrayList;

public class Lista {
	ArrayList<Livro> lista = new ArrayList();
	
	//- Obter Livro
		//O método deverá receber um objeto Livro como parâmetro
		//e deverá retornar o livro semelhante mas que estará na
		//coleção;
	public Livro getLivro(Livro livro) {
		// percorre a lista e retorna um livro com msm isbn;
		for (Livro object : lista) {
			if (object.getIsbn() == livro.getIsbn()) {
				return object;
			}
		}
		return null;
	}

	//- Adicionar o objeto Livro na Coleção;
	//O método receberá um objeto livro e armazenará na
	//Coleção;
	public void adicionar(Livro livro) {
		//verificar se é repetido;
		if(verificarExiste(livro)) {
			// ja existe
			System.out.println("repetido");
		}
		else {
			lista.add(livro);
		}
		
	}
	
	//-Remover o objeto Livro da Coleção
	//O método receberá um objeto livro e removerá da Coleção;
	
	public void remover(Livro livro) {
		//procurar o livro;
		Livro livroInLista = getLivro(livro);
		
		if (livroInLista.getIsbn() == livro.getIsbn()) {
			//remover o livro;
			lista.remove(livroInLista);
		}
		else {
			System.out.println("livro não encontrado");
		}
	}
	
	//-Imprimir conteúdo da Lista
	//O método será responsável em apresentar todas as
	//informações que consta na lista;
	public void imprimir(){
		for (Livro object : lista) {
			// imprimir informacoes
			System.out.println(object);
		}
	}
	
	//-Verificar se determinado Livro existe na Lista
	//O método receberá um objeto Livro e deverá verificar se
	//determinado livro existe na Lista;
	public boolean verificarExiste(Livro livro) {
		// percorrer lista;
		if(listaVazia()) {
			return false;
		}
		else {
			if (getLivro(livro) != null) {
				return true;
			}
			else {
				return false;
			}
		}
		
	}
	
	//- Verificar se a lista está vazia;
	//O método deverá retornar um valor booleano que
	//determinará se a lista estará vazia ou cheia;
	public boolean listaVazia() {
		if(lista.size() <1) {
			return true;
		}
		else {
			return false;
		}
	}

}
