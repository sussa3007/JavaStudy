package ForStudy;

import java.io.*;
import java.util.*;

public class AlgoFor {
    public static void main(String[] args) throws Exception {

    }
}

class B2739 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a,b;
        a = Integer.parseInt(br.readLine());
        for(int i=1; i<10; i++){
            b= a * i;
            System.out.printf("%d * %d = %d%n",a,i,b);
        }
    }
}
class B10950 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[Integer.parseInt(br.readLine())];
        for(int i=0; i<arr.length; i++){
            int a = Integer.parseInt(br.readLine().replaceAll(" ",""));
            arr[i] = (a/10)+(a%10);
        }
        for (int j : arr) System.out.println(j);
    }
}
 class B8393 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b = 0;
        a = Integer.parseInt(br.readLine());
        for (int i = 1; i <= a; i++) b += i;
        System.out.println(b);
    }
}
class B25304 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int all = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = 0;
        for(int i=0; i<a; i++){
            String[] arr = br.readLine().split(" ");
            b += (Integer.parseInt(arr[0])*Integer.parseInt(arr[1]));
        }
        if(b == all) System.out.println("Yes");
        else System.out.println("No");
    }
}
 class B15552 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        for(int i=0; i<a; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
        }
        bw.flush();
    }
}