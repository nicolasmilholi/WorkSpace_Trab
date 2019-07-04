package corridaDoConhecimento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Perguntas {
	static ArrayList<String> perguntas = new ArrayList<String>();
	Scanner ler = new Scanner(System.in);


	static public void initialize() {


		perguntas.add("O que � o endere�o de uma �rvore bin�ria?");
		perguntas.add("Para compararmos se os valores dos atributos de dois objetos s�o iguais,\n"
				+ " devemos implementar um m�todo que efetue essas compara��es. Geralmente como � denominado? ");
		perguntas.add("O desempenho/efici�ncia de uma pesquisa � afetado pelo n�mero de inspe��es. O que s�o inspe��es?");
		perguntas.add(" Qual a diferen�a da pesquisa com sucesso e a pesquisa sem sucesso?");
		perguntas.add("Em que consiste a ordena��o?");
		perguntas.add("O que afeta o desempenho do m�todo de ordena��o ?");
		perguntas.add("Entre troca e compara��o, o que mais afeta o desempenho do programa?");
		perguntas.add("Qual � o m�todo de ordena��o mais eficiente?");
		perguntas.add("Qual � o m�todo de orden��o menos eficiente e porque?");
		perguntas.add("Em que consiste o m�todo de inser��o?");
		perguntas.add("Como funciona o m�todo de inser��o?");
		perguntas.add("Qual � a estrat�gia do m�todo de Quicksort?");
		perguntas.add("Pelo o que � representado o elemento de uma lista?");
		perguntas.add("Quais s�o os tipos de lista?");
		perguntas.add("Qual � a principal classe do Java?");
		perguntas.add("O que precisa acrescentar na constru��o de uma lista duplamente encadeada?");
		perguntas.add("As opera��es de busca em uma �rvore bin�ria n�o a alteram, enquanto opera��es de inser��o e remo��o de n�s\n"
				+ " provocam mudan�as sistem�ticas na �rvore, sim ou n�o?");
		perguntas.add("O tipo de dados �rvore representa organiza��es hier�rquicas entre dados. Sim ou n�o?");
		perguntas.add("Cite 4 opera��es definidas para uma lista de pessoas");
		perguntas.add("Quais caracter�sticas de uma lista simplesmente encadeada?");
		perguntas.add("A classe c�lula pode ser acessada diretamente pelo usu�rio?");
		perguntas.add("Quantos graus tem um n� de uma arvore bin�ria?");
		perguntas.add("Uma �rvore � uma representa��o semelhante de qual modelo matem�tico?");
		perguntas.add("O que � a trajet�ria em uma �rvore Bin�ria?");
		perguntas.add("Para transformar �rvore em �rvore bin�ria, os n�s irm�os devem ser ligados entre si e a liga��o entre um n� pai e os n�s filhos deve ser removida,\n"
				+ " incluindo-se os n�s do primeiro filho. Certo ou errado?");
		perguntas.add("O que � o grau de um n�");
		perguntas.add("Defina a profundidade de um n�.");
		perguntas.add("Denomina-se �rvore bin�ria a que possui apenas dois n�s.");
		perguntas.add("Defina altura do n�:");
		perguntas.add("Defina Altura de uma �rvore:");
		perguntas.add("Os algoritmos de percurso simples empregados para percorrer �rvores bin�rias s�o eficientes quando aplicados para percorrer grafos.\n");
		perguntas.add(" Os algoritmos de percurso simples empregados para percorrer �rvores bin�rias "
				+ "s�o eficientes quando aplicados para percorrer grafos. Certo ou errado?");
	
		Collections.shuffle(perguntas);

	}
	
	static public Object getPergunta(int i) {
		Object pergunta;
		pergunta = perguntas.get(i);
		return pergunta;
	}

	static public boolean inserirPergunta(String pergunta) {

		if (!pergunta.equalsIgnoreCase(null)) {
			perguntas.add(pergunta);
			return true;
		} else {
			return false;
		}
	}

	static public boolean excluirPergunta(int index) {

		if (index >= 0 && index < perguntas.size()) {
			perguntas.remove(index);
			return true;
		} else {
			return false;
		}
	}

	static public String listarPerguntas(int i) {
		String saida;
		saida = perguntas.get(i);
		return saida;

	}
	static public int getLength(){
		return perguntas.size();
	}
	
}
