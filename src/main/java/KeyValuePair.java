public class KeyValuePair<K, V> {

    private K key;
    private V value;

    KeyValuePair(K key, V value) {
        this.setKey(key);
        this.setValue(value);
    }
    
    public K getKey() {
        return key;
    }


    public V getValue() {
        return value;
    }


    public void setValue(V newValue) {
        value = newValue;
    }

    public void setKey(K newKey) {
        key = newKey;
    }


}
