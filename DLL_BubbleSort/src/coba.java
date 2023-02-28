public class coba {

    Node head;
    Node tail;

    public void add(String nama, int harga, int stok) {
        Node baru = new Node(nama, harga, stok);
        if (head == null) {
            head =null;
            tail = null;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }

    }

    public void bublesort() {
        Node current = head;
        String tempNama;
        int tempHarga, tempStok;

        if (head == null) {
            head = tail = null;
        } else {
            while (current != null) {
                Node currentNext = current.next;
                while (currentNext != null) {
                    if (current.nama.charAt(0) > currentNext.nama.charAt(0)) {
                        tempNama = current.nama;
                        current.nama = currentNext.nama;
                        currentNext.nama = tempNama;

                        tempHarga = current.harga;
                        current.harga = currentNext.harga;
                        currentNext.harga = tempHarga;

                        tempStok = current.stok;
                        current.stok = currentNext.stok;
                        currentNext.stok = tempStok;
                    }
                    currentNext = currentNext.next;
                }
                current = current.next;
            }

        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println("Nama: " + current.nama + "," + "Harga: " + current.harga + "," + "Stok: " + current.stok);
            current = current.next;
        }
    }
}

