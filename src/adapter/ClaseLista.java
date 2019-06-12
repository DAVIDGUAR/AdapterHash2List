package adapter;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author david
 */
public class ClaseLista implements InterfaceList {

    ArrayList<String> list;

    public ClaseLista() {
        this.list = new ArrayList<>();
    }

    /**
     * @return the list
     */
    public ArrayList<String> getLista() {
        return list;
    }

    @Override
    public void putElemento(String elemento) {
        getLista().add(elemento);
    }

    @Override
    public String getElemento(int indejemplo) {
        return getLista().get(indejemplo);
    }

    @Override
    public Iterator iterator() {
        return list.iterator();
    }

    @Override
    public int size() {
        return list.size();
    }

}
