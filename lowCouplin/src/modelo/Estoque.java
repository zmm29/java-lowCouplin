package modelo;

public class Estoque {
	private BancoDados db = BancoDados.getInstancia();
	
	public boolean temNoEstoque(Integer codProduto, int quantidade) {
		
		return db.selectQuantidadeItemEstoque(codProduto) >= quantidade;	
	}
	
	public boolean retiraDoEstoque(Integer codProduto, int quantidade) {
		if(temNoEstoque(codProduto, quantidade)) {
			db.diminuiQuantidadeItemEstoque(codProduto, quantidade);
			return true;
		}
		
		return false;
	}
	public Produto selectProduto(int codProduto) {
		return db.selectProduto(codProduto);
	}

}
