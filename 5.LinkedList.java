public class LinkedList {


	class Node{  
        int data;  
        Node next;
        
          
        public Node(int data) {  
            this.data = data;  
            this.next = null;
            
        }  
        
    }  

    Node head=null;

    // Method to add a node to the linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void bubbleSort() {
    	Node current = head, index = null;  
        int temp;  
          
        if(head == null) {  
            return;  
        }  
        else {  
            while(current != null) {  
                //Node index will point to node next to current  
                index = current.next;  
                  
                while(index != null) {   
                    if(current.data > index.data) {  
                        temp = current.data;  
                        current.data = index.data;  
                        index.data = temp;  
                    }  
                    index = index.next;  
                }  
                current = current.next;  
            }      
        }
    }
    
    
    

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    
    public static LinkedList mergeAndSort(LinkedList list1, LinkedList list2) {
        LinkedList mergedList = new LinkedList();
        Node current1 = list1.head;
        Node current2 = list2.head;

        while (current1 != null && current2 != null) {
            if (current1.data < current2.data) {
                mergedList.add(current1.data);
                current1 = current1.next;
            } else {
                mergedList.add(current2.data);
                current2 = current2.next;
            }
        }

        while (current1 != null) {
            mergedList.add(current1.data);
            current1 = current1.next;
        }

        while (current2 != null) {
            mergedList.add(current2.data);
            current2 = current2.next;
        }

        return mergedList;
    }

    public static void main(String[] args) {
    	//Sample input: Linked-List-1:- 25->35->12->4->36->48

    	//Linked-List-2:- 8->32->22->45->63->49

    	//Output:- 4->8->12->22->25->32->35->36->45->48->49->63
        LinkedList list1 = new LinkedList();
        list1.add(25);
        list1.add(35);
        list1.add(12);
        list1.add(4);
        list1.add(36);
        list1.add(48);

        System.out.println("First Linked List:");
        list1.display();
        list1.bubbleSort();
        //list1.display();

        LinkedList list2 = new LinkedList();
        list2.add(8);
        list2.add(32);
        list2.add(22);
        list2.add(45);
        list2.add(63);
        list2.add(49);

        System.out.println("Second Linked List:");
        list2.display();
        list2.bubbleSort();
        //list2.display();
       

        LinkedList mergedAndSorted = mergeAndSort(list1, list2);

        System.out.println("Merged and Sorted Linked List:");
        mergedAndSorted.display();
    }
}
