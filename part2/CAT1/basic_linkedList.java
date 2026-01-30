import java.util.*;

public class test {
   public static void main(String[] args){
        Scanner cin =new Scanner(System.in);
        int n = cin.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0 ;i < n ; i++){
            arr[i] = cin.nextInt();
        }


        Node head = array_to_linkedList(arr);
        printer(head);

   }


   static Node array_to_linkedList(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1 ; i < arr.length ; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = mover.next;
        }

        return head;
   }

   static void printer(Node head){  
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println();
   }


}


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
