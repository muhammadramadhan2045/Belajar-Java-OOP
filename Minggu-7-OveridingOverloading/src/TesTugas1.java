public class TesTugas1 {
    public static void main(String[] args) {
        RataNilai rn=new RataNilai();
        System.out.println("Rata rata nilai 21 dan 13 adalah\t: "+rn.average(21,13));
        System.out.println("Rata rata nilai 19.3 dan 39.5 adalah\t: "+rn.average(19.3,39.5));
        System.out.println("Rata rata nilai 123, 567, dan 744 adalah\t: "+rn.average(123,567,744));
    }
}
