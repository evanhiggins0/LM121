# LM121
This assignment provided completed "Contact.java" and "DLLNode.java" files and required me to create and test the following methods:

    

void add​(int index, Contact c)

Inserts the Contact at the specified position in this list. If the index is out of range (i.e. index < 0 || index > size()) the method should do nothing.

 

void addFirst​(Contact c)

Inserts the Contact at the beginning of this list.

 

void addLast​(Contact c)

Adds the Contact to the end of this list.

 

boolean contains​(Contact c)

Uses the compareTo method in the Contact class to compare each contact in the list with the contact passed in the parameter. Returns true if this list contains the specified contact. Returns false otherwise.

 

void display()

Uses the toString method in the Contact class to display the contact details of each entry in the list.

 

Contact findByName​(java.lang.String searchName)

Searches the contact list for an entry that has exactly the same name as the parameter value. Returns null if there is no entry in the list with the name.

 

Contact get​(int index)

Returns the element at the specified position in this list. If the index is out of range (i.e. index < 0 || index > size()) the method should return null.

 

int size()

Returns the number of elements in this list.

The methods are completed in DLL.java and tested in DLLDriver.java
