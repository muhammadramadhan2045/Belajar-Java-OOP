public class TesMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs=new Mahasiswa(123,"Rama");
        System.out.println("NRP\t\t: "+mhs.getNrp());
        System.out.println("Nama\t: "+mhs.getNama());
        mhs.setNrp(321);
        mhs.setNama("Tukul");
        System.out.println("Terjadi Set ");
        System.out.println("New NRP\t\t: "+mhs.getNrp());
        System.out.println("New Nama\t: "+mhs.getNama());

    }
}
