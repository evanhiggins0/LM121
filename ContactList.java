// Evan Higgins
// 19282508
import java.util.Arrays;
import java.util.Comparator;
public class ContactList {
    
    public Contact[] contList;
    public int used;

    public ContactList(){
        contList = new Contact[150];
        used = 0;
        // contactList.ensureCapacity[base];
    }
    
    
    public ContactList(int capacity){
        contList = new Contact[capacity];
        used = 0;
        //Contact[] contacts = new Contact[capacity];
        //contactList.ensureCapacity[capacity];

    }

    public boolean add(Contact aContact){
        if(used < contList.length){
            this.contList[used] = aContact;
            this.used++;
            return true;
        }else{
            return false;
        }
    }
    // took the nameFor/numberFor overloaded methods from the sample code, since mine relied on two "compare" methods.
    public String nameFor(String number){
        return nameFor(number, 0);
    }

    public String numberFor(String name){
        return numberFor(name, 0);
    }

    public String nameFor(String number, int startPos) {
        int i = 0;
        if(startPos >= 0) {
            for(i = startPos; i < used; i++) {
                if(contList[i].getPhoneNumber().compareTo(number) == 0) {
                    return contList[i].getContactName();
                }
            }
        }
        return "";
    }

    public String numberFor(String name, int startPos) {
        int i = 0;
        if(startPos >= 0) {
            for(i = startPos; i < used; i++) {
                if(contList[i].getContactName().indexOf(name) != -1) {
                    return contList[i].getPhoneNumber();
                }
            }
        }
        return "";
    }

    public void Display(){
        if(used == 0) {
            System.out.println("");

        }else{
            for(int i=0; i < used; i++){
                System.out.println("Contact " + (i + 1) + " of " + used + "\n");
                System.out.println(contList[i]);}

        }

    }

    // searches for the name, returns the location if found
    public int indexOf(String name){
        for(int i = 0; i < used; i++){
            if(contList[i].getContactName().compareTo(name) == 0) {
                return i;
            }
        }
        // if not found, returns -1 (and relief that it works correctly)
        return -1;
    }

    // overloaded remove method for search by name
    public boolean remove(String name){
        return remove(name,-1);
    }
    // overloaded remove method for search by position
    public boolean remove(int position){
        return remove("",position);
    }
    // remove method
    public boolean remove(String name, int position){
        int index;
        if(position >= 0){
            index = position;
        }else{
            index = indexOf(name);}
        if(index != -1){
            for (int i = index; i < used - 1; i++){
                contList[i] = contList[i + 1];

            }
            used = used - 1;
            return true;
        }
        return false;
    }
}

