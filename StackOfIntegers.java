public class StackOfIntegers {

    private int[] element;
    private int size;

    public StackOfIntegers() {
        this.element = new int[16];
        this.size = -1;
    }

    public StackOfIntegers(int i) {
        this.size = -1;
        this.element = new int[i];
    }

    public boolean empty() {
        return (this.size == -1);
    }

    public int peek() {
        return this.element[this.size];
    }

    public void push(int i) {
        this.size += 1;
        this.element[this.size] = i;
    }

    public int pop() {
        int temp = this.element[this.size];
        this.element[this.size] = 0;
        this.size -= 1;
        return temp;
    }

    public int getSize() {
        return this.size;
    }
}
