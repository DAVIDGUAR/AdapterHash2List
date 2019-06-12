package adapter;

import java.util.Iterator;

/**
 *
 * @author david
 */
public class Hash2List implements InterfaceList {

    private ClaseHash ch;
    private ClaseLista list = new ClaseLista();

    public Hash2List() {
    }

    public Hash2List(ClaseHash ch) {
        this.ch = ch;
        Iterator<Integer> it = ch.getHash().keySet().iterator();
        while (it.hasNext()) {
            list.putElemento(ch.getHash().get(it.next()));
        }
    }

    @Override
    public void putElemento(String elemento) {

    }

    @Override
    public String getElemento(int indejemplo) {
        return list.getElemento(indejemplo);
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
