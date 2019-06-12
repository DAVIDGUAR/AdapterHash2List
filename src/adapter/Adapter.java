package adapter;

/**
 *
 * @author david
 */
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClaseHash hash = new ClaseHash();
        hash.putValue("valor 1");
        hash.putValue("valor 2");

        MostrarClaseLista.mostrar(new Hash2List(hash));

        ClaseLista list = new ClaseLista();
        list.putElemento("elemento 1");
        list.putElemento("elemento 2");

        MostrarClaseLista.mostrar(list);

    }

}
