package me.dio.BinaryTreeModel;

public
class BinaryTreeAlgorithm<T extends Comparable<T>> {

    private BinNode<T> root;

    public
    BinaryTreeAlgorithm () {
        this.root = null;
    }

    public void insertNode(T content) {
        BinNode<T> newNode = new BinNode<>(content);
        root = insertNode(root, newNode);
    }

    private BinNode<T> insertNode(BinNode<T> curr, BinNode<T> newNode) {
        if(curr == null) {
            return newNode;
        } else if(newNode.getContent().compareTo(curr.getContent()) < 0) {
            curr.setLeftNode(insertNode(curr.getLeftNode(), newNode));
        } else {
            curr.setRightNode(insertNode(curr.getRightNode(), newNode));
        }
        return curr;
    }

    public void showTree(BinNode<T> currNode) {
        if(currNode != null) {
            showTree(currNode.getLeftNode());
            System.out.println(currNode.getContent());
            showTree(currNode.getRightNode());

        }
    }

    public void showInOrder() {
        System.out.println("\n Show in order");
        showInOrder(this.root);
    }


    private void showInOrder(BinNode<T> currNode) {
        if(currNode != null) {
            showInOrder(currNode.getLeftNode());
            System.out.print(currNode.getContent() + ", ");
            showInOrder(currNode.getRightNode());
        }
    }

    public void showPreOrder() {
        System.out.println("\n Show pre order");
        showPreOrder(this.root);
    }

    private void showPreOrder(BinNode<T> currNode) {
        if(currNode != null) {
            System.out.print(currNode.getContent() + ", ");
            showInOrder(currNode.getLeftNode());
            showInOrder(currNode.getRightNode());
        }
    }

    public void showPostOrder() {
        System.out.println("\n Show post order");
        showPostOrder(this.root);
    }

    private void showPostOrder(BinNode<T> currNode) {
        if(currNode != null) {
            showInOrder(currNode.getLeftNode());
            showInOrder(currNode.getRightNode());
            System.out.print(currNode.getContent() + ", ");
        }
    }

    public void removeNode(T content) {
        try {
            BinNode<T> curr = this.root;
            BinNode<T> dad = null;
            BinNode<T> son = null;
            BinNode<T> temp = null;

            while (curr != null && !curr.getContent().equals(content)) {
                dad = curr;
                if(content.compareTo(curr.getContent()) < 0) {
                    curr = curr.getLeftNode();
                } else {
                    curr = curr.getRightNode();
                }
            }

            if(curr == null) {
                System.out.println("Content not found. Try block");
            }

            if(dad == null) {
                if(curr.getRightNode() == null) {
                    this.root = curr.getLeftNode();
                } else if(curr.getLeftNode() == null) {
                    this.root = curr.getRightNode();
                } else {
                    for(temp = curr, son = curr.getLeftNode();
                        son.getRightNode() != null;
                        temp = son, son = son.getLeftNode()) {
                        if(son != curr.getLeftNode()) {
                            temp.setRightNode(son.getLeftNode());
                            son.setLeftNode(root.getLeftNode());
                        }
                    }
                    son.setRightNode(root.getRightNode());
                    root = son;

                }


            } else if(curr.getRightNode() == null) {
                if(dad.getLeftNode() == curr) {
                    dad.setLeftNode(curr.getLeftNode());
                } else {
                    dad.setRightNode(curr.getLeftNode());
                }
            } else if(curr.getLeftNode() == null) {
                if(dad.getLeftNode() == curr) {
                    dad.setLeftNode(curr.getRightNode());
                } else {
                    dad.setRightNode(curr.getRightNode());
                }
            } else {
                for(temp = curr, son = curr.getLeftNode();
                    son.getRightNode() != null;
                    temp = son, son = son.getRightNode()) {
                    if(son != curr.getLeftNode()) {
                        temp.setRightNode(son.getLeftNode());
                        son.setLeftNode(curr.getLeftNode());
                    }
                    son.setRightNode(curr.getRightNode());
                    if(dad.getLeftNode() == curr) {
                        dad.setLeftNode(son);
                    } else {
                        dad.setRightNode(son);
                    }
                }
            }

        } catch (NullPointerException err) {
            System.out.println("Content not found. Catch block");
        }
    }


}
