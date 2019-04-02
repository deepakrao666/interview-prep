package prep;

/*
 * you have to delete all occurrences
 * of a number from linked list
 *
 * cases :
 * 1. at start of linked list
 * 2. start and consecutive
 * 3. some where in middle and consecutive
 */


public class LinkedListProblem {

    public void initLinkedListAndPlay() {

    }
}

class LinkedList {
    Node node;

    static class Node {
        int data;
        Node node;

        Node(int data) {
            this.data = data;
            this.node = null;
        }
    }

    public void insert(int data) {
        node = insertRecursively(node, data);
    }

    public boolean contains(int data) {
        return containsRecursively(node, data);
    }

    private Node insertRecursively(Node current, int data) {
        if (current == null)
            return new Node(data);

        current = insertRecursively(current.node, data);
        return current;
    }

    private boolean containsRecursively(Node current, int data) {
        if (current == null)
            return false;
        if (current.data == data)
            return true;

        return containsRecursively(current.node, data);
    }

}

