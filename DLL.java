//**********************//
//* Name: Evan Higgins *//
//*   ID: 19282508     *//
//**********************//
import java.util.*;
public class DLL {
    private DLLNode head ;  // First node in the list.
    private DLLNode tail ;  // Last node in the list.
    private int nodeCount ; // Number of items currently in the list.

    // Constructor to create an empty list
    public DLL() {
        this.head = this.tail = null ;
        this.nodeCount = 0 ;
    }

    // Constructor to create a list when you know the the first node value
    public DLL(Contact c) {
        this.head = new DLLNode(c);  // (Note : Allocate and Populate using DLLNode constructor)
        this.tail = this.head ;      // First node becomes head and tail 
        nodeCount = 1 ;              // Initialise nodeCount
    }

    // Add the specified Contact at the position specified by index
    public void add(int index, Contact c) {
        DLLNode newNode = new DLLNode(c);
        DLLNode currentNode = head;

        if(index < 0 || index > nodeCount){
            throw new IndexOutOfBoundsException(); // easiest way to scold user 
        }

        if (head == null){
            head = tail = newNode;
        }
        else if(index == 0){
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        }
        else if(index == nodeCount){
            newNode.setPrevious(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
        else{
            for(int i = 1; i < index; i++)
            currentNode = currentNode.getNext();
            newNode.setNext(currentNode.getNext());
            currentNode.setNext(newNode);
            newNode.setPrevious(currentNode);
            DLLNode temp = newNode.getNext();
            temp.setPrevious(newNode);

        }
        nodeCount++;
    }

    // Insert a new item at the front of the list (i.e. BEFORE the current HEAD)
    public void addFirst(Contact c) {
        add(0, c);
    }

    // Insert a new item at the end of the list (i.e. AFTER the current TAIL)
    public void addLast(Contact c) {
        add(nodeCount, c);
    }

    // Check if the list contains the Contact passed as a parameter
    public boolean contains(Contact c) {
        DLLNode currentNode = head;
        for(int i = 1; i <= nodeCount; i++)
            if(currentNode.getContact().equals(c)){
                return true;
            }
            else{
                currentNode = currentNode.getNext();
            }
        return false;
    }

    // Display all the contacts in the list in the Terminal window
    public void display() { // shamelessly ripped out of SLL.java from the Sample Programs
        DLLNode current;
        for(current = head ; current != null ; current = current.getNext()) {
            System.out.println(current.getContact()) ;
        }
    }

    // Search for the Contact with the specified name
    public Contact findByName(String searchName) {
        DLLNode currentNode = head;
        Contact currentContact = currentNode.getContact();
        int compare = searchName.compareTo(currentContact.getContactName());
        for(int i = 1; i <= nodeCount; i++)
            if(compare == 0){
                return currentContact;
            }
            else{
                currentNode = currentNode.getNext();
            }

        return null;
    }

    // Retrieve the item at the specified index position passed as a parameter (if it exists).
    // Index positions start from ZERO.
    public Contact get(int index) {
        if(index < 0 || index > nodeCount){
            throw new IndexOutOfBoundsException(); // easiest way to scold user 
        }
        DLLNode currentNode = head;    
        for(int i = 0; i < index; i++){
            currentNode = currentNode.getNext();
        }
        return currentNode.getContact();
    }

    // Return the number of nodes currently in the list
    public int size() {
        return nodeCount;
    }
}

