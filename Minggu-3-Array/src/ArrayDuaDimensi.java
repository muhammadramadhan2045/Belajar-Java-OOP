public class ArrayDuaDimensi {
    public static void main(String[] args) {
        int[][] dua = { { 32, 87, 3, 589 }, { 12, 1076, 2000, 8 },
                                { 622, 127, 77, 955 }};
        for(int i=0;i< dua.length;i++){
            for(int j=0;j< dua[0].length;j++){
                System.out.println("["+i+"]"+"["+j+"]= "+dua[i][j]);
            }//System.out.println("");
        }
    }
}
