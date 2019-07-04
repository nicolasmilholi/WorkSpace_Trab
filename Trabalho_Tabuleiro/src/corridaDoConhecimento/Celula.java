package corridaDoConhecimento;

public class Celula {
		private Object elemento;
		private Celula proximo;
			
		Celula(Object elemento){
			this.elemento = elemento;
			this.proximo = null;
		}
		Celula(Object elemento, Celula proximo){
			this.proximo = proximo;
			this.elemento = elemento;
		}
		public Celula getProximo() {
			return this.proximo;
		}
		public void setProximo(Celula proximo) {
			this.proximo = proximo;
		}
		public Object getElemento() {
			return elemento;
		}
		public void setElemento(Object elemento) {
			this.elemento = elemento;
		}
		public String toString() {
			return this.elemento.toString();
		}
	}
