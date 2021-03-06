package test.jerarquicas;

import jerarquicas.ArbolGenerico;
import lineales.dinamicas.Lista;

/**
 *
 * @author Matthew
 */
public class testArbolGenerico {

    public static void main(String[] args) {
        ArbolGenerico arbol = new ArbolGenerico();

        arbol.insertar(1, null);

        arbol.insertar(2, 1);
        arbol.insertar(3, 1);
        arbol.insertar(4, 1);
        arbol.insertar(8, 2);
        arbol.insertar(9, 2);
        arbol.insertar(10, 2);
        arbol.insertar(100, 3);
        arbol.insertar(15, 10);
        arbol.insertar(20, 10);
        arbol.insertar(300, 20);
        arbol.insertar(2, 300);
        arbol.insertar(333, 300);
        arbol.insertar(42, 333);
        arbol.insertar(50, 42);
        arbol.insertar(30, 50);

        System.out.println(arbol.toString());
        System.out.println(arbol.ancestros(20).toString());
        System.out.println("ALTURA: " + arbol.altura());
        System.out.println("NIVEL: " + arbol.nivel(2));
        int i = 43;
        System.out.println("PADRE DE " + i + ": " + arbol.padre(i));
        System.out.println("PREORDEN: " + arbol.listarPreOrden().toString());
        System.out.println("INORDEN: " + arbol.listarInOrden().toString());
        System.out.println("POSORDEN: " + arbol.listarPosOrden().toString());
        System.out.println("LISTAR POR NIVELES: " + arbol.listarPorNiveles().toString());
        System.out.println("CLON:\n");
        System.out.println("VERIFICAR CAMINO: ");
        Lista l = new Lista();
        l.insertar(1);
        l.insertar(2);
        l.insertar(10);
        System.out.println(arbol.verificarCamino(l, l.longitud()));
        System.out.println(arbol.descendienteMasLejano(2));
        System.out.println("CAMINO ALTURA: "+arbol.caminoQueJustificaLaAltura().toString());

    }
}
