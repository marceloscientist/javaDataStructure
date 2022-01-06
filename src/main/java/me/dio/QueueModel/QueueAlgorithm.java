package me.dio.QueueModel;

public
class QueueAlgorithm<T> {

    private ObjectNode<T> objectNodeReference;

    public
    QueueAlgorithm () {
        this.objectNodeReference = null;
    }

    public boolean isEmpty() {
        return objectNodeReference == null ? true : false;
    }

    public void enqueue(T object) {
        ObjectNode newObjectNode = new ObjectNode(object);
        newObjectNode.setObjectNodeReference(objectNodeReference);
        objectNodeReference = newObjectNode;
    }

    public T first() {
        if(!this.isEmpty()) {
            ObjectNode firstObjectNode = this.objectNodeReference;
            while (true) {
                if(firstObjectNode.getObjectNodeReference() != null) {
                    firstObjectNode = firstObjectNode.getObjectNodeReference();
                } else {
                    break;
                }
            } return (T) firstObjectNode.getObject();
        } return null;
    }

    public T dequeue() {
        if(!this.isEmpty()) {
            ObjectNode firstObjectNode = this.objectNodeReference;
            ObjectNode auxiliaryObjectNode = this.objectNodeReference;

            while(true) {
                if(firstObjectNode.getObjectNodeReference() != null) {
                    auxiliaryObjectNode = firstObjectNode;
                    firstObjectNode =  firstObjectNode.getObjectNodeReference();
                } else {
                    auxiliaryObjectNode.setObjectNodeReference(null);
                    break;
                }
            } return (T) firstObjectNode.getObject();
        } return null;
    }

    @Override
    public
    String toString ( ) {
        String stringReturn = "";
        ObjectNode auxiliaryObjectNode = this.objectNodeReference;

        if(this.objectNodeReference != null) {
            while (true) {
                stringReturn += "[Node{object= "+ auxiliaryObjectNode.getObject() +"}]-->";
                if(auxiliaryObjectNode.getObjectNodeReference() != null) {
                    auxiliaryObjectNode = auxiliaryObjectNode.getObjectNodeReference();
                } else {
                    stringReturn += "null";
                    break;
                }
            }
        } else stringReturn = "null";
        return stringReturn;
    }
}
