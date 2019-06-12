package adapter;

import java.util.HashMap;

/**
 *
 * @author david
 */
public class ClaseHash implements InterfaceHash {

    private HashMap<Integer, String> hash;
    private static int id = 10;

    public ClaseHash() {
        this.hash = new HashMap<>();
    }

    public HashMap<Integer, String> getHash() {
        return hash;
    }

    @Override
    public String toString() {
        return "ClaseHash{" + "hash=" + hash + '}';
    }

    @Override
    public void putValue(String elemento) {
        hash.put(id, elemento);
        id++;
    }

    @Override
    public String pushValue(int key) {
        return hash.get(key);
    }

}
