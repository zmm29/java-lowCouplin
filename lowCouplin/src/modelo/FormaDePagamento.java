package modelo;

public abstract class FormaDePagamento {
	private String descricao;
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return this.descricao;
	};
	
	public abstract double calculaValor(double valor);
}
