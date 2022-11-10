package modelo;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorVenda {
	private Estoque estoque;
	private Venda vendaAberta;
	
	public GerenciadorVenda() {
		vendaAberta = null;
		estoque = new Estoque();
	}
	
	public boolean addItemVenda(int codProduto, int quantidade) {
		if(estoque.retiraDoEstoque(codProduto, quantidade)) {
			
			Produto produto = estoque.selectProduto(codProduto);
			
			vendaAberta.addItemVenda(produto, quantidade);
			
			return true; 
		}
		
		return false;
	}
	
	public void fechaVenda() {
		this.vendaAberta = null;
	}
	
	public void setFormaPagamento(String formaPagamento) {
		if(vendaAberta != null)
		vendaAberta.setFormaDePagamento(formaPagamento);
	}
	
	public List<String> getItensVendas(){
		if(vendaAberta != null) {
			return vendaAberta.getItensVenda();
		}
		
	return new ArrayList<String>();
	
	}
	
	public double getValorTotal() {
		if(vendaAberta != null) {
			return vendaAberta.getValorTotal();
		}
		
		return 0;
	}
	
	public String formaPagamento() {
		if(vendaAberta != null) {
			return vendaAberta.formaPagamento();
		}
		
		return "";
	}
	
	public double valorAPagar() {
		if(vendaAberta != null) {
			return vendaAberta.getValorAPagar();
		}
		
		return 0;
	}
	
	public void abreVenda() {
		if(vendaAberta == null)
		this.vendaAberta = new Venda();
	}

}
