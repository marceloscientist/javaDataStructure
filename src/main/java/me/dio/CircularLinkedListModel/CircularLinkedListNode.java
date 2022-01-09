package me.dio.CircularLinkedListModel;

public
class CircularLinkedListNode<T> {
    private T content;
    private CircularLinkedListNode<T> nextNode;

    public
    CircularLinkedListNode (T content) {
        this.content = content;
        this.nextNode = null;
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
    CircularLinkedListNode<T> getNextNode ( ) {
        return nextNode;
    }

    public
    void setNextNode (CircularLinkedListNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public
    String toString ( ) {
        return "CircularLinkedListNode{" +
                "content=" + content +
                '}';
    }
}
