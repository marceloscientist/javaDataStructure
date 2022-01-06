package me.dio.StackModel;

public
class IntNode {
    private int data;
    private IntNode intNodeReference = null;

    public
    IntNode ( ) {
    }

    public
    IntNode (int data) {
        this.data = data;
    }

    public
    int getData ( ) {
        return data;
    }

    public
    void setData (int data) {
        this.data = data;
    }

    public
    IntNode getNodeReference ( ) {
        return intNodeReference;
    }

    public
    void setNodeReference (IntNode intNodeReference) {
        this.intNodeReference = intNodeReference;
    }

    @Override
    public
    String toString ( ) {
        return "Node{" +
                "data=" + data +'}';
    }
}
