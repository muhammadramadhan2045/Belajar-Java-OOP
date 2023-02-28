public class TesTugas2 {
    public static void main(String[] args) {
        int i=0;
         Katak katak=new Katak("Froggy",5);
        System.out.println("Objek\tumur\tNama\t\tpEkor\tcarabergerak");
        i+=1;
        System.out.println("O"+(i) +"\t\t"+katak.getUmur()+"\t\t"+katak.getNama()+"\t\t\t\t"+katak.caraBergerak());

        Kecebong kece=new Kecebong(2,"Junior Frog",10);
        i+=1;
        System.out.println("O"+(i) +"\t\t"+kece.getUmur()+"\t"+kece.getNama()+"\t\t"+ kece.panjangEkor+"\t"+kece.caraBergerak());


    }
}
