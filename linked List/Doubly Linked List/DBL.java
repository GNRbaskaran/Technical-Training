import java.util.LinkedList;
public class DBL{
    public static void main(String[] args) {
        LinkedList<Integer> L=new LinkedList<>();
        L.add(10);
        L.add(20);
        L.add(30);
        System.out.println("Linked List:" + L);
        L.addFirst(100);
        System.out.println("After Add First:" + L);
        L.addLast(200);
        System.out.println("After Add Last:" + L);
        int first_element=L.getFirst(),last_element=L.getLast();
        System.out.println("The First Element is:" + first_element);
        System.out.println("The last element:" + last_element);
        int removefirst_element=L.removeFirst(),removeLast_element=L.removeLast();
        System.out.println("After Removing The First Element:" + removefirst_element);
        System.out.println("After Removing The Last Element:" + removeLast_element);
        // int get_element=L.get(20);
        // System.out.println("Get Element:" + get_element);
    }
}
