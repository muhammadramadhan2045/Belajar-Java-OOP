public class TesKalender {
    public static String getTime(Kalender kal) {
        String tmp;
        tmp=kal.getTanggal() + "-"+
                kal.getBulan()+ "-"+
                kal.getTahun();
        return tmp;
    }

    public static void main(String[] args) {
        Kalender kal=new Kalender(8);
        System.out.println("Waktu awal\t: "+getTime(kal));
        kal.setTanggal(9);
        System.out.println("1 hari setelahwaktu awal\t: "+getTime(kal));
        kal=new Kalender(6,2003);
        System.out.println("Waktu berubah\t: "+getTime(kal));
        kal.setBulan(7);
        System.out.println("1 bulan setelah itu\t: "+getTime(kal));
        kal=new Kalender(20,10,2004);
        System.out.println("Waktu berubah\t: "+getTime(kal));
        kal.setTahun(2005);
        System.out.println("1 tahun setelah itu\t: "+getTime(kal));
    }
}
