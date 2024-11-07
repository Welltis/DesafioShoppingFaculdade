package Etapa4;

public class Produto{
    
    private String nome;
    private double preco;
    Data dataValidade;
    
    //construtor
    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }
    //metodos getter & setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public Data getDataValidade(){
        return dataValidade;
    }
    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }
    
    //verifica se o produto esta vencido
    public boolean estaVencido(Data dataAtual){
        //verificamos dia, mes e ano para verificar se o produto esta vencido
        if(dataAtual.getAno() > dataValidade.getAno()) {//verifica se o ano atual é maior que o ano de vencimento
            return false;
        }
        else if(dataAtual.getAno() == dataValidade.getAno() && dataAtual.getMes() > dataValidade.getMes()){//caso o ano seja igual, verifica o mês
            return false;
        }
        else if(dataAtual.getAno() == dataValidade.getAno() && dataAtual.getMes() == dataValidade.getMes() && dataAtual.getDia() > dataValidade.getDia()){//caso ano e mês sejam iguais, verifica o dia
            return false;
        }
        return true;
    }
    
    
    //método toString()- transforma o objeto em String
    public String toString(){
        return("[Produto]: "+nome+"\n[Preço]: "+preco+"\n[Data de validade]: "+dataValidade);
    }
    
    
    
}
