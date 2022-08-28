import java.util.*;

class StackQueue {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList();	// Queue는 인스턴스다, LinkedList클래스는 Queue의 구현 클래스다.

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("= Stack =");
        while(!st.empty()) {
            System.out.println(st.pop()); // Input된 역순으로 끝에서부터 출력된다.
        }

        System.out.println("= Queue =");
        while(!q.isEmpty()) {
            System.out.println(q.poll()); // Input된 순서대로 출력된다.
        }
    }
}