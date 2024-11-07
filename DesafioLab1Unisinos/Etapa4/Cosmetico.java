package Etapa4;

public class Cosmetico extends Loja {
	private double taxaComercializacao;
	
	public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,Data dataFundacao, double taxaComercializacao,int tamanhoEstoque) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
		this.taxaComercializacao = taxaComercializacao;
	}
	//getter & setter
	public double getTaxaComercializacao() {
		return taxaComercializacao;
	}
	public void setTaxaComercializacao(double taxaComercializacao) {
		this.taxaComercializacao = taxaComercializacao;
	}
	//método toString()- transforma o objeto em String(sobrescrita)
	public String toString() {
		return(super.toString()+"\n[Taxa de comercialização]: "+taxaComercializacao);
	}
	

}
