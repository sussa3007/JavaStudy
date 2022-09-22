package AlgorithmStudy.src.RecursiveFuntion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursiveFuntion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine().trim());


    }
    public static int func(String st ,int l,int r){
        if(l>=r) return 1;
        else if (st.charAt(l)!=st.charAt(r)) return 0;
        else ; return func(st,l+1,r-1);
    }
}

class B10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine().trim());
        System.out.println(fact(input));
    }
    public static int fact(int input){
        if(input == 1||input==0) return 1;
        else return input*fact(input-1);
    }
}
 class B10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine().trim());
        System.out.println(fact(input));
    }
    public static int fact(int input){
        if (input == 0) return 0;
        else if(input ==1) return 1;
        else return fact(input-1)+fact(input-2);
    }
}
class B25501 {
    private static int x = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine().trim());
        String st = "";
        for(int i=1; i<=input; i++){
            st= br.readLine();
            x=1;
            System.out.print(func(st, 0,st.length()-1)+" "+x+'\n');
        }

    }
    public static int func(String st ,int l,int r){
        if(l>=r) return 1;
        else if (st.charAt(l)!=st.charAt(r)) return 0;
        else x++; return func(st,l+1,r-1);
    }
}