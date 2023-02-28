public class Bayaran {
    public int hitungbayaran(Pegawai1 peg){
        int uang = peg.infoGaji();
        if(peg instanceof Manajer1)
            uang+=((Manajer1)peg).infoTunjangan();
        else if(peg instanceof Programmer1)
            uang+=((Programmer1)peg).infoBonus();

        return uang;
    }
    public static void main(String[] args) {
        Manajer1 man =new Manajer1("Agus",800,50);
        Programmer1 pr=new Programmer1("Budi",600,30);
        Bayaran hr =new Bayaran();

        System.out.println("Bayaran untuk Manajer :"+hr.hitungbayaran(man));
        System.out.println("Bayaran untuk Programmer :"+ hr.hitungbayaran(pr));

    }
}
