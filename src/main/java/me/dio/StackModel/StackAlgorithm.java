package me.dio.StackModel;

public
class StackAlgorithm    {
    private IntNode stackInputIntNodeReference;

    public
    StackAlgorithm () {
        this.stackInputIntNodeReference = null;
    }

    public void push(IntNode newIntNode) {
        IntNode auxiliaryReference = this.stackInputIntNodeReference;
        this.stackInputIntNodeReference = newIntNode;
        this.stackInputIntNodeReference.setNodeReference(auxiliaryReference);
    }

    public
    IntNode pop() {
        if(!this.isEmpty()) {
            IntNode poppedIntNode = this.stackInputIntNodeReference;
            this.stackInputIntNodeReference = this.stackInputIntNodeReference.getNodeReference();
            return poppedIntNode;
        } return null;
    }

    public boolean isEmpty() {
        return (this.stackInputIntNodeReference == null) ? true : false;
    }

    public
    IntNode top() {
        return this.stackInputIntNodeReference;
    }

    @Override
    public
    String toString ( ) {

        String stringReturn = "------------------\n";
        stringReturn += "      Stack\n";
        stringReturn += "------------------\n";

        IntNode auxiliaryReference = this.stackInputIntNodeReference;

        while(true) {
            if(auxiliaryReference != null) {
                stringReturn += "[Node{data=}"+auxiliaryReference.getData()+"]\n";
                auxiliaryReference = auxiliaryReference.getNodeReference();
            } else {
                break;
            }
        }
        stringReturn += "------------------\n";
        return stringReturn;
    }
}
