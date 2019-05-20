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


public class LinkedListProblem {

    public static void initLinkedListAndPlay() {
        LinkedList list = new LinkedList();
        list.insert(7);
        list.insert(7);
        list.insert(6);
        list.insert(7);
        list.insert(12);
        list.insert(1);
        list.insert(4);
        list.insert(7);
        list.insert(7);
        list.insert(7);
        list.insert(9);

        System.out.println(list);


        System.out.println("12 = " + list.contains(12));
        System.out.println("13 = " + list.contains(13));
        System.out.println("4 = " + list.contains(4));

        list.delete(6);
        System.out.println("6 = "+list.contains(6));

        list.deleteAllFound(7);
        System.out.println(list);
    }
}
