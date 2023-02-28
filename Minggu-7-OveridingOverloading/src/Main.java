public class Main {
    public static void main(String[] args) {


        BangunDatar psg=new Persegi(4);
        System.out.println("Luas Persegi\t\t:"+psg.luas());
        System.out.println("Keliling Persegi\t:"+psg.keliling()+"\n");

        BangunDatar linkalan=new Lingkaran(7);
        System.out.println("Luas Lingkaran\t\t:"+linkalan.luas());
        System.out.println("Keliling Lingkaran\t:"+linkalan.keliling()+"\n");

        BangunDatar sgt=new Segitiga(4,8);
        System.out.println("Luas Segitiga\t\t:"+sgt.luas());
        System.out.println("Keliling Segitiga\t:"+sgt.keliling());

    }
}
