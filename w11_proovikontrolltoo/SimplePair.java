public class SimplePair<K, V> implements MyPair<K, V> {

    /*
     * T - Type E - Element K - Key V - Value S, U, V
     */

    private K key;
    private V value;

    public SimplePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }

}
