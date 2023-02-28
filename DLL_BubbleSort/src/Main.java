class Main {
    public static void main(String[] args) {
        coba cek = new coba();

        System.out.println("=========================================");
        System.out.println("\t Daftar Barang\t");
        System.out.println("=========================================");

        DoubleLinkedList theList = new DoubleLinkedList();
        Node start= new Node("Indomie Soto", 3000, 12);
        theList.insertFirst("Indomie Soto", 3000, 12);
        theList.insertFirst("Mizon", 6000, 30);
        theList.insertFirst("Indomie Goreng", 3500, 8);
//        theList.displayForward();
        theList.displayBackward();


//        theList.print();

    }
}
