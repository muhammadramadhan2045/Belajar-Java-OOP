public class Tes {
    public static void main(String[] args) {
        Pegawai emp =new Pegawai(123);
        System.out.println(emp.nip);
        System.out.println(emp.nama);
        emp =new Pegawai(345,"Rama");
        System.out.println(emp.nip);
        System.out.println(emp.nama);
    }
}
