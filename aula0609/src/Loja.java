//Crie as classes Loja e Vendedor, sabendo que a classe Loja possui as seguintes
//caracter�sticas: nome,ramo ,ano de funda��o, vendedor e os comportamentos:
//admitirVendedor e demitirVendedor e a classe Vendedor possui as seguintes
//caracter�sticas: idade,nome e com o seguinte comportamento: vender. Sabe-se que Loja
//e Vendedor est�o relacionados. Diante do cen�rio informado implemente as classes
//supracitadas estabelecendo um relacionamento de Composi��o. Utilize tamb�m o
//encapsulamento nas classes. 

public class Loja {
	private String nome;
	private String ramo;
	private int anoDeFundacao;
	private Vendedor vendedor;
	
	public void admitirVendedor(){
		vendedor =new Vendedor();
	}
	
	public void demitirVendedor() {
		vendedor = null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRamo() {
		return ramo;
	}

	public void setRamo(String ramo) {
		this.ramo = ramo;
	}

	public int getAnoDeFundacao() {
		return anoDeFundacao;
	}

	public void setAnoDeFundacao(int anoDeFundacao) {
		this.anoDeFundacao = anoDeFundacao;
	}

}
