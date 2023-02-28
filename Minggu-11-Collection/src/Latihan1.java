import java.util.*;

public class Latihan1 {
    public static void main(String[] args) {
        TreeMap< String,Integer> tes=new TreeMap<String,Integer>();
        String tool[] = new String[50];
        int i=0,j=0;
        char ans;
        Scanner inp=new Scanner(System.in);
        do {
            System.out.print("Input :");
            tool[j]=inp.next();
            tes.put(tool[j],i);
            j++;
            System.out.print("Mau input lagi[y/t]:");
            ans=inp.next().charAt(0);
        }while(ans!='t');
        for(j=0;j<tool.length;j++){
            if(tool[j]==null){
                break;
            }
            if(tes.containsKey(tool[j])){
                tes.put(tool[j],tes.get(tool[j]).intValue()+1);
            }else {
                tes.put(tool[j],i+1);
            }


        }
        System.out.println(tes);
        System.out.println("Nilai terendah  :"+ Collections.min(tes.entrySet(),new CompareLat1()));
        System.out.println("Nilai tertinggi :"+ Collections.max(tes.entrySet(),new CompareLat1()));
        System.out.println("key dengan awalan m :"+getByPrefix(tes,"m"));
    }
    private static SortedMap<String, Integer> getByPrefix(NavigableMap<String, Integer> myMap, String prefix ) {
        return myMap.subMap( prefix, prefix + Character.MAX_VALUE );
    }

}
/*       if(tes.containsValue(tool)){
            tes.put(tool,tes.get(tool).intValue()+1);
        }else {
            tes.put(tool,i);
        }*/

/*        for(Map.Entry<String,Integer> kata : tes.entrySet()){

            //System.out.println(kata.getValue()+"="+kata.getKey());
        }*/