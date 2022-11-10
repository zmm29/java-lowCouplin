package modelo;

public class PagamentoComDesconto extends FormaDePagamento {

	private double taxaDesconto;
	
	public double getTaxaDesconto() {
		return taxaDesconto;
	}

	public void setTaxaDesconto(double taxaDesconto) {
		this.taxaDesconto = taxaDesconto/100;
	}

	@Override
	public double calculaValor(double valor) {
		return valor - (valor * taxaDesconto);
	}
}
