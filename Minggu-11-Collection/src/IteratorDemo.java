import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        // create an array list
        ArrayList al=new ArrayList();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        // use iterator to display contents of al
        System.out.println("Original contentss of al : "+al);
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            Object element=itr.next();
            System.out.print(element+"");
        }

        // modify objects being iterated
        ListIterator litr=al.listIterator();
        while(litr.hasNext()){
            Object element=litr.next();
            litr.set(element+"+");
        }
        System.out.print("Modified contents of al : ");
        itr=al.iterator();
        while (itr.hasNext()){
            Object element=itr.next();
            System.out.print(element+"");
        }
        System.out.print( "");
        // now, display the list backwards
        System.out.print("Modified list backwards: ");

        while(litr.hasPrevious()){
            Object element=litr.previous();
            System.out.print(element+"");
        }
    }
}
