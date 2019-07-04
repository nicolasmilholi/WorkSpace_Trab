package corridaDoConhecimento;
public class Pessoa {
	private String nickname;
	private int pos;
	
	
	Pessoa(String nickname, int id){
		this.nickname = nickname;
		this.pos = id;
		
	}
	Pessoa(int posicao){
		this.nickname = "falsa";
		this.pos = posicao;
		
	}
	
	public String toString() {
		return String.format("%s\n", this.nickname);
	}
	
	public boolean equals(Pessoa p) {
		if (this.pos == p.pos )
			return true;
		
		return false;
	}
	public int getId() {
		return pos;
	}
}
