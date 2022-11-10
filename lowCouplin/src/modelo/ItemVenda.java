package modelo;

public class ItemVenda {
	private Produto produto;
	private int quantidade;
	
	public ItemVenda(Produto produto, int qtdeVendida) {
		this.quantidade = qtdeVendida;
		this.produto = produto;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public double getValorTotal(){
		return quantidade * produto.getPreco();
	}

	public String getRepresentacaoString() {
		return this.getProduto().getNome() + 
			   " - " + this.getProduto().getPreco() + 
		       " - " + this.getValorTotal();
	}
}
