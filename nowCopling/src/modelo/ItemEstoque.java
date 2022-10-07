package modelo;

public class ItemEstoque {
	private Produto produto;
	private int quantidade;
	
	public ItemEstoque(int qtde, Produto p) {
		this.produto = p;
		this.quantidade = qtde;
		
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
