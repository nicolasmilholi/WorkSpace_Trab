package corridaDoConhecimento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Perguntas {
	static ArrayList<String> perguntas = new ArrayList<String>();
	Scanner ler = new Scanner(System.in);


	static public void inicializar() {


		perguntas.add("Juca Bala;11 1111-1111");
		perguntas.add("Marcos Paqueta;22 2222-2222");
		perguntas.add("Maria Antonieta;33 3333-3333");
		perguntas.add("Antônio Conselheiro;44 4444-4444");

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
