import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedLL{

    private static class ListNode{
        int value;
        ListNode next;
        ListNode(){}
        ListNode(int value){ this.value=value; }
        ListNode(int value, ListNode tail){ this.value=value; tail.next=this; this.next=null;}
    }

    public static void main(String[] args){

        ListNode list1=fillLinkedList(Arrays.asList(2,4,7));
        ListNode list2=fillLinkedList(Arrays.asList(1,3,5,8,9));


    }

    public static ListNode fillLinkedList(List<Integer> listArr){

        ListNode dummy=new ListNode(-1);
        ListNode current=dummy;
        for(int i:listArr) {
            ListNode temp=new ListNode(i);
            current.next=temp;
            current=current.next;
        }
        return dummy.next;

    }

    public static ListNode fillLinkedList1(){
        ListNode dummy=new ListNode(-1);
        ListNode current=dummy;
        for(int i:Arrays.asList(2,4,7)) {
            ListNode temp=new ListNode(i);
            current.next=temp;
            current=current.next;
        }
        return dummy.next;
    }

    public static ListNode fillLinkedList2(){
        ListNode dummy=new ListNode(-1);
        ListNode current=dummy;
        for(int i:Arrays.asList(1,3,5,8,9)) {
            ListNode temp=new ListNode(i);
            current.next=temp;
            current=current.next;
        }
        return dummy.next;
    }

    public static void traverse(ListNode head){
        while(head!=null){
            System.out.print(head.value + " ");
            head=head.next;
        }
    }

}