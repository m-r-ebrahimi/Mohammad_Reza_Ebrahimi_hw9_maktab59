package ir.maktab;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.addLast(7);
        list.removeFirst();
        list.removeLast();
        System.out.println(list.indexOf(3));

    }
}
