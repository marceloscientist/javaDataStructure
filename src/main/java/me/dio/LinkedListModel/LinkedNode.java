package me.dio.LinkedListModel;

public
class LinkedNode<T> {
    private T content;
    private LinkedNode nextNode;

    public
    LinkedNode ( ) {
        this.nextNode = null;
    }

    public
    LinkedNode (T content) {
        this.nextNode = null;
        this.content = content;
    }

    public
    LinkedNode (T content, LinkedNode nextNode) {
        this.nextNode = nextNode;
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
    LinkedNode getNextNode ( ) {
        return nextNode;
    }

    public
    void setNextNode (LinkedNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public
    String toString ( ) {
        return "LinkedNode{" +
                "content=" + content +
                '}';
    }

    public
    String linkedToString ( ) {
        String str = "LinkedNode{" +
                "content=" + content +
                '}';
        if(nextNode != null) str += "->" + nextNode.toString();
        else str += "->null";

        return str;
    }

}
