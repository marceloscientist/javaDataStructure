package me.dio;

import me.dio.BinaryTreeModel.BinaryTreeAlgorithm;
import me.dio.BinaryTreeModel.Object;
import me.dio.CircularLinkedListModel.CircularLinkedListAlgorithm;
import me.dio.CircularLinkedListModel.CircularLinkedListNode;
import me.dio.DoublyLinkedListModel.DoublyLinkedListAlgorithm;
import me.dio.LinkedListModel.LinkedListAlgorithm;
import me.dio.LinkedListModel.LinkedNode;
import me.dio.QueueModel.ObjectNode;
import me.dio.QueueModel.QueueAlgorithm;
import me.dio.StackModel.IntNode;
import me.dio.StackModel.StackAlgorithm;
import me.dio.model.Car;

import java.util.ArrayList;

public
class Main {
    public static
    void main (String[] args) {

        /*-----------// HashCode & Equals Examples // ----------- */

        List<Car> cars = new ArrayList<>();




        /*  *//*-----------// Binary Tree List Example // ----------- *//*

        BinaryTreeAlgorithm<Object> myTree  = new BinaryTreeAlgorithm<>();

        myTree.insertNode(new Object(13));
        myTree.insertNode(new Object(10));
        myTree.insertNode(new Object(25));
        myTree.insertNode(new Object(2));
        myTree.insertNode(new Object(12));
        myTree.insertNode(new Object(20));
        myTree.insertNode(new Object(31));
        myTree.insertNode(new Object(29));

        myTree.showInOrder();
        myTree.showPreOrder();
        myTree.showPostOrder();
*/

        /*-----------// Circular Linked List Example // -----------

        CircularLinkedListAlgorithm<String> myCircularLinkedListNode  = new CircularLinkedListAlgorithm<>();

        System.out.println(myCircularLinkedListNode);
        myCircularLinkedListNode.add("#1 - First Linked Node");
        myCircularLinkedListNode.add("#2 - Second Linked Node");
        myCircularLinkedListNode.add("#3 - Third Linked Node");
        myCircularLinkedListNode.add("#4 - Forth Linked Node");

        System.out.println(myCircularLinkedListNode.get(0));
        System.out.println(myCircularLinkedListNode);

        System.out.println(myCircularLinkedListNode.get(1));
        System.out.println(myCircularLinkedListNode.get(2));
        System.out.println(myCircularLinkedListNode);

        myCircularLinkedListNode.remove(0);
        System.out.println(myCircularLinkedListNode);
        System.out.println(myCircularLinkedListNode.get(1));

        myCircularLinkedListNode.remove(1);
        System.out.println(myCircularLinkedListNode);


         */


        /*-----------// Doubly Linked List Example // -----------
        DoublyLinkedListAlgorithm<String> myDoublyLinkedNode = new DoublyLinkedListAlgorithm<>();

        myDoublyLinkedNode.add("#1 - First Linked Node");
        myDoublyLinkedNode.add("#3 - Third Linked Node");
        myDoublyLinkedNode.add(1,"#2 - Second Linked Node");
        myDoublyLinkedNode.add("#4 - Forth Linked Node");

        System.out.println(myDoublyLinkedNode.get(0));
        System.out.println(myDoublyLinkedNode.get(1));
        System.out.println(myDoublyLinkedNode.get(2));
        System.out.println(myDoublyLinkedNode.get(3));

        myDoublyLinkedNode.remove(3);
        System.out.println(myDoublyLinkedNode);*/



       /*-----------// Linked List Example // -----------


        LinkedListAlgorithm<String> myLinkedNode = new LinkedListAlgorithm<>();

        myLinkedNode.add("#1 - First Linked Node");
        myLinkedNode.add("#2 - Second Linked Node");
        myLinkedNode.add("#3 - Third Linked Node");
        myLinkedNode.add("#4 - Forth Linked Node");

        System.out.println(myLinkedNode.getContent(0));
        System.out.println(myLinkedNode.getContent(1));
        System.out.println(myLinkedNode.getContent(2));
        System.out.println(myLinkedNode.getContent(3));

        myLinkedNode.remove(2);
        System.out.println(myLinkedNode);
        */
      /*

       /*-----------// Queue Example // -----------
        QueueAlgorithm<String> myQueue = new QueueAlgorithm<>();
        myQueue.enqueue("primeiro");
        myQueue.enqueue("segundo");
        myQueue.dequeue();
        myQueue.enqueue("terceiro");
        System.out.println(myQueue.toString());
        System.out.println(myQueue.first());*/


        /*-----------// Stack Example // -----------
        StackAlgorithm myStack = new StackAlgorithm();
        myStack.push(new IntNode(1));
        myStack.push(new IntNode(2));
        myStack.push(new IntNode(3));
        myStack.push(new IntNode(4));
        myStack.push(new IntNode(5));
        myStack.push(new IntNode(6));

        myStack.pop();
        myStack.push(new IntNode(7));
        System.out.println(myStack);
        System.out.println(myStack.top());*/

    }
}
