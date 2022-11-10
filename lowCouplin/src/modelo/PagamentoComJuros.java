package modelo;

public class PagamentoComJuros extends FormaDePagamento {

	private double taxaJuros;
	
	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros/100;
	}

	@Override
	public double calculaValor(double valor) {
		return valor + (valor * taxaJuros);
	}
}
