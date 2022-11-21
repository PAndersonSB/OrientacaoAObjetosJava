package listas;

public class Livro {
	private int isbn;//Isbn - Número que identifica um livro, livros com mesmo
	//Isbn são considerados iguais;
	private String autor;//autor - Nome do autor da publicação do livro
	private String editora;//editora - Nome da editora da publicação do livro
	private String titulo;//titulo - Nome do livro
	
	public Livro(int isbn, String autor , String editora, String titulo) {
		this.isbn = isbn;
		this.autor = autor;
		this.editora = editora;
		this.titulo = titulo;
	}
	
	public Livro(int isbn, String autor , String editora) {
		this(isbn,autor,editora,"sem titulo");
	}
	
	public Livro(int isbn, String autor) {
		this(isbn,autor, "sem editora" ,"sem titulo");
	}
	
	public Livro(int isbn) {
		this(isbn,"sem autor", "sem editora" ,"sem titulo");
	}
	
	
	public int getIsbn() {
		return isbn;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getEditora() {
		return editora;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
