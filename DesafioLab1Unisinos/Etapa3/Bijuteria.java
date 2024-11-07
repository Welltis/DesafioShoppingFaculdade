package Etapa3;

public class Bijuteria extends Loja{
	private double metaVendas;
	
	public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,Data dataFundacao, double metaVendas) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
		this.metaVendas = metaVendas;
	}
	
	//getter e setter
	public double getMetaVendas() {
		return metaVendas;
	}
	public void setMetaVendas(double metaVendas) {
		this.metaVendas = metaVendas;
	}
	
	//método toString()- transforma o objeto em String(sobrescrita)
	public String toString() {
		return(super.toString()+"\n[Meta de vendas]: "+metaVendas);
	}	

}
