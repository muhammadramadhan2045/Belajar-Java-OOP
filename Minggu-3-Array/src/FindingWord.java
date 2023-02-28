public class FindingWord {
    public static void main(String[] args) {
        char [] matKul = {'p','e','m','r','o','g','r','a','m','a','n','b','e','r','b','a','s','i','s','o','b','y','e','k'};
        int count=0;
        for(int i=0;i< matKul.length;i++){
            if(matKul[i]=='a')
                count ++;
        }
        System.out.println("Jumlah huruf a didalam array tersebut adalah : "+count);
    }
}
