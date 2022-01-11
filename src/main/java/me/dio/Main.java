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

import java.util.*;

public
class Main {
    public static
    void main (String[] args) {


        /*-----------// Map && HashMap Examples // ----------- */
        Map<String, String> aluno = new HashMap<>();
        aluno.put("nome", "Marcelo");
        aluno.put("idade", "37");

        Map<String, String> aluno1 = new HashMap<>();
        aluno1.put("nome", "Angélica");
        aluno1.put("idade", "32");

        List<Map<String, String>> alunos = new ArrayList<>();
        alunos.add(aluno);
        alunos.add(aluno1);
        System.out.println(alunos);
        System.out.println(aluno.containsKey("idade"));

        /*
        */
/*-----------// Set && TreeSet Examples // ----------- *//*

        Set<Car> cars = new HashSet<>();
        cars.add(new Car("Ford"));
        cars.add(new Car("Chevrolet"));
        cars.add(new Car("Volkswagen"));

        System.out.println(cars);


        Set<Car> treeCars = new TreeSet<>();
        treeCars.add(new Car("Ford"));
        treeCars.add(new Car("Chevrolet"));
        treeCars.add(new Car("Volkswagen"));

        System.out.println(treeCars);
*/

        /*-----------// Queue Examples // ----------- *//*
        Queue<Car> cars = new LinkedList<>();
        cars.add(new Car("Ford"));
        cars.add(new Car("Chevrolet"));
        cars.add(new Car("Volkswagen"));

        System.out.println(cars.add(new Car("Peugeot")));
        System.out.println(cars);
        System.out.println(cars.offer(new Car("Renault")));
        System.out.println(cars);
        System.out.println(cars.peek());
        System.out.println(cars);
        System.out.println(cars.poll());
        System.out.println(cars);
        System.out.println(cars.isEmpty());
        System.out.println(cars.size());
*/
        /*

        *//*-----------// Stack Examples // ----------- *//*
        Stack<Car> cars = new Stack<>();
        cars.push(new Car("Ford"));
        cars.push(new Car("Chevrolet"));
        cars.push(new Car("Volkswagen"));
        cars.push(new Car("Ford"));
        cars.push(new Car("Ford1"));

        System.out.println(cars);
        System.out.println(cars.pop());
        System.out.println(cars);
        System.out.println(cars.peek());
        System.out.println(cars);

        System.out.println(cars.empty());
*/
      /*  *//*-----------// List && ArrayList >> HashCode & Equals Examples // ----------- *//*

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Ford"));
        cars.add(new Car("Chevrolet"));
        cars.add(new Car("Volkswagen"));
        cars.add(new Car("Ford"));
        cars.add(new Car("Ford1"));

        System.out.println(cars.contains(new Car("Ford")));
        System.out.println(cars.get(0).equals(cars.get(3)));
        System.out.println(cars.get(0).hashCode());
        System.out.println(cars.get(3).hashCode());
        System.out.println(cars.get(4).hashCode());
*/



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
