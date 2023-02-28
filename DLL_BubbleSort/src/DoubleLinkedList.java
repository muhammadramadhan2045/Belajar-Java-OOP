public class DoubleLinkedList {
    Node first;
    Node last;

    //kontruktor
    //set nilai awal adalah null
    public DoubleLinkedList() {
        first = null;
        last = null;
    }

    //mengecek apakah linked list kosong atau tidak
    public boolean isEmpty(){
        return (first==null);
    }

    //method untuk menginsert data dari pertama
    public void insertFirst(String nama, int harga, int stok){
        Node node = new Node(nama,harga,stok);
        if(isEmpty()){
            last = node;
        }else{
            first.prev = node;
        }

        node.next = first;
        first = node;
    }


    //menampilkan data dari pertama - terakhir
    public void displayForward(){
        System.out.print("List (first-->last): ");
        Node current = first;

        while(current != null){
            current.tampil();
            current = current.next;
        }
        System.out.println("");
    }

    //sortList() will sort the given list in ascending order
    public void sortList() {
        Node current = null, index = null;
        String temp;
        //Check whether list is empty
        if(first == null) {
            return;
        }
        else {
            //Current will point to head
            for(current = first; current.next != null; current = current.next) {
                //Index will point to node next to current
                for(index = current.next; index != null; index = index.next) {
                    //If current's data is greater than index's data, swap the data of current and index
                    if(current.nama.compareTo(index.nama) <0 ) {
                        temp = current.nama;
                        current.nama = index.nama;
                        index.nama = temp;
                    }
                }
            }
        }
    }

    public Node bubbleSort(Node start)
    {
        int swapped, i;
        Node ptr1;
        Node lptr = null;

        // Checking for empty list
        if (start == null)
            return null;

        do
        {
            swapped = 0;
            ptr1 = start;

            while (ptr1.next != lptr)
            {

                if (ptr1.nama.compareTo(ptr1.next.nama)<0 )
                {
                    String t = ptr1.nama;
                    ptr1.nama = ptr1.next.nama;
                    ptr1.next.nama = t;
                    swapped = 1;
                }
                ptr1 = ptr1.next;
            }
            lptr = ptr1;
        }
        while (swapped != 0);
        return start;
    }


    //menampilkan data dari terakhir - pertama
    public void displayBackward(){

        Node current = last;
        while(current != null){
            current.tampil();

            current = current.prev;
        }
        System.out.println("");
    }
}