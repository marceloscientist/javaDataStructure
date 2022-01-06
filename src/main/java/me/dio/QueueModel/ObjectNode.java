package me.dio.QueueModel;

import me.dio.StackModel.IntNode;

public
class ObjectNode<T> {
    private T object;
    private ObjectNode<T> objectNodeReference;

    public
    ObjectNode ( ) {
    }

    public
    ObjectNode (T object) {
        this.object = object;
        this.objectNodeReference = null;
    }

    public
    T getObject ( ) {
        return object;
    }

    public
    void setObject (T object) {
        this.object = object;
    }

    public
    ObjectNode<T> getObjectNodeReference ( ) {
        return objectNodeReference;
    }

    public
    void setObjectNodeReference (ObjectNode<T> objectNodeReference) {
        this.objectNodeReference = objectNodeReference;
    }

    @Override
    public
    String toString ( ) {
        return "ObjectNode{" +
                "object=" + object +
                '}';
    }
}
