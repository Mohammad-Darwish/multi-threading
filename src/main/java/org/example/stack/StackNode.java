package org.example.stack;

public class StackNode<T> {
    public T value;
    public StackNode<T> next;

    public StackNode(T value) {
        this.value = value;
    }
}
