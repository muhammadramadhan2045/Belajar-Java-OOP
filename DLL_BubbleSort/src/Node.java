public class Node {
    String nama;
    int harga;
    int stok;
    Node next;
    Node prev;

    public Node(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampil(){
        System.out.println("Nama: " + this.nama + "," + "Harga: " + this.harga + "," + "Stok: " + this.stok);
    }


}