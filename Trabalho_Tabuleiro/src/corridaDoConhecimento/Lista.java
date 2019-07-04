package corridaDoConhecimento;

public class Lista {
    private Celula primeira;
    private Celula ultima;
    private int length;
 
    Lista() {
        this.primeira = this.ultima = null;
        this.length = 0;
    }
    Lista(Object elemento) {
        this.primeira = new Celula (elemento);
        this.ultima = this.primeira;
        this.length = 1;
    }  
 
    public int getLength() {
        return this.length;
    }
    private Celula getCelula(int pos){
        Celula celAtual = null;
        if(pos>=0 && pos<this.length){
            celAtual = this.primeira;
            for(int ind = 0; ind < pos; ind++){
                celAtual = celAtual.getProximo();
            }          
        }
        return celAtual;
    }
    public Object getElemento(int pos) {
        Celula celAux = this.getCelula(pos);
        if (celAux != null)
            return celAux.getElemento();
        return null;       
    }
    public boolean insereInicio(Object elemento){
        boolean inserido = false;
        if (this.pesquisa(elemento) < 0) {
            Celula celNova = new Celula(elemento, this.primeira);
            this.primeira = celNova;
            if(this.length==0){
                this.ultima = this.primeira;
            }
            this.length++;
            inserido = true;
        }
        return inserido;
    }
    public boolean insereFim(Object elemento){
        boolean inserido = false;
        if(this.length == 0){
            inserido = this.insereInicio(elemento);
        }else{
            if (this.pesquisa(elemento) < 0) {
                Celula celNova = new Celula(elemento);
                this.ultima.setProximo(celNova);
                this.ultima = celNova;
                this.length++;
                inserido = true;
            }
        }
        return inserido;
    }
    public boolean inserePosicao(Object elemento, int posicao){
        boolean inserido = false;
        Celula celAtual, celNova;
 
        if(posicao == 0){
            inserido = this.insereInicio(elemento);
        } else {
            if(posicao == this.length){
                inserido = this.insereFim(elemento);
            } else{
                if (posicao > 0 && posicao < this.length) {
                    if (this.pesquisa(elemento) < 0) {
                        celAtual = this.primeira;
                        for(int i = 0; i < posicao; i++){
                            celAtual = celAtual.getProximo();
                        }
                        celNova = new Celula(celAtual.getElemento(), celAtual.getProximo());
                        celAtual.setElemento(elemento);
                        celAtual.setProximo(celNova);
                        this.length++;
                        inserido = true;
                    }
                }
            }
        }
        return inserido;
    }
    public String toString(){
        String saida = "";
        Celula celAtual = this.primeira;
        if (this.length > 0) {
            for(int ind = 0; ind < this.length; ind++){
                saida += String.format("\n%s\n", celAtual.toString());
                celAtual = celAtual.getProximo();          
            }
            return saida;
        }
        return "\nMÃO VAZIA\n";
    }
    public Object excluiInicio(){
        Object elemExcluido = null;
        if(this.length > 0){
            elemExcluido = this.primeira.getElemento();
            this.primeira = this.primeira.getProximo();
            this.length--;
            if(this.length == 0){
                this.ultima = null;
            }
        }
        return elemExcluido;       
    }
    public Object excluiFinal(){
        Object elemExcluido = null;
        if(this.length==1){
            elemExcluido = this.excluiInicio();
        }else {
            if(this.length>1){
                Celula celPenultima = this.getCelula(this.length-2);
                celPenultima.setProximo(null);
                elemExcluido = this.ultima.getElemento();
                this.ultima = celPenultima;
                this.length--;
            }
        }
        return elemExcluido;
    }
    public Object excluiPosicao(int posicao){
        Object elemExcluido = null;
        if (posicao >= 0 && posicao < this.length) {
            if(posicao == 0){
                elemExcluido = this.excluiInicio();
            }else {
                if(posicao == this.length-1){
                    elemExcluido = this.excluiFinal();
                } else {
                    Celula celAnterior = getCelula(posicao-1);
                    elemExcluido = celAnterior.getProximo().getElemento();
                    celAnterior.setProximo(celAnterior.getProximo().getProximo());
                    this.length--;
                }
            }
        }
        return elemExcluido;
    }
    public boolean exclui(Object elemento) {
        int posElem = this.pesquisa(elemento);
        if (posElem >= 0) {
            if (this.excluiPosicao(posElem) != null) {
                return true;
            }
        }
        return false;
      
    }
    public int pesquisa(Object elemento){
        Celula celAtual = this.primeira;
        boolean encontrado = false;
        int posicao = -1;
        while (!encontrado && celAtual!=null) {
            posicao++;
            if (celAtual.getElemento().equals(elemento))
                encontrado = true;
            else
                celAtual = celAtual.getProximo();
        }
        if (encontrado)
            return posicao;
        else
            return -1;
    }
 
 
    public boolean Vazia() {
        boolean Vazia = false;
        if(this.length == 0) {
            Vazia = true;
        }
        return Vazia;
    }
 
}

