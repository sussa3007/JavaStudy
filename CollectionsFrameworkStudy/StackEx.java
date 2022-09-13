package CollectionsFrameworkStudy;

import java.util.*;

public class StackEx {
    public static void main(String[] args) {
        Stack st = new Stack();
        String expression = "(5+2)*2+(4+4)/2";

        System.out.println("expression:" + expression);

        try {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);

                if (ch == '(') {
                    st.push(ch + "");
                } else if (ch == ')') {
                    st.pop();
                }
            }

            if (st.isEmpty()) {
                System.out.println("정상입니다");
            } else {
                System.out.println("괄호가 부족합니다.");
            }
        } catch (EmptyStackException e) { // 스택이 비어있을때 예외가 발생하기 때문에 try catch로 작성
            System.out.println("괄호가 많습니다.");
        } // try
    }
}