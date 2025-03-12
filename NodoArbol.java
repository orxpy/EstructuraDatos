package arbolbinario;

public class NodoArbol {
    private int valor;
    //private String valor;
    private NodoArbol izquierdo;
    private NodoArbol derecho;

    public NodoArbol(int numero){
        this.valor=numero;
        this.izquierdo=null;
        this.derecho=null;
    }
    //get
    public int getValor(){
        return this.valor;
    }
    public NodoArbol getIzquierdo(){
        return this.izquierdo;
    }
    public NodoArbol getDerecho(){
        return this.derecho;
    }
    //set
    public void setValor(int numero){
        this.valor=numero;
    }
    public void setIzquierdo(NodoArbol hijoIzquierdo){
        this.izquierdo=hijoIzquierdo;
    }
    public void setDerecho(NodoArbol hijoDerecho){
        this.derecho=hijoDerecho;
    }
}
