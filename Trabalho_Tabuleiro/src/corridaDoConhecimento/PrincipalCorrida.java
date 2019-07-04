package corridaDoConhecimento;

public class PrincipalCorrida {
	public static void main(String[] args) {

		String menu;
		int opcao;
		Pessoa p1 = null, p2 = null;
		Perguntas.initialize();

		do {
			menu = "\n\n1 - Inserir"
					+ " novos jogadores" + "\n2 - Iniciar jogo" + "\n3 - Gerenciar perguntas"
					+ "\n4 - Terminar" + "\nDigite a operação: ";
			opcao = Util.validaIntervalo(menu, 1, 5);

			switch (opcao) {
			case 1:
				p1 = AuxJogo.criarJogador(p1);
				p2 = AuxJogo.criarJogador(p2);
				break;
			case 2:
				boolean inserido = false;
				do {
					int tamTabuleiro = Util.leInt("Informe o tamanho do tabuleiro: ");
					if (tamTabuleiro >= 15 && tamTabuleiro < 100) {
						AuxJogo.iniciarJogo(p1, p2, tamTabuleiro);
						inserido = true;
					} else
						System.out.println("O tamanho do tabuleiro deve ser acima de 15 e abaixo de 100");
				} while (!inserido);

				break;
			case 3:
				do {
					

					menu = "\n\n1 - Ver todas as perguntas" + "\n2 - Inserir pergunta " + "\n3 - Excluir pergunta"
							+ "\n4 - Voltar ao menu anterior" + "\nDigite a operação: ";
					opcao = Util.validaIntervalo(menu, 1, 4);

					switch (opcao) {
					case 1:
						String saida = "";

						for (int i = 0; i < Perguntas.getLength(); i++) {
							saida += "Pergunta " + i + ": ";
							saida += Perguntas.listarPerguntas(i);
							saida += "\n";
						}

						System.out.println(saida);
						break;
					case 2:
						String pergunta = Util.leString("Insira a pergunta que deseja inserir: \n");
						Perguntas.inserirPergunta(pergunta);

						break;
					case 3:
						int index = Util.leInt("Digite a numero da pergunta que deseja excluir: ");
						Perguntas.excluirPergunta(index);
						break;
					case 4:

						break;
					}
				} while (opcao != 4);

				break;
			case 4:

				break;
			}
		} while (opcao != 4);

	}

}
