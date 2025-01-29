public class MyHashMap {
    private static class Node {
        Object key;
        Object value;
        Node next;

        Node(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node[] buckets;
    private int size;

    public MyHashMap() {
        buckets = new Node[16];
    }

    public void put(Object key, Object value) {
        int index = getIndex(key);
        Node current = buckets[index];
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }
        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;
    }

    public void remove(Object key) {
        if (size == 0) {
            throw new IllegalStateException("Map is empty");
        }
        int index = getIndex(key);
        Node current = buckets[index];
        Node prev = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public void clear() {
        buckets = new Node[16];
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(Object key) {
        if (size == 0) {
            throw new IllegalStateException("Map is empty");
        }
        int index = getIndex(key);
        Node current = buckets[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    private int getIndex(Object key) {
        return Math.abs(key.hashCode() % buckets.length);
    }
}
