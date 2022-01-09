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
        return listSize;
    }
}
