package com.javaprep.datastructures.trees;

public class BinaryTreeBasic<X extends Comparable<X>> {
    private Node root;
    private int size;

    public BinaryTreeBasic() {
        this.root = null;
    }

    public int getSize() {
        return size;
    }

    public void add(X item) {
        Node newNode = new Node(item);

        if (this.root == null) {
            this.root = newNode;
            this.size++;
            System.out.println("Root : " + newNode.getData());
        } else {
            insert(this.root, newNode);
        }
    }



    private void insert(Node parent, Node child) {
        if (child.getData().compareTo(parent.getData()) <= 0) {
            if (parent.getLeft() == null) {
                parent.setLeft(child);
                child.setParent(parent);
                this.size++;
            } else {
                insert(parent.getLeft(), child);
            }
        } else if (child.getData().compareTo(parent.getData()) > 0) {
            if (parent.getRight() == null) {
                parent.setRight(child);
                child.setParent(parent);
                this.size++;
            } else {
                insert(parent.getRight(), child);
            }
        }
    }

    public boolean contains(X item) {
        return lookUp(this.root, item);
    }

    public boolean lookUp(Node current, X item) {
        if (current == null) {
            return false;
        }
        if (current.getData().compareTo(item) == 0) {
            return true;
        } else if (current.getData().compareTo(item) < 0) {
            return lookUp(current.getRight(), item);
        } else {
            return lookUp(current.getLeft(), item);
        }
    }

    public String inOrderToString() {
        StringBuffer contents = new StringBuffer();
        contents.append("InOrder : [");
        inOrderGetNode(this.root, contents);
        contents.deleteCharAt(contents.length()-1);
        contents.append("]");
        return contents.toString();
    }

    private void inOrderGetNode(Node current, StringBuffer contents) {
        if (current == null) {
            return;
        }

        inOrderGetNode(current.getLeft(), contents);
        contents.append(current.getData()+ ",");
        inOrderGetNode(current.getRight(), contents);
    }

    public String preOrderToString() {
        StringBuffer contents = new StringBuffer();
        contents.append("PreOrder : [");
        preOrderGetNode(this.root, contents);
        contents.deleteCharAt(contents.length()-1);
        contents.append("]");
        return contents.toString();
    }

    private void preOrderGetNode(Node current, StringBuffer contents) {
        if (current == null) {
            return;
        }

        contents.append(current.getData()+ ",");
        preOrderGetNode(current.getLeft(), contents);
        preOrderGetNode(current.getRight(), contents);
    }

    public String postOrderToString() {
        StringBuffer contents = new StringBuffer();
        contents.append("PostOrder : [");
        postOrderGetNode(this.root, contents);
        contents.deleteCharAt(contents.length()-1);
        contents.append("]");
        return contents.toString();
    }

    private void postOrderGetNode(Node current, StringBuffer contents) {
        if (current == null) {
            return;
        }
        postOrderGetNode(current.getLeft(), contents);
        postOrderGetNode(current.getRight(), contents);
        contents.append(current.getData()+ ",");
    }

    private class Node {
        private Node left;
        private Node right;
        private Node parent;
        private X data;

        public Node(X item) {
            this.left = null;
            this.right = null;
            this.parent = null;
            this.data = item;
        }


        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public X getData() {
            return data;
        }

        public void setData(X data) {
            this.data = data;
        }
    }
}
