package me.dio.CircularLinkedListModel;

public
class CircularLinkedListAlgorithm<T> {
    private CircularLinkedListNode<T> head;
    private CircularLinkedListNode<T> tail;
    private int listSize;

    public
    CircularLinkedListAlgorithm () {
        this.head = null;
        this.tail = null;
        this.listSize = 0;
    }

    private CircularLinkedListNode<T> getNode(int index) {
        if(this.isEmpty()) {
            throw new IndexOutOfBoundsException("A lista está vazia");
        }

        if(index == 0) {
            return this.tail;
        }

        CircularLinkedListNode<T> auxiliaryNode = this.tail;
        for(int i = 0; (i < index) && (auxiliaryNode != null); i++) {
            auxiliaryNode = auxiliaryNode.getNextNode();
        }
        return auxiliaryNode;
    }

     public T get(int index) {
        return this.getNode(index).getContent();
     }

    public boolean isEmpty() {
        return this.listSize == 0? true : false;
    }

    public int size() {
        return this.listSize;
    }
    public void add(T content) {
        CircularLinkedListNode<T> newNode = new CircularLinkedListNode<>(content);
        if(this.listSize == 0) {
            this.head = newNode;
            this.tail = this.head;
            this.head.setNextNode(tail);
        } else {
            newNode.setNextNode(this.tail);
            this.head.setNextNode(newNode);
            this.tail = newNode;
        }
        this.listSize++;

    }
    public void remove(int index) {
        if(index >= this.listSize)
            throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista");
        CircularLinkedListNode<T> auxiliaryNode = this.tail;
        if(index == 0) {
            this.tail = this.tail.getNextNode();
            this.head.setNextNode(this.tail);
        } else if(index == 1) {
            this.tail.setNextNode(this.tail.getNextNode().getNextNode());
        } else {
            for(int i = 0; i < index-1; i++) {
                auxiliaryNode = auxiliaryNode.getNextNode();
            }
            auxiliaryNode.setNextNode(auxiliaryNode.getNextNode().getNextNode());
        }
        this.listSize--;
    }

    @Override
    public
    String toString ( ) {
        String stringReturn = "";

        CircularLinkedListNode<T> auxiliaryNode = this.tail;
        for (int i = 0; i < this.size(); i++) {
            stringReturn += "[Node{content=" + auxiliaryNode.getContent() + "}]--->";
            auxiliaryNode = auxiliaryNode.getNextNode();
        }

        stringReturn += this.listSize != 0 ?
                "(retorna ao início)":
                "[]";
        return stringReturn;
    }
}
