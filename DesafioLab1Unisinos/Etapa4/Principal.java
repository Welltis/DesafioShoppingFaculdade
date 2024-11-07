package Etapa4;

import java.util.Scanner;//importamos o Scanner para ler e armazenar a(s) resposta(s) do usuário

import Etapa3.Data;
import Etapa3.Endereco;
import Etapa3.Loja;
import Etapa3.Produto;

public class Principal{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);//iniciamos o Scanner
        
        Loja loja = null;//inicia em null por não ter sido criada ainda
        int opcao = 0; //variavel para verificar a escolha do usuario
        
        while(opcao != 3){
            System.out.println("[O que gostaria de fazer?]");
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            if(opcao == 1){
                System.out.println("[Criando a loja]");
                System.out.print("Insira o nome da loja: ");
                String nome = entrada.nextLine();
                
                System.out.print("Insira a quantidade de funcionários: ");
                int quantidadeFuncionarios = entrada.nextInt();
                
                System.out.print("Insira o sálario base dos funcionários: R$");
                double salarioBaseFuncionario = entrada.nextDouble();
                
                //endereço da loja
                System.out.println("[Digite o endereço da sua loja]");
                
                System.out.print("Nome da rua: ");
                String nomeDaRua = entrada.nextLine();
                entrada.nextLine();
                System.out.print("Cidade: ");
                String cidade = entrada.nextLine();
                
                System.out.print("Estado: ");
                String estado = entrada.nextLine();
                
                System.out.print("País: ");
                String pais = entrada.nextLine();
                
                System.out.print("CEP: ");
                String cep = entrada.nextLine();
                
                System.out.print("Número: ");
                String numero = entrada.nextLine();
                
                System.out.print("Complemento: ");
                String complemento = entrada.next();
                
                
                
                Endereco endereco = new Endereco(nomeDaRua, cidade,estado, pais, cep, numero, complemento);
                
                //data de fundação da loja
                System.out.println("[Insira a data de fundação da loja]");
                System.out.print("Dia: ");
                int diaF = entrada.nextInt();
                
                System.out.print("Mês: ");
                int mesF = entrada.nextInt();
                
                System.out.print("Ano: ");
                int anoF = entrada.nextInt();
                
                Data dataLoja = new Data(diaF, mesF, anoF);
                
                //cria o objeto [Loja]
                loja = new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataLoja);
                System.out.println("Loja cridada com sucesso!\n"+loja);
 
            }
            else if(opcao == 2) {
            	if(loja == null) {
            		System.out.print("[Você deve criar uma loja antes de adicionar produtos!]\n");
            	}
            	else {
            		System.out.println("[Criando um produto]");
            		System.out.println("Insira o nome do produto: ");
            		String nome = entrada.nextLine();
            		
            		System.out.println("Insira o preço do produto: R$");
            		double preco = entrada.nextDouble();          		
            		
            		//data de validade
            		System.out.println("[Insira a data de validade]");
            		System.out.print("Dia: ");
            		int dia = entrada.nextInt();
            		
            		System.out.print("Mês: ");
            		int mes = entrada.nextInt();
            		
            		System.out.println("Ano: ");
            		int ano = entrada.nextInt();
            		
            		Data dataValidade = new Data(dia, mes, ano);
            		System.out.println("[Validade]"+dataValidade);
            		
            		Produto produto = new Produto(nome, preco, dataValidade);//criação do objeto produto
            		
            		if(!produto.estaVencido(new Data(20, 10, 2023))) {
            			System.out.println("PRODUTO NÃO VENCIDO");
            		}
            		else {
            			System.out.println("PRODUTO VENCIDO");
            		}
            	}
            }
            else if(opcao == 3) {
            	System.out.println("[Você escolheu sair!]");
            }
            else {
            	System.out.println("[Opção Inválida!]");
            }
            
        }
        
        
        
        
        
        entrada.close();
    }
}


