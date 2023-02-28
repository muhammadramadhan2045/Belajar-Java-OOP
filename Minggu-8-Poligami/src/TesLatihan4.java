public class TesLatihan4 {
   public String UbahStringId(Pegawai peg){
       String s=String.valueOf(peg.id);
        return s;
   }
    public static void main(String[] args) {
        Manajer man =new Manajer();
        Kurir kr=new Kurir();
        TesLatihan4 tes=new TesLatihan4();

        System.out.println("id(string) untuk Manajer :"+tes.UbahStringId(man));
        System.out.println("id(string) untuk kurir :"+ tes.UbahStringId(kr));
    }
}
