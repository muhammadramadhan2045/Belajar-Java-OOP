package perbankan;

public class Bank {
    public Nasabah[] nasabah;
    public int jumlahNasabah;

    public Bank(){
        nasabah=new Nasabah[4];
        this.jumlahNasabah=0;
    }
    public void tambahNasabah(String namaAwal,String namaAkhir){
        int i=this.jumlahNasabah++;
        nasabah[i] = new Nasabah (namaAwal, namaAkhir);
    }
    public int getJumlahNasabah() {
        return this.jumlahNasabah;
    }

    public Nasabah getNasabah(int indeks) {
        //this.indeks=indeks;
        return this.nasabah[indeks];
    }
}
