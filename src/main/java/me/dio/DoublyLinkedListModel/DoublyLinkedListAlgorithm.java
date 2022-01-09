package me.dio.DoublyLinkedListModel;

public
class DoublyLinkedListAlgorithm<T> {
    private DoublyLinkedNode<T> firstNode;
    private DoublyLinkedNode<T> lastNode;
    private int listSize = 0;

    public
    DoublyLinkedListAlgorithm () {
        this.firstNode = null;
        this.lastNode = null;
        this.listSize = 0;
    }

    public  int size() {
        return this.listSize;
    }

    public T get(int index) {
        return  this.getNode(index).getContent();
    }


    public void add(T element) {
        DoublyLinkedNode<T> newNode = new DoublyLinkedNode<>(element);
        newNode.setNextNode(null);
        newNode.setPreviousNode(lastNode);
        if(firstNode == null) firstNode = newNode;
        if(lastNode != null) lastNode.setNextNode(newNode);
        lastNode = newNode;
        listSize++;
    }

    public void add(int index, T element) {
        DoublyLinkedNode<T> auxiliaryNode = getNode(index);
        DoublyLinkedNode<T> newNode = new DoublyLinkedNode<>(element);
        newNode.setNextNode(auxiliaryNode);

        if(newNode.getNextNode() != null) {
            newNode.setPreviousNode(auxiliaryNode.getPreviousNode());
            newNode.getNextNode().setPreviousNode(newNode);
        } else {
            newNode.setPreviousNode(lastNode);
            lastNode = newNode;
        }
        if(index == 0) {
            firstNode = newNode;
        } else {
            newNode.getPreviousNode().setNextNode(newNode);
        }

        listSize++;
    }

    public void remove(int index) {
        if (index == 0) {
            firstNode = firstNode.getNextNode();
            if(firstNode != null) {
                firstNode.setPreviousNode(null);
            }
        } else {
            DoublyLinkedNode<T> auxiliaryNode = getNode(index);
            auxiliaryNode.getPreviousNode().setNextNode(auxiliaryNode.getNextNode());
            if(auxiliaryNode != lastNode) {
                auxiliaryNode.getNextNode().setPreviousNode(auxiliaryNode.getPreviousNode());
            } else {
                lastNode = auxiliaryNode;
            }
        }
        this.listSize--;
    }

    @Override
    public
    String toString ( ) {
        String returnString = "";

        DoublyLinkedNode<T> auxiliaryNode = firstNode;
        for(int i = 0; i < size(); i++) {
            returnString += "[Node{content=" + auxiliaryNode.getContent() +"}]----->";
            auxiliaryNode = auxiliaryNode.getNextNode();
        }
        returnString += "null";

        return returnString;
    }

    private DoublyLinkedNode<T> getNode(int index) {
        DoublyLinkedNode<T> auxiliaryNode = firstNode;

        for(int i = 0; (i < index) && (auxiliaryNode != null); i++) {
            auxiliaryNode = auxiliaryNode.getNextNode();
        }
        return auxiliaryNode;
    }
}
