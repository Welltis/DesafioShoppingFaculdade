package Etapa3;

public class Data{
    
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
    }
    
    //verifica se o ano é bissexto
    public boolean verificaAnoBissexto(){
        return (ano % 4 == 0) || (ano % 400 == 0 && ano % 100 != 0);
    }
    
    //verifica data
    public boolean validaData(int dia, int mes, int ano){
        if(mes < 1 || mes > 12 || dia < 1) {//verifica se o dia e mês é valido
            return false;
        }
        int diasMes[] ={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};//array referente aos dias de cada mes(janeiro a dezembro)
        if(verificaAnoBissexto() && mes == 2){
            diasMes[1] = 29; //mes 2 recebe 29 dias
        }
        return dia <= diasMes[mes - 1]; //indice correto do array subtraindo o parametro
    }
    
    //getters & setter
    public int getDia(){
        return dia;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public int getMes(){
        return mes;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    
    //método toString()- transforma o objeto em String
    public String toString(){
        return ("[Data]: "+dia+"/"+mes+"/"+ano);
    }
    
}
