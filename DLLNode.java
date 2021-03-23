//****************************
//DLLNode.java
//****************************

public class DLLNode {
    private DLLNode previous ;         // Link to previous node in the list.
    private Contact contact ;          // Value stored in this node.
    private DLLNode next ;             // Link to next node in the list.

    // Constructor 
    public DLLNode(Contact contact) {
        this.contact = contact;            // Store the item.
        this.next = this.previous = null;  // Initial state for links (i.e NOT connected to anything) 
    }

    // Connect this node into a structure by altering the 'next' reference
    public void setNext(DLLNode link) {
        this.next = link ;        
    }

    // Connect this node into a structure by altering the 'previous' reference
    public void setPrevious(DLLNode link) {
        this.previous = link ;        
    }

    // return the 'next' link reference in this node
    public DLLNode getNext() {
        return this.next;
    }

    // return the 'previous' link reference in this node
    public DLLNode getPrevious() {
        return this.previous;
    }

    // return the value in this node
    public Contact getContact() {
        return this.contact ;
    }

    // set the 'value' in this node
    public void setContact(Contact contact) {
        this.contact = contact ;
    }
}