public class EvenNumber {
    public static void main(String[] args) {
        int i;
        for(i=2;i<=20;i++)
            if(i%6==0) continue;
            else
                if(i%2==0)
                System.out.print(i+" ");
    }
}
