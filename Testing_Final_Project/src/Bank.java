public class Bank {
    private Account[] akun;
    private int jumlahAkun;
    private int no_Akun;

    public Bank(){
        akun=new Account[10];//menginsialisasikan array batas akun yang ada pada bank
        this.jumlahAkun=0;

    }
    public void tambahAkun(int no_Akun,String namaAwal,String namaAkhir){
        int i=this.jumlahAkun++;
        akun[i] = new Account (no_Akun,namaAwal, namaAkhir);
    }

    public int getJumlahNasabah() {
        return this.jumlahAkun;
    }

    public Account getAkun(int indeks) {
        return this.akun[indeks];
    }
}