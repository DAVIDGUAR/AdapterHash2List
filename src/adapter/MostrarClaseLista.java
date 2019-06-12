package adapter;

/**
 *
 * @author david
 */
public class MostrarClaseLista {
    public static void mostrar(InterfaceList lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " " + lista.getElemento(i));
        }
    }

}