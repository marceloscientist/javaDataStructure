package me.dio.LinkedListModel;

public
class LinkedListAlgorithm<T> {
    LinkedNode<T> inputReference;

    public LinkedListAlgorithm() {
        this.inputReference = null;
    }

    private LinkedNode<T> getLinkedNode(int index) {

        indexValidation(index);

        LinkedNode<T> auxLinkedNode = this.inputReference;
        LinkedNode<T> returnNode = null;

        for(int i = 0; i <= index;i++) {
            returnNode = auxLinkedNode;
            auxLinkedNode = auxLinkedNode.getNextNode();
        }
        return returnNode;
    }

    public T remove(int index) {
        LinkedNode<T> pivotNode = this.getLinkedNode(index);
        if(index == 0) {
            this.inputReference = pivotNode.getNextNode();
            return pivotNode.getContent();
        }
        LinkedNode<T> lastLinkedNode = getLinkedNode(index - 1);
        lastLinkedNode.setNextNode(pivotNode.getNextNode());
        return pivotNode.getContent();
    }

    public T getContent(int index) {
        return getLinkedNode(index).getContent();
    }

    private
    void indexValidation (int index) {
        if(index >= size()) {
            int lastIndex = size() - 1;
            throw new IndexOutOfBoundsException(
                    "Não existe conteúdo no índice " +
                            index + " desta lista\n" +
                            "O último índice desta lista é " +
                            lastIndex);
        }
    }

    public void add(T content) {
        LinkedNode<T> newLinkedNode = new LinkedNode<>(content);
        if(this.isEmpty()) {
            inputReference = newLinkedNode;
            return;
        }
        LinkedNode<T> auxLinkedNode = this.inputReference;
        for(int i = 0; i < this.size()-1;i++) {
            auxLinkedNode = auxLinkedNode.getNextNode();
        }
        auxLinkedNode.setNextNode(newLinkedNode);
    }
    public int size() {
        int listSize = 0;
        LinkedNode<T> auxReference = this.inputReference;
        while (true) {
            if(auxReference != null) {
                listSize++;
                if(auxReference.getNextNode() != null) {
                    auxReference = auxReference.getNextNode();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return listSize;
    }

    public boolean isEmpty() {
        return inputReference == null? true : false;
    }

    @Override
    public
    String toString ( ) {
        String str = "";
        LinkedNode<T> auxLinkedNode = this.inputReference;
        for(int i = 0; i < this.size(); i++) {
            str += "Node{content= " + auxLinkedNode.getContent() + "}--->";
            auxLinkedNode = auxLinkedNode.getNextNode();
        }
        str += "null";
        return str;
    }
}
