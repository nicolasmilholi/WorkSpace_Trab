package corridaDoConhecimento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Perguntas {
	static ArrayList<String> perguntas = new ArrayList<String>();
	Scanner ler = new Scanner(System.in);


	static public void initialize() {


		perguntas.add("O que é o endereço de uma árvore binária?");
		perguntas.add("Para compararmos se os valores dos atributos de dois objetos são iguais,\n"
				+ " devemos implementar um método que efetue essas comparações. Geralmente como é denominado? ");
		perguntas.add("O desempenho/eficiência de uma pesquisa é afetado pelo número de inspeções. O que são inspeções?");
		perguntas.add(" Qual a diferença da pesquisa com sucesso e a pesquisa sem sucesso?");
		perguntas.add("Em que consiste a ordenação?");
		perguntas.add("O que afeta o desempenho do método de ordenação ?");
		perguntas.add("Entre troca e comparação, o que mais afeta o desempenho do programa?");
		perguntas.add("Qual é o método de ordenação mais eficiente?");
		perguntas.add("Qual é o método de ordenção menos eficiente e porque?");
		perguntas.add("Em que consiste o método de inserção?");
		perguntas.add("Como funciona o método de inserção?");
		perguntas.add("Qual é a estratégia do método de Quicksort?");
		perguntas.add("Pelo o que é representado o elemento de uma lista?");
		perguntas.add("Quais são os tipos de lista?");
		perguntas.add("Qual é a principal classe do Java?");
		perguntas.add("O que precisa acrescentar na construção de uma lista duplamente encadeada?");
		perguntas.add("As operações de busca em uma árvore binária não a alteram, enquanto operações de inserção e remoção de nós\n"
				+ " provocam mudanças sistemáticas na árvore, sim ou não?");
		perguntas.add("O tipo de dados árvore representa organizações hierárquicas entre dados. Sim ou não?");
		perguntas.add("Cite 4 operações definidas para uma lista de pessoas");
		perguntas.add("Quais características de uma lista simplesmente encadeada?");
		perguntas.add("A classe célula pode ser acessada diretamente pelo usuário?");
		perguntas.add("Quantos graus tem um nó de uma arvore binária?");
		perguntas.add("Uma árvore é uma representação semelhante de qual modelo matemático?");
		perguntas.add("O que é a trajetória em uma árvore Binária?");
		perguntas.add("Para transformar árvore em árvore binária, os nós irmãos devem ser ligados entre si e a ligação entre um nó pai e os nós filhos deve ser removida,\n"
				+ " incluindo-se os nós do primeiro filho. Certo ou errado?");
		perguntas.add("O que é o grau de um nó");
		perguntas.add("Defina a profundidade de um nó.");
		perguntas.add("Denomina-se árvore binária a que possui apenas dois nós.");
		perguntas.add("Defina altura do nó:");
		perguntas.add("Defina Altura de uma árvore:");
		perguntas.add("Os algoritmos de percurso simples empregados para percorrer árvores binárias são eficientes quando aplicados para percorrer grafos.\n");
		perguntas.add(" Os algoritmos de percurso simples empregados para percorrer árvores binárias "
				+ "são eficientes quando aplicados para percorrer grafos. Certo ou errado?");
	
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
