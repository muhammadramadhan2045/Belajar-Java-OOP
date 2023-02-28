import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Bernadine");
        list.add("Elizabeth");
        list.add("Gene");
        list.add("Elizabeth");
        list.add("Clara");

        System.out.println(list);

        System.out.println("2 : "+list.get(2));
        System.out.println("0 : "+list.get(0));

        Queue queue=new LinkedList();
        queue.add("Bernadine");
        queue.add("Elizabeth");
        queue.add("Gene");
        queue.add("Elizabeth");
        queue.add("Clara");

        System.out.println(queue);
        queue.remove();
        queue.remove();
        System.out.println(queue);

    }
}
