package adapter;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author david
 */
public interface InterfaceList {

    public ArrayList<String> list = new ArrayList<>();

    public void putElemento(String elemento);

    public String getElemento(int indejemplo);

    public Iterator iterator();

    public int size();

}
