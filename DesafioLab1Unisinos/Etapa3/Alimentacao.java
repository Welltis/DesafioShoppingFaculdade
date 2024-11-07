package Etapa3;

public class Alimentacao extends Loja{
	private Data dataAlvara;
	
	public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,Data dataFundacao, Data dataAlvara) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
		this.dataAlvara = dataAlvara;
	}
	
	//getter & setter
	public Data getDataAlvara() {
		return dataAlvara;
	}
	public void setDataAlvara(Data dataAlvara) {
		this.dataAlvara = dataAlvara;
	}
	
	//método toString()- transforma o objeto em String(sobrescrita)
	public String toString() {
		return(super.toString()+"\n[Data do alvára]: "+dataAlvara);
	}

}
