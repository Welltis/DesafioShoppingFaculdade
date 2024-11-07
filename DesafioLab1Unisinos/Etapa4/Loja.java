package Etapa4;

public class Loja{
    
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    Endereco endereco;
    Data dataFundacao;
    private Produto[] estoqueProdutos;
    
    //construtor 1
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,Data dataFundacao, int tamanhoEstoque){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamanhoEstoque];
        
    }
    
    //construtor 2
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao,int tamanhoEstoque){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamanhoEstoque];
    }
    
    //getters & setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public Data getDataFundacao(){
        return dataFundacao;
    }
    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }
    
    public Produto[] getEstoqueProdutos() {
    	return estoqueProdutos;
    }
    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
    	this.estoqueProdutos = estoqueProdutos;
    }
    
    //método toString()- transforma o objeto em String
    public String toString(){
        return ("[Nome da Loja]: "+nome+"\n[Quantidade de funcionários]: "+quantidadeFuncionarios+"\n[Salário base dos funcionários]: "+salarioBaseFuncionario+"\n[Endereço]: "+endereco+"\n[Data de fundação] :"+dataFundacao);
    }
    
    //método para saber o gasto com sálarios da loja
    public double gastosComSalario(){
        if(salarioBaseFuncionario == -1){
            return -1;
        }
        else{
            return(salarioBaseFuncionario * quantidadeFuncionarios);
        }
    }
    
    //método para saber o tamanho da loja
    public String tamanhoDaLoja(){
        if(quantidadeFuncionarios < 10){
            return "P";
        }
        else if(quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30){
            return "M";
        }
        else{
            return "G";
        }
    }
    
    //método que e imprime a informação de todos os produtos da loja
    public void imprimeProdutos() {
    	for(Produto produto : estoqueProdutos) {//loop for each, que percorre todos os elementos da lista
    		if (produto != null) {
    			System.out.println(produto); //imprime os produtos da lista
    		}
    		else {
    			System.out.println("[Sem produtos na loja]");//se não tiver produtos
    		}
    	}
    }
    
    //método para inserir produtos na lista
    public boolean insereProduto(Produto produto) {
    	for(int i = 0; i < estoqueProdutos.length;i++) {//loop que percorre os elementos da lista
    		if(estoqueProdutos[i] == null) { //verifica se a posição está vazia
    			estoqueProdutos[i] = produto;// insere o produto na primeira posição vazia
    			return true;//produto inserido, retorna verdadeiro
    		}
    	}
    	return false;
    }
    
    //método para remover produtos da lista pelo nome
    public boolean removeProduto(String nomeProduto) {
    	for(int i = 0;i < estoqueProdutos.length;i++) {//loop que percorre os elementos da lista
    		if(estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {//verifica se o nome fornecido é igual ao nome do produto da lista
    			estoqueProdutos[i] = null;//se sim, é removido e retorna verdadeiro
    			return true;
    		}
    	}
    	return false;
    }
    
    
    
}
