package visao;

import modelo.GerenciadorVenda;

public class Main {
	public static void main(String[] args) {
		GerenciadorVenda gv = new GerenciadorVenda();
		gv.abreVenda();
		
		gv.addItemVenda(1, 1);
		gv.addItemVenda(2, 1);
		gv.addItemVenda(3, 1);
		gv.addItemVenda(4, 1);
		gv.setFormaPagamento("cc");
		
		for (String itemVendaFormatado : gv.getItensVendas()) {
			System.out.println(itemVendaFormatado);
		}
		
		System.out.printf("Total: %.2f\n", gv.getValorTotal());
		System.out.printf("Valor a pagar: %.2f no %s\n", gv.valorAPagar(), gv.formaPagamento());
		
		gv.fechaVenda();
	}
}
