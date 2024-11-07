package Etapa3;

public class Vestuario extends Loja {
	private boolean produtosImportados;
	
	public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,Data dataFundacao, boolean produtosImportados) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
		this.produtosImportados = produtosImportados;
	}
	//getter & setter
	public boolean getProdutosImportados() {
		return produtosImportados;
	}
	public void setProdutosImportados(boolean produtosImportados) {
		this.produtosImportados = produtosImportados;
	}
	
	//método toString()- transforma o objeto em String(sobrescrita)
		public String toString() {
			return(super.toString()+"\n[Vende produtos Importados?]: "+produtosImportados);
		}

}
