package homework4_1_3;

class Box<K, T extends Fruit> {
    private T obj;
    private K key;

    public Box(K key, T obj) {
        this.obj = obj;
        this.key = key;
    }

    public T getObj() {
        return obj;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Box{" +
                "key=" + key +
                "; keyType=" + key.getClass().getName() +
                ", obj=" + obj +
                "; objType=" + obj.getClass().getName() +
                '}';
    }
}
