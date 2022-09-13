package AlgorithmStudy.src.ArrayStudy;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class ArrayStudy {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        double c= 0;
        List<Double> list = Arrays.stream(br.readLine().split(" "))
                .map(Double::valueOf)
                .collect(Collectors.toList());
        double b= Collections.max(list);
        list.replaceAll(i ->i/b*100);
        for(int i=0; i<a; i++) c += list.get(i);
        System.out.println(c/a);
    }
}

 class B10818 {
    public static void main(String[] args) throws Exception {// 메모리 106356
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);
        for(int i=0; i<a; i++) {
            int b = Integer.parseInt(arr[i]);
            if(max<=b) max = b;
            else if (b<=min) min = b;
        }
        bw.write(min+" "+max);
        bw.flush();
    }
     public static void main2(String[] args) throws Exception { //메모리 92092
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         int a = Integer.parseInt(br.readLine());
         StringTokenizer st = new StringTokenizer(br.readLine()," ");
         int[] arr = new int[a];
         for(int i=0; i<a; i++) arr[i] = Integer.parseInt(st.nextToken());
         int max = arr[0];
         int min = arr[0];

         for(int i=0; i<a; i++) {
             if(max<=arr[i]) max = arr[i];
             else if (arr[i]<=min) min = arr[i];
         }
         bw.write(min+" "+max);
         bw.flush();
     }
}
class B2562 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i= 0; i<9; i++) arr.add(Integer.parseInt(br.readLine()));
        System.out.println(Collections.max(arr));
        System.out.println(arr.indexOf(Collections.max(arr))+1);
    }
}
class B3052 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 ;
        for (int i= 0; i<10; i++) arr.add(Integer.parseInt(br.readLine())%42);
        arr2 = (ArrayList<Integer>) arr.stream().distinct().collect(Collectors.toList());
        // 컬렉션을 스트림으로 변환해서 중복 제거하고 다시 리스트에 넣는다.
        System.out.println(arr2.size());
    }
    public static void main2(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<>();
        for (int i= 0; i<10; i++) set.add(Integer.parseInt(br.readLine())%42);
        System.out.println(set.size());
    }
}
class B1546 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        double c= 0;
        List<Double> list = Arrays.stream(br.readLine().split(" "))
                .map(Double::valueOf)
                .collect(Collectors.toList());
        double b= Collections.max(list);
        list.replaceAll(i ->i/b*100);
        for(int i=0; i<a; i++) c += list.get(i);
        System.out.println(c/a);
    }
}