package modelo;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	private BancoDados bd = BancoDados.getInstancia();
	private List<ItemVenda> itens = new ArrayList<ItemVenda>();
	private FormaDePagamento formaPagamento;
	
	public void addItemVenda(Produto produto, int qtde){
		ItemVenda item = new ItemVenda(produto, qtde);
		itens.add(item);
	}
	
	public List<String> getItensVenda(){
		List<String> itensFormatados = 
				new ArrayList<String>();
		
		for(ItemVenda iv : itens){
			itensFormatados.add(iv.getRepresentacaoString());
		}
		
		return itensFormatados;
	}
	
	public double getValorTotal(){
		double total = 0;
		
		for (ItemVenda itemVenda : itens) {
			total += itemVenda.getValorTotal();
		}
		
		return total;
	}
	
	public void setFormaDePagamento(String forma){
		 formaPagamento = bd.selectFormaDePagamento(forma);
	}

	public double getValorAPagar() {
		return formaPagamento.calculaValor(getValorTotal());
	}

	public String formaPagamento() {
		return formaPagamento.getDescricao();
	}
}
