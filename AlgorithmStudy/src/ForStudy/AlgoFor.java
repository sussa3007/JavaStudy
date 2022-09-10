package ForStudy;

import java.io.*;
import java.util.*;

public class AlgoFor {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int t = ((a % 10) * 10) + (((a % 10) + (a / 10)) % 10);
        int count = 1;
        while (true) {
            if (a == t) break;
            else t = ((t % 10) * 10) + (((t % 10) + (t / 10)) % 10);
            count++;
        }
        System.out.println(count);
    }
}

class B10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while ((str = br.readLine()) != null) {
            int a = str.charAt(0) - 48;
            int b = str.charAt(2) - 48;

            sb.append((a + b) + "\n");
        }

        System.out.print(sb);
    }
}

class B2739 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b;
        a = Integer.parseInt(br.readLine());
        for (int i = 1; i < 10; i++) {
            b = a * i;
            System.out.printf("%d * %d = %d%n", a, i, b);
        }
    }
}

class B10950 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[Integer.parseInt(br.readLine())];
        for (int i = 0; i < arr.length; i++) {
            int a = Integer.parseInt(br.readLine().replaceAll(" ", ""));
            arr[i] = (a / 10) + (a % 10);
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
        for (int i = 0; i < a; i++) {
            String[] arr = br.readLine().split(" ");
            b += (Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]));
        }
        if (b == all) System.out.println("Yes");
        else System.out.println("No");
    }
}

class B15552 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        bw.flush();
    }
}

class B11022 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            bw.write("Case #" + (i + 1) + ": " + b + " + " + c + " = " + (b + c + "\n"));
        }
        bw.flush();
    }
}

class B2439 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            bw.write(" ".repeat(a - (i + 1)) + "*".repeat(i + 1) + '\n');
        }
        bw.flush();
    }
}

class B10871 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] < x) {
                bw.write(arr[i] + " ");
            }
        }
        bw.flush();
    }
}

class B10952 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            if (n == 0 && x == 0) {
                break;
            } else bw.write((n + x) + "\n");
        }
        bw.flush();
    }
}

class B1110B {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int t = ((a % 10) * 10) + (((a % 10) + (a / 10)) % 10);
        int count = 1;
        while (true) {
            if (a == t) break;
            else t = ((t % 10) * 10) + (((t % 10) + (t / 10)) % 10);
            count++;
        }
        System.out.println(count);
    }
}
