public class myNode {
    private final String key;
    private int value;
    private myNode next;

    public myNode(String key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public myNode getNext() {
        return next;
    }

    public void setNext(myNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "myNode{" +
                "key='" + key + '\'' +
                ", value=" + value +
                ", next=" + next +
                '}';
    }
}
