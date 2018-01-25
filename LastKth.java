public class LastKth {

    public int kthnode(LinkedListNode node , int k){
        if(node == null)
            return 0;

        int index = kthnode(node.next,k)+1;
        if(index == k){
            System.out.println(k+"th node from last : " + node.data);
        }
        return index;
    }
}
