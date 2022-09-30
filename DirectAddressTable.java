public class DirectAddressTable {
    private static final int DEFAULT_SIZE = 10;
    private int size;
    private Node[] nodes;

    public DirectAddressTable() {
        nodes = new Node[DEFAULT_SIZE];
        size = DEFAULT_SIZE;
    }

    public DirectAddressTable(int size) {
        nodes = new Node[size];
        this.size = size;
    }

    public Node getIndex(int index) {
        return nodes[index];
    }

    public void insert(int key, String value) throws RuntimeException {
        if (key < 0 || key >= size)
            throw new RuntimeException("Key must be more than 0 and less than " + size);

        Node node = new Node(key, value);
        nodes[key] = node;
    }

    public void delete(int key) throws RuntimeException {
        if (key < 0 || key >= size)
            throw new RuntimeException("Key must be more than 0 and less than " + size);
        if (getIndex(key) == null)
            throw new RuntimeException("There is no node with a key of " + key + " to delete");

        nodes[key] = null;
    }

    public String search(int key) {
        if (key < 0 || key >= size)
            throw new RuntimeException("Key must be more than 0 and less than " + size);
        if (getIndex(key) == null)
            throw new RuntimeException("There is no node with a key of " + key + " to search");

        return nodes[key].getValue();
    }

    public void clear() {
        nodes = new Node[size];
    }
}
