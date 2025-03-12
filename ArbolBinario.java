package arbolbinario;
public class ArbolBinario {
    private NodoArbol raiz;
    public ArbolBinario(){
        this.raiz=null;
    }
    //get
    public NodoArbol getRaiz(){
        return this.raiz;
    }
    //set
    public void setRaiz(NodoArbol head){
        this.raiz=head;
    }
    //comportamientos
    public boolean arbolVacio(){
        return getRaiz()==null;
    }
    //primer metodo para añadir nodos al albol.
    public void insertarNodo2(int n){
        NodoArbol nodo = new NodoArbol(n);
        NodoArbol padre;
        if(arbolVacio()) {
            setRaiz(nodo);
            System.out.println("raiz: " + getRaiz().getValor());
        }
        else {
            NodoArbol aux=getRaiz();
            while (true) {
                padre=aux;
                if (n > aux.getValor()) {
                    aux=aux.getDerecho();
                    if (aux==null) {
                        padre.setDerecho(nodo);
                        System.out.println("Derecho: " + padre.getDerecho().getValor());
                        break;
                    }
                } else {
                    aux=aux.getIzquierdo();
                    if (aux == null) {
                        padre.setIzquierdo(nodo);
                        System.out.println("Izquierdo: " + padre.getIzquierdo().getValor());
                        break;
                    }
                }
            }
        }
    }
    //segundo metodo para añadir nodos a un arbol. comformado por dos metodos.
    public void insertar(NodoArbol nodo, NodoArbol r) {
        NodoArbol aux = r;
        NodoArbol padre=aux;
        if(aux.getValor()==nodo.getValor()){
            System.out.println("El elemento "+aux.getValor()+" se encuentra en la lista");
        }
        else if (nodo.getValor() > aux.getValor()) {
                if (aux.getDerecho() == null) {
                    padre.setDerecho(nodo);
                    //System.out.println("Derecho: " + getRaiz().getDerecho().getValor());
                }else{
                    insertar(nodo,aux.getDerecho());
                }
        } else if (nodo.getValor() < aux.getValor()) {
                if (aux.getIzquierdo() == null) {
                    padre.setIzquierdo(nodo);
                    //System.out.println("Izquierdo: " + getRaiz().getIzquierdo().getValor());
                }else{
                        insertar(nodo,aux.getIzquierdo());
                }
        }
    }
    public void construirArbol(int n){
        NodoArbol nodo = new NodoArbol(n);
        if(arbolVacio()) {
            setRaiz(nodo);
            System.out.println("raiz: " + getRaiz().getValor());
        }
        else {
            insertar(nodo,getRaiz());
        }
    }
    public  void imprimir(NodoArbol dato){
        System.out.print(dato.getValor()+" ");
    }
  
    public void inOrden(NodoArbol r){
        if(r!=null){
            inOrden(r.getIzquierdo());
            imprimir(r);
            // como retornar el dato que pasa en este flujo?
            inOrden(r.getDerecho());
        }
    }
    public void preOrden(NodoArbol r){
    	if(r!=null) {
    	imprimir(r);
    	preOrden(r.getIzquierdo());
    	preOrden(r.getDerecho());
    }
    }
    public void postOrden(NodoArbol r) {
    	if(r!=null) {
    	postOrden(r.getIzquierdo());
    	postOrden(r.getDerecho());
    	imprimir(r);
    	}
    }
    public void eliminar(int p) {
    	NodoArbol aux = getRaiz();
    	NodoArbol anterior=null;
    	while(aux!=null) {
    		
    		if(p<aux.getValor()) {
    			//imprimir(aux);
    			anterior=aux;
    			aux=aux.getIzquierdo();
    		}
    		else if(p>aux.getValor()) {
    			//imprimir(aux);
    			anterior=aux;
    			aux=aux.getDerecho();
    		}
    		else {
    			
    			if(aux.getDerecho()==null&&aux.getIzquierdo()==null) {  //nodo target sin hijos
    				if(p>anterior.getValor()) {
    					anterior.setDerecho(null);
    				}
    				else {
    					anterior.setIzquierdo(null);
    				}
    			}else if((aux.getDerecho()==null&&aux.getIzquierdo()!=null)||((aux.getDerecho()!=null&&aux.getIzquierdo()==null))) {  //nodo target tiene un hijo
    				if(anterior.getDerecho()==aux) {
    					anterior.setDerecho(aux.getDerecho());
    				}
    				else {
    					anterior.setIzquierdo(aux.getIzquierdo());
    				}
    			}
    			else {  //nodo target tiene ambos hijos
    				//buscar la hoja del ultimo nivel de la rama al q pertenece el nodo aux. 
    				//aux=hoja;
    			}
    			break;
    		}
    	}
    	
    }
    
}
