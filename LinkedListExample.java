package LinkedListExample;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main (String [] args) {
        LinkedList<String> list = new LinkedList<String> ();

        list.add ("iPhone 15 Pro Max");
        list.add ("PlayStation 5");
        list.add ("iPad Pro M2");
        list.add ("MacBook Pro M2 Max");

        System.out.println ("My Dream Gadgets: " + list);
        
        Iterator<String> DreamGadgets = list.iterator();
        while(DreamGadgets.hasNext()) {
        	System.out.println(DreamGadgets.next());
        }
    }
}