package corridaDoConhecimento;
public class CelulaPilha {
	private Object elemento;
	private CelulaPilha proximo;
		
	CelulaPilha(Object elemento){
		this.elemento = elemento;
		this.proximo = null;
	}
	CelulaPilha(Object elemento, CelulaPilha proximo){
		this.elemento = elemento;
		this.proximo = proximo;	
	}
	public CelulaPilha getProximo() {
		return this.proximo;
	}
	public void setProximo(CelulaPilha proximo) {
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
