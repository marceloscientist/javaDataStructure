package me.dio.DoublyLinkedListModel;

public
class DoublyLinkedNode<T> {
    private T content;
    private DoublyLinkedNode<T> nextNode;
    private DoublyLinkedNode<T> previousNode;

    public
    DoublyLinkedNode (T content) {
        this.content = content;
    }

    public
    T getContent ( ) {
        return content;
    }

    public
    void setContent (T content) {
        this.content = content;
    }

    public
    DoublyLinkedNode<T> getNextNode ( ) {
        return nextNode;
    }

    public
    void setNextNode (DoublyLinkedNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public
    DoublyLinkedNode<T> getPreviousNode ( ) {
        return previousNode;
    }

    public
    void setPreviousNode (DoublyLinkedNode<T> previousNode) {
        this.previousNode = previousNode;
    }

    @Override
    public
    String toString ( ) {
        return "DoublyLinkedNode{" +
                "content=" + content +
                '}';
    }
}
