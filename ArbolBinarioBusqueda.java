package arbolbinario;

public class ArbolBinarioBusqueda {
    public static void main(String[] args) {
        ArbolBinario abb = new ArbolBinario();
        abb.construirArbol(45);
        abb.construirArbol(23);
        abb.construirArbol(65);
        abb.construirArbol(2);
        abb.construirArbol(52);
        abb.construirArbol(38);
        abb.construirArbol(96);
        abb.construirArbol(7);
        abb.construirArbol(48);
        
        abb.construirArbol(2);
        abb.construirArbol(5);
        abb.construirArbol(9);
        abb.construirArbol(-7);
        abb.construirArbol(-9);
        abb.construirArbol(-4);

        abb.construirArbol(4);
        abb.construirArbol(-7);
        abb.construirArbol(-17);
        abb.construirArbol(21);
        abb.construirArbol(33);
        abb.construirArbol(-15);
        abb.construirArbol(12);
        abb.construirArbol(16);
        abb.construirArbol(30);
        abb.construirArbol(18);
        abb.construirArbol(6);
        abb.construirArbol(8);
        abb.construirArbol(-6);
        abb.construirArbol(-12);
        abb.construirArbol(-13);
        
        System.out.println(abb.arbolVacio());
        System.out.println("La raiz es: "+abb.getRaiz().getValor());
        System.out.print("Recorrido inorden: ");
        abb.inOrden(abb.getRaiz());
        System.out.println();
        System.out.print("Recorrido preorden: ");
        abb.preOrden(abb.getRaiz());
        System.out.println();
        System.out.print("Recorrido postorden: ");
        abb.postOrden(abb.getRaiz());
        System.out.println();
        System.out.print("Eliminando numero : ");
        abb.eliminar(8);
        abb.inOrden(abb.getRaiz());
        //abb.preOrden(abb.getRaiz());
        //abb.postOrden(abb.getRaiz());
    }
}
