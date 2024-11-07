package Etapa4;

import java.util.Arrays;

public class Shopping {
	private String nome;
	private Endereco endereco;
	private Loja[] lojas;
	
	public Shopping(String nome, Endereco endereco, int maximoLojas) {
		this.nome = nome;
		this.endereco = endereco;
		this.lojas = new Loja[maximoLojas];
	}
	
	//getters & setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Loja[] getLojas() {
		return lojas;
	}
	public void setLojas(Loja[] lojas) {
		this.lojas = lojas;
	}
	
	//método toString(0) - transforma o objeto em String
	public String toString() {
		return ("[Shopping]\n[Nome]: "+nome+"\n[Endereço]: "+endereco+"\n[Lojas]: "+Arrays.toString(lojas));
	}
	
	//método para inserir lojas no shopping
	public boolean insereLoja(Loja loja) {
		for(int i = 0; i < lojas.length;i++) {//loop que percorre os elementos da lista
			if(lojas[i] == null) { //verifica se a posição está vazia
				lojas[i] = loja;//Insere a loja na primeira posição vazia
				return true;//loja inserida, retorna true
			}
		}
		return false;
	}
	
	//método para remover lojas no shopping
	public boolean removeLoja(String nomeLoja) {
		for(int i = 0;i < lojas.length;i++) {//loop que percorre os elementos da lista
			Loja loja = lojas[i]; //acessa a loja na posição "i"
			if(loja != null && loja.getNome().equals(nomeLoja)) { //verifica se a loja existe e se o nome é igual ao fornecido
				lojas[i] = null;//remove a loja
				return true;//loja removida, retorna true
			}
		}
		return false;
	}
	
	//método que verifica a quantidade de lojas por tipo
	public int quantidadeLojasPorTipo(String tipo) {
		int i = 0;// inicializa o contador
		for(Loja loja : lojas) {//Percorre os elementos da lista de lojas
			if(loja.getClass().getSimpleName().equalsIgnoreCase(tipo)) {//verifica se o nome da classe da loja é igual ao tipo especificado
				i++;//caso encontre o tipo, incrementa o contador
			}
		}
		return i;// retorna o total de lojas deste tipo
	}
	
	//método que retorna a loja de informatica com maior valor de seguro
	public Informatica lojaSeguroMaisCaro() {
		Informatica lojaSeguroMaisCaro = null;//guarda qual loja possui o seguro mais caro
		double seguroMaisCaro = 0;//guarda o valor do seguro
		for(Loja loja : lojas) {
			if(loja instanceof Informatica) {
				Informatica informatica = (Informatica) loja;
				if(informatica.getSeguroEletronicos() > seguroMaisCaro) {//verifica se esse é o maior seguro
					seguroMaisCaro = informatica.getSeguroEletronicos();////troca os valores
					lojaSeguroMaisCaro = informatica;//troca os valores
				}
			}
		}
		return lojaSeguroMaisCaro;
	}
	
	//contador de quantas lojas foram adicionadas ao shopping
    public int contarLojas() {
        int contador = 0;
        for (Loja loja : lojas) {
            if (loja != null) {
                contador++;
            }
        }
        return contador;
    }
	
	

}
