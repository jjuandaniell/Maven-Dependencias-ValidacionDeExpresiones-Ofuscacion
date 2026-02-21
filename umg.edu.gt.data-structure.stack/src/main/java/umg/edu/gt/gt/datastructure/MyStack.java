package umg.edu.gt.datastructure;

public class MyStack<T> {
    private Node<T> top;
    private int size;

    public MyStack() {
        this.top = null;
        this.size = 0;
    }

    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    public T pop() {
        if (isEmpty()) return null;
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    public boolean isEmpty() {
        return top == null;
    }


    // Devuelve cuántos datos tiene la pila
    public int getCount() {
        return size;
    }

    // Devuelve el nodo inicial (el fondo de la pila)
    public Node<T> getNodeInit() {
        if (isEmpty()) return null;
        Node<T> current = top;
        // Recorremos hasta que el siguiente sea nulo (el último nodo)
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current;
    }
}