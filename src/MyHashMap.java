public class MyHashMap {

    int arrayLength = 20;

    myNode[] array;

    public MyHashMap() {
        array = new myNode[arrayLength];
    }

    public void put(String key, Integer value) {

        //find array index using hashcode and modulo
        int arrayIndex = myHashCode(key);

        if (array[arrayIndex] == null) {
            array[arrayIndex] = new myNode(key, value);
            return;
        }

        myNode current = array[arrayIndex];
        myNode prev = null;

        while (current != null) {
            if (current.getKey().equals(key)) {
                current.setValue(value);
                return;
            }
            prev = current;
            current = current.getNext();
        }

        if (prev != null) {
            prev.setNext(new myNode(key, value));
        }
    }

    public int get(String key) {
        // find the array index using the hashing of the key string
        int arrayIndex = myHashCode(key);

        // search for the node in the linked list in the correct array
        myNode keyMatchNode = findNode(array[arrayIndex], key);

        return keyMatchNode.getValue();
    }

    public int myHashCode(String key) {
        return Math.abs(key.hashCode() % arrayLength);
    }

    public myNode findNode(myNode current, String key) {
        while (current != null) {
            if (current.getKey().equals(key)) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < arrayLength; i++) {
            output.append("INDEX: ").append(i).append("\n");

            myNode current = array[i];

            while (current != null) {
                output.append("KEY: ").append(current.getKey()).append(" VALUE: ").append(current.getValue()).append("\n");
                current = current.getNext();
            }
        }

        return output.toString();
    }
}

