package advanced;

/*
 * you have to delete all occurrences
 * of a number from linked list
 *
 * cases :
 * 1. at start of linked list
 * 2. start and consecutive
 * 3. some where in middle and consecutive
 */
class LinkedList {
    Node node;

    static class Node {
        int data;
        Node node;

        Node(int data) {
            this.data = data;
            this.node = null;
        }

        @Override
        public String toString() {
            return ">" +
                    "data=" + data +
                    ",node=" + node +
                    "";
        }
    }

    public void insert(int data) {
        node = insertRecursively(node, data);
    }

    public boolean contains(int data) {
        return containsRecursively(node, data);
    }

    public void delete(int data) { node = deleteRecursively(node, data); }

    public void deleteAllFound(int data) { node = deleteAllFound(node, data); }

    private Node insertRecursively(Node current, int data) {
        if (current == null)
            return new Node(data);

        current.node = insertRecursively(current.node, data);
        return current;
    }

    private boolean containsRecursively(Node current, int data) {
        if (current == null)
            return false;
        if (current.data == data)
            return true;

        return containsRecursively(current.node, data);
    }

    private Node deleteRecursively(Node current, int data){

        if(current == null)
            return null;

        if(current.data == data){
            if(current.node == null){
                return null;
            }
            else return current.node;
        }else{
            current.node = deleteRecursively(current.node, data);
        }
        return current;
    }

    private Node deleteAllFound(Node current, int data){
        if(current == null)
            return null;

        Node temp = current;
        Node prev = null;

        while(temp != null && temp.data == data){
            current = temp.node;
            temp = current;
        }

        while(temp != null){
            if(temp.data == data){
                prev.node = temp.node;
            }else {
                prev = temp;
            }
            temp = temp.node;
        }
        return current;
    }

    @Override
    public String toString() {
        return "LinkedList{" + node + '}';
    }
}

