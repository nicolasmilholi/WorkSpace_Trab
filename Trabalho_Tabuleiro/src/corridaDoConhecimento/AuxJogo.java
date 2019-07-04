package corridaDoConhecimento;

import java.util.Scanner;

public class AuxJogo {

	static Pessoa pessoaVez;
	static Lista lstJogo1 = new Lista();
	static Lista lstJogo2 = new Lista();
	static Lista lstVez;
	static PilhaGenericaIlim pilhaPerguntas = new PilhaGenericaIlim();
	static Scanner entrada = new Scanner(System.in);
	

	public static Pessoa criarJogador(Pessoa pessoaJogo) {
		String nomeJogador;
		int id;
		boolean inserido = false;

		nomeJogador = Util.leString("Informe o nome dx jogadxr:  ");
		do {
			id = Util.leInt("Informe o ID dx jogadxr:  ");

			if (id >= 100) {

				pessoaJogo = new Pessoa(nomeJogador, id);
				inserido = true;
			} else
				System.out.println("Insira um id de no minimo 3 digitos");
		} while (!inserido);

		return pessoaJogo;

	}

	public static void iniciarJogo(Pessoa pessoaJogo1, Pessoa pessoaJogo2, int qtd) {
		
		
		if (podeIniciar(pessoaJogo1, pessoaJogo2)) {

			lstJogo1 = populaLst(qtd, lstJogo1);
			lstJogo2 = populaLst(qtd, lstJogo2);
			
			
			
			
			if (!lstJogo1.Vazia() || !lstJogo2.Vazia()) {
				int cont = 0;
				int cond = 1;
				boolean parada = false;

				do {
					populaPilha(pilhaPerguntas, cont);
					cond *= -1;
					if (cond == 1) {
						pessoaVez = pessoaJogo1;
						lstVez = lstJogo1;
					} else {
						pessoaVez = pessoaJogo2;
						lstVez = lstJogo2;
					}

					/////////////////////////////////////////////////////////////////////////////////
					System.out.println(
							"----------------------------------------------------------------");
					
					System.out.println("\nVez de " + pessoaVez);
					System.out.println(
							"----------------------------------------------------------------");
					Object pergunta = (Object) pilhaPerguntas.desempilha();
					
					System.out.println("Pergunta: " + pergunta);
								

					System.out.println(
							 "----------------------------------------------------------------");

					if (acertou()) {

						int posDado = avancaPos();

						if (lstVez.pesquisa(pessoaVez) < 0) {

							System.out.println("a pessoa deve ir para a posicão " + posDado);
							lstVez.inserePosicao(pessoaVez, posDado);
							System.out.println("a pessoa ta na pos " + lstVez.pesquisa(pessoaVez));
						} else {

							int local = lstVez.pesquisa(pessoaVez);
							int pos = (posDado + local);
							if (pos <= lstVez.getLength()) {

								lstVez.excluiPosicao(local);
								System.out.println("O jogador " +pessoaVez+ "deve ir para a posicão " + pos+ "\n");
								lstVez.inserePosicao(pessoaVez, pos);
								System.out.println("" + pessoaVez + " está na posição " + lstVez.pesquisa(pessoaVez)+ "\n");

							} else {

								System.out.println(
										"" + pessoaVez + "estava na posição" + local + " e avançou " + posDado);
								System.out.println("" + pessoaVez + " ganhou o jogo");
								parada = true;
							}
						}
					}else
						
						if(lstVez.pesquisa(pessoaVez)<0) {
							lstVez.insereInicio(pessoaVez);
							System.out.println(pessoaVez +" não acertou a pergunta então se mantem na posição " +lstVez.pesquisa(pessoaVez));
						} else {
						System.out.println(pessoaVez +" não acertou a pergunta então se mantem na posição " +lstVez.pesquisa(pessoaVez));
						}
					cont++;
				} while (!parada);

			} else {
				System.out.println("Jogadores não inseridos!!");
			}
		}
	}

	private static PilhaGenericaIlim populaPilha(PilhaGenericaIlim pilhaPerguntas2, int cont) {
			pilhaPerguntas2.empilha(Perguntas.getPergunta(cont));
		return pilhaPerguntas2;
		
	}

	private static boolean podeIniciar(Pessoa p1, Pessoa p2) {
		if (p1 != null && p2 != null) {
			return true;
		}
		return false;
	}

	private static int avancaPos() {
		int avanca = Util.geraIntAleatorio(1, 5);
		return avanca;
	}

	private static boolean acertou() {
		boolean resposta = false;

		System.out.println();
		int valor = Util.leInt("Acertou a pergunta?\nDigite (1) caso acertou.\nDigite (2) caso errou\n\n");
		if (valor == 1) {
			resposta = true;
		}

		return resposta;
	}

	private static Lista populaLst(int qtd, Lista lista) {
		for (int i = 0; i < qtd - 1; i++) {
			lista.insereFim(new Pessoa(i));
		}
		return lista;
	}

}
