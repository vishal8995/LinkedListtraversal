public class LinkedList {

    Node head;

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.push(8);
        list.push(6);
        list.push(4);
        list.push(2);

        list.traverseLinkedList();
    }

    private void traverseLinkedList() {
        Node n = head;
        while(head != null){
            System.out.println(n.data);

            if(n.next != null){
                n = n.next;
            }else break;
        }
    }

    private void push(int new_data) {

        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
}
