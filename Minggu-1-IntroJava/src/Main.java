import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        char[] source1 = main.generateSource();
        String plainText = main.inputText();
        Integer[] keyInt = main.inputKey();
        char[] source2 = main.mapping(keyInt, source1);

        String cipherText = main.encryption(source1, source2, plainText);
        System.out.println("Plaintext: " +plainText);
        System.out.println("Cipher: "+cipherText);
        String ps = main.encryption(source2, source1, cipherText);
        System.out.println("Plaintext: " +ps);
        System.out.println(plainText);
    }

    public Integer[] inputKey(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan key:");
        char[] key = scanner.next().toCharArray();
        Integer[] keyInt = new Integer[key.length];
        for(int i=0;i<key.length;i++) keyInt[i] = (int) key[i];
        return keyInt;
    }
    public String inputText(){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Masukkan plaintext:");
        return myObj.nextLine();
    }

    public String encryption(char[] s0, char[] s1, String p){
        char[] pc = p.toCharArray();
        char[] cc = new char[pc.length];
        for (int i=0;i<pc.length;i++){
            int idx = getIdx(s0,pc[i]);
            cc[i] = s1[idx];
        }
        return chartString(cc);
    }

    public String chartString(char[] c){
        StringBuilder r = new StringBuilder();
        for (char x:c) r.append(x);
        return r.toString();
    }

    public int getIdx(char[] s0, char c){
        int r = -1;
        for (int i = 0;i<s0.length;i++){
            if (s0[i]==c){
                r = i;
                break;
            }
        }
        return r;
    }

    public char[] mapping(Integer[] k, char[] source1){
        int equationAmount, equationSum = 0, shifterLength = 0, temp, temp2 = 1;
        if(k.length%4==0) equationAmount = k.length/4;
        else equationAmount = k.length/4+1;
        Integer[][] equationsVar = new Integer[4][equationAmount];
        for(int i=0;i<equationAmount*4;i++){
            int val, e = i/4;
            if(i>=k.length) val = 1;
            else val = k[i];
            if(i%4==0) equationsVar[0][e] = val;
            else if(i%4==1) equationsVar[1][e] = val;
            else if(i%4==2) equationsVar[2][e] = val;
            else equationsVar[3][e] = val;
        }

        for(int i=0;i<equationAmount;i++) equationSum += equationsVar[0][i]*(Math.pow(equationsVar[3][i], 2)) + equationsVar[1][i]*equationsVar[3][i] + equationsVar[2][i];

        temp = equationSum;
        while(temp !=0){
            temp /= Math.pow(10, temp2);
            shifterLength++;
            temp2++;
        }

        int[] shifters = new int[shifterLength];
        temp = equationSum;
        for(int i=0;i<shifterLength;i++){
            shifters[i] = (int) ((temp%Math.pow(10, i+1)) % source1.length);
            temp /= Math.pow(10, i+1);
        }

        char[] temp3;
        char[][] sources = new char[shifters.length][source1.length];
        for(int i=0; i<shifters.length;i++){
            temp = shifters[i];
            if(i==0) temp3 = source1;
            else temp3 = sources[i-1];
            for (char c : temp3){
                sources[i][temp]= c;
                temp++;
                if (temp == source1.length) temp = 0;
            }
        }

        char[] result = sources[0];
        for(int i=1;i<sources.length;i++){
            for(int j=0;j<source1.length;j++) result[j] = (char) (limiter((int) result[j] + (int) sources[i][j]));
        }
        for(int i=0;i< result.length;i++){
            int resultxEquationSum = (result[i] ^ limiter(equationSum));
            for (char r : result) {
                if (r == resultxEquationSum) resultxEquationSum = limiter(resultxEquationSum + equationSum);
            }
            result[i] = (char) resultxEquationSum;
        }
        return result;
    }

    public char[] generateSource(){
        String s = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-=[]\\;',./{}|:\"<>?`~";
        return s.toCharArray();
    }

    public int limiter(int i){
        return i % (int) Math.pow(2, 16);
    }
}
