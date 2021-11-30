
public class ReverseLinkedList {

    private static class ListNode{
        int value;
        ListNode next;
        ListNode(){}
        ListNode(int value){ this.value=value; }
        ListNode(int value, ListNode tail){ this.value=value; tail.next=this; this.next=null;}
    }
    public static void main(String[] args){
      ListNode head= fillLinkedList();
      traverse(head);
      head=reverse(head);
      System.out.println();
      traverse(head);

    }

    public static ListNode fillLinkedList(){
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2,node1);
        ListNode node3=new ListNode(3,node2);
        ListNode node4=new ListNode(4,node3);
        ListNode node5=new ListNode(5,node4);
        ListNode node6=new ListNode(6,node5);
        ListNode node7=new ListNode(7,node6);
        ListNode node8=new ListNode(8,node7);

        return node1;

    }


    public static void traverse(ListNode head){
        while(head!=null){
            System.out.print(head.value + " ");
            head=head.next;
        }
    }

    public static ListNode reverse(ListNode head){
        ListNode current=head;
        ListNode prev=null;
        while(current!=null){
            ListNode nextNode=current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
        }
        return prev;
    }

}