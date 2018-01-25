import java.util.HashSet;

public class RemoveDup {

    public static void Remove(LinkedListNode node) {
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedListNode previous = null;
        while(node != null){
            if(hashSet.contains(node.data)){
                previous.next = node.next;
            }else{
                hashSet.add(node.data);
                previous = node;
            }
            node = node.next;
        }

    }

    public static void main(String []args){
        LinkedListNode head = new LinkedListNode(10);
        head.appendToTail(9);
        head.appendToTail(10);
        head.appendToTail(8);
        head.appendToTail(7);
        head.appendToTail(9);

        System.out.println("Returning kth last value from linked list");
        LastKth kth = new LastKth();
        kth.kthnode(head,3);
        Remove(head);
        while(head!=null){
            System.out.println(head.data);
            head= head.next;
        }
        System.out.println("-----------------------------------------");
        System.out.println("Removing duplicates from linked list");
        Remove(head);
        while(head!=null){
            System.out.println(head.data);
            head= head.next;
        }

    }
}
