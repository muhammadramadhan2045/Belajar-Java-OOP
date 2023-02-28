/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */




import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class EightPuzzleBFS {

    String asal, tujuan;
    Queue<List> openQueue = new LinkedList<List>();
    Map<String, Integer> map = new HashMap<String, Integer>(); // HashMap is used to ignore repeated nodes

    List temp = new LinkedList<String>();

    public EightPuzzleBFS(String asal, String tujuan) {
        this.asal = asal;
        this.tujuan = tujuan;
    }

    void up(List node) {
        String str = (String) node.get(0);
        int a = str.indexOf("0");
        if (a > 2) {
            String s = str.substring(0, a - 3) + "0" + str.substring(a - 2, a) + str.charAt(a - 3) + str.substring(a + 1);
            //System.out.print("(" + (map.get(str) + 1)+","+b+")");
            //System.out.print(map.get(str) + 1);
            //System.out.println(" up " + s);
            Integer level =  (Integer) node.get(2)+1;

            addQueue(s,"up",level);
        }
        //else
        //System.out.println("(" + (map.get(str) + 1)+","+b+") up tidak ada");
    }

    void down(List node) {
        String str = (String) node.get(0);
        int a = str.indexOf("0");
        if (a < 6) {
            String s = str.substring(0, a) + str.substring(a + 3, a + 4) + str.substring(a + 1, a + 3) + "0" + str.substring(a + 4);
            //System.out.print("(" + (map.get(str) + 1)+","+b+")");
            //System.out.print(map.get(str) + 1);
            //System.out.println(" down " + s);

            Integer level =  (Integer) node.get(2)+1;
            addQueue(s,"down",level);

        }
        //else
        //System.out.println("(" + (map.get(str) + 1)+","+b+") down tidak ada");
    }

    void left(List node) {
        String str = (String) node.get(0);
        int a = str.indexOf("0");
        if (a != 0 && a != 3 && a != 6) {
            String s = str.substring(0, a - 1) + "0" + str.charAt(a - 1) + str.substring(a + 1);
            //System.out.print("(" + (map.get(str) + 1)+","+b+")");
            //System.out.print(map.get(str) + 1);
            //System.out.println(" left " + s);

            Integer level =  (Integer) node.get(2)+1;
            addQueue(s,"left",level);
        }
        //else
        //System.out.println("(" + (map.get(str) + 1)+","+b+") left tidak ada");
    }

    void right(List node) {
        String str = (String) node.get(0);
        int a = str.indexOf("0");
        if (a != 2 && a != 5 && a != 8) {
            String s = str.substring(0, a) + str.charAt(a + 1) + "0" + str.substring(a + 2);
            // System.out.print("(" + (map.get(str) + 1)+","+b+")");
            //System.out.print(map.get(str) + 1);
            //System.out.println(" right " + s);

            Integer level =  (Integer) node.get(2)+1;
            addQueue(s,"right",level);

        }
        //else
        //System.out.println("(" + (map.get(str) + 1)+","+b+") right tidak ada");
    }
    public void bfs() // breadth-first search
    {

        //untuk menambahkan node awal
        addQueue(asal,"", 0);
        //untuk mengecek apakah queue tidak empty

        while (openQueue.peek() != null) {

            List X = openQueue.remove();
            System.out.println(X.get(2) + " " + X.get(1)+" " + X.get(0));
            if (X.get(0).equals(tujuan)) {
                System.out.println("Solution Exists at Level " + X.get(2) + " of the tree");
                break ;
            }
            else{

                // generate children X
                up(X);		// Move the blank space up and add new state to queue
                down(X);		// Move the blank space down
                left(X);		// Move left
                right(X);            // Move right and remove the current node from Queue
            }
        }
    }

    //menambahkan string baru ke queue dan map
    //untuk map dilakukan pengecekan terlebih dahulu
    //Add method to add the new string to the Map and Queue
    void addQueue(String str, String operator, int level) {
        if (!map.containsKey(str)) {
            map.put(str, level);
            //openQueue.add(str);
            temp = new LinkedList<String>();
            temp.add(str);
            temp.add(operator);
            temp.add(level);
            openQueue.add(temp);
        }
    }

    public static void main(String[] args) {
        //EightPuzzleBFS_DFSKu eight = new EightPuzzleBFS_DFSKu("120453786","123456780");
        //EightPuzzleBFS_DFSKu eight = new EightPuzzleBFS_DFSKu("123458670","120453678"); //OK
        EightPuzzleBFS eight = new EightPuzzleBFS("432105786","123456780"); //OK
        eight.bfs();
    }
}
