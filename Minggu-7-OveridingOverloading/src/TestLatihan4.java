public class TestLatihan4 {
    public static void main(String[] args) {
        System.out.println("Memasukkan identitas dosen 1 : Agus");
        Dosen dosen1=new Dosen("Agus");

        System.out.println("Memasukkan identitas dosen 2 : Budi, NIP. 1458");
        Dosen dosen2=new Dosen("Budi",1458);

        System.out.println("Memasukkan identitas dosen 2 : Iwan, NIP. 1215, umur 47");
        Dosen dosen3=new Dosen("Iwan",1215,47);

        System.out.println();
        dosen1.info();
        System.out.println();
        dosen2.info();
        System.out.println();
        dosen3.info();

    }
}
