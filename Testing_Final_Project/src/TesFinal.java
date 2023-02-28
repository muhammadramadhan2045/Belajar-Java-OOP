import java.util.Scanner;

public class TesFinal {
    public String LihatInfo(Tabungan tb){
        String kalimat;
        if(tb instanceof Uang)
            kalimat=((Uang)tb).info();
        else
            kalimat = tb.info();

        return kalimat;
    }
    public static void main(String[] args) {
        int n; //ini untuk bagian indeks akun pada saat login
        int select; //untuk masukan pilihan menu
        String jawab1;//untuk menjawab pertanyaan pada do while outer&
        int t,uangTransfer;//var t untuk tempat menampung hasil inputan dari id acocount  yang akan menerima hasil transfer || var uangTranfer untuk menampung nominal uang yang ditranfer ke akun lain.
        int duit;

        Tabungan tabung=new Tabungan();
        Uang u=new Uang();
        TesFinal tf=new TesFinal();
        System.out.println("Note\t:"+tf.LihatInfo(u));

        Scanner inp=new Scanner(System.in);


        //Langkah pertama buat 2 nasabah
        Bank bank=new Bank();
        bank.tambahAkun(1,"Muhammad","Ramadhan");//akun nasabah biasa
        //bank.getAkun(0).setTabungan(new Tabungan(5000));
        bank.getAkun(0).setThisMoney(new Uang(5000));

        bank.tambahAkun(2,"Dzulkifli","Hasans");//akun nasabah biasa
        //bank.getAkun(1).setTabungan(new Tabungan(7000));
        bank.getAkun(1).setThisMoney(new Uang(7000,1000));

        bank.tambahAkun(3,"Universitas","Teknologi");//untuk pembayaran pendidikan
        //bank.getAkun(2).setTabungan(new Tabungan(0));
        bank.getAkun(2).setThisMoney(new Uang(0));

        bank.tambahAkun(4,"PLN","NTB");//untuk pembayaran token listrik
       // bank.getAkun(3).setTabungan(new Tabungan(0));
        bank.getAkun(3).setThisMoney(new Uang(0));

        bank.tambahAkun(5,"PT","Telkom");//untuk pembayaran wifi
        //bank.getAkun(4).setTabungan(new Tabungan(0));
        bank.getAkun(4).setThisMoney(new Uang(0));

        bank.tambahAkun(6,"PDAM","NTB");//untuk pembayaran air pdam
        //bank.getAkun(5).setTabungan(new Tabungan(0));
        bank.getAkun(5).setThisMoney(new Uang(0));
        String nama;
        do{
            //Login menggunakan id;
            System.out.print("Masukan ID Account Bank :");
            n=inp.nextInt();
            System.out.print("Masukan Nama Awal ID ACCOUNT :");
            nama=inp.next();
            if(bank.getAkun(n-1).getNamaAwal().equals(nama)){
                do {
                    //pilihan pada bank
                    System.out.println("\n1.Menabung Uang\n2.Menarik Uang\n3.Cek Tabungan\n4.Transfer Uang\n5.Pembayaran\n6.Exit");
                    System.out.print("Pilihan :");
                    select=inp.nextInt();
                    //kondisionalnya
                    if(select==1){
                        System.out.print("Nominal\t:");
                        duit=inp.nextInt();
                        bank.getAkun(n-1).getThisMoney().simpanUang(duit);
                    }
                    else if(select==2){
                        System.out.print("Nominal\t:");
                        duit=inp.nextInt();
                        bank.getAkun(n-1).getThisMoney().ambilUang(duit);
                    }
                    else if(select==3){
                        System.out.println("Nasabah dengan id :" +(n) +" : "
                                +bank.getAkun(n-1).getNamaAwal()+" "+bank.getAkun(n-1).getNamaAkhir()+" ; Saldo = "+bank.getAkun(n-1).getThisMoney().getSaldo());

                    }
                    else if(select==4){
                        System.out.print("Transfer pada ID Account\t:");
                        t= inp.nextInt();
                        System.out.print("Nominal\t:");
                        uangTransfer=inp.nextInt();
                        bank.getAkun(n-1).getThisMoney().ambilUang(uangTransfer);
                        bank.getAkun(t-1).getThisMoney().simpanUang(bank.getAkun(n-1).getThisMoney().getTranfer());
                    }
                    else if(select==5){
                        System.out.println("\nPilih pembayaran :");
                        System.out.println("1.PDAM/PAM");
                        System.out.println("2.Pendidikan");
                        System.out.println("3.Token Listrik");
                        System.out.println("4.Telkom/Indihome");
                        System.out.print("Pilih :");
                        select=inp.nextInt();
                        if (select==1) {
                            System.out.println("Transfer pada Account\t:" + bank.getAkun(5).getNamaAwal()+" "+bank.getAkun(5).getNamaAkhir());
                            System.out.print("Nominal\t:");
                            uangTransfer = inp.nextInt();
                            bank.getAkun(n - 1).getThisMoney().ambilUang(uangTransfer);
                            bank.getAkun(5).getThisMoney().simpanUang(bank.getAkun(n - 1).getThisMoney().getTranfer());
                        }else if(select==2){
                            System.out.println("Transfer pada Account\t:" + bank.getAkun(2).getNamaAwal());
                            System.out.print("Nominal\t:");
                            uangTransfer = inp.nextInt();
                            bank.getAkun(n - 1).getThisMoney().ambilUang(uangTransfer);
                            bank.getAkun(2).getThisMoney().simpanUang(bank.getAkun(n - 1).getThisMoney().getTranfer());
                        }else if (select==3){
                            System.out.println("Transfer pada Account\t:" + bank.getAkun(3).getNamaAwal());
                            System.out.print("Nominal\t:");
                            uangTransfer = inp.nextInt();
                            bank.getAkun(n - 1).getThisMoney().ambilUang(uangTransfer);
                            bank.getAkun(3).getThisMoney().simpanUang(bank.getAkun(n - 1).getThisMoney().getTranfer());
                        }else if (select==4){
                            System.out.println("Transfer pada ID Account\t:" + bank.getAkun(4).getNamaAwal());
                            System.out.print("Nominal\t:");
                            uangTransfer = inp.nextInt();
                            bank.getAkun(n - 1).getThisMoney().ambilUang(uangTransfer);
                            bank.getAkun(4).getThisMoney().simpanUang(bank.getAkun(n - 1).getThisMoney().getTranfer());
                        }else
                            break;
                    }

                }while(select!=6);

            }
            else
                System.out.println("Gagal masuk, silahkan login ulang");
            System.out.print("\nApakah Anda ingin Login lagi? [y/t] ");
            jawab1=inp.next();
        }while(jawab1.charAt(0)!='t');

        System.out.println("Note\t:"+tf.LihatInfo(tabung));
    }

}
