package Etapa1;

public class Loja{
    
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    
    //construtor 1
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    
    //construtor 2
    public Loja(String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
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
    
    //método toString()- transforma o objeto em String
    public String toString(){
        return ("[Nome da Loja]: "+nome+"\n[Quantidade de funcionários]: "+quantidadeFuncionarios+"\n[Salário base dos funcionários]: "+salarioBaseFuncionario);
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
    
}