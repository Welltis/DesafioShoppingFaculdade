package Etapa3;

public class Informatica extends Loja{
	private double seguroEletronicos;//seguro que lojas que vendem aparelhos eletrônicos devem pagar mensalmente
	
	public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,Data dataFundacao, double seguroEletronicos) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
		this.seguroEletronicos = seguroEletronicos;
	}
	
	//getter & setter
	public double getSeguroEletronicos() {
		return seguroEletronicos;
	}
	public void setSeguroEletronicos(double seguroEletronicos) {
		this.seguroEletronicos = seguroEletronicos;
	}
	
	//método toString()- transforma o objeto em String(sobrescrita)
	public String toString() {
		return(super.toString()+"\n[Seguro de eletrônicos: R$"+seguroEletronicos+"/mensal]");
	}

}
