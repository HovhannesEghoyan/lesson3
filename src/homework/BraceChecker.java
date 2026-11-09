package homework;


public class BraceChecker {
    public String text;

    public BraceChecker(String text) {
        this.text = text;

    }

    public void check() {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char charAt = text.charAt(i);
            if (charAt == '(' || charAt == '[' || charAt == '{') {
                stack.push(charAt, i);
            } else if (charAt == ')') {
                char last = stack.pop();
                if (last == 0) {
                    System.out.println("Error closed by ')'  but not opened  " + i);
                } else if (last != '(') {
                    System.out.println("Error opened by  " + last + " but  closed ) " + i);
                    return;

                }
            } else if (charAt == ']') {
                char last = stack.pop();
                if (last == 0) {
                    System.out.println("Error closed by ']' but not opened by " + i);
                    return;
                } else if (last != '[') {
                    System.out.println("Error opened by " + last + " but not closed " + i);
                    return;
                }
            } else if (charAt == '}') {
                char last = stack.pop();
                if (last == 0) {
                    System.out.println("Error closed by '}' but not opened by " + i);
                    return;
                } else if (last != '{') {
                    System.out.println("Error opened by " + last + " but not closed " + i);
                    return;
                }
            }
        }
        char finalCheck = stack.pop();
        if (finalCheck != 0) {
            System.out.println("Error opened " + finalCheck + " but not closed");
        } else {
            System.out.println("No errors");
        }
    }

    public class Stack {


        char stck[] = new char[100];
        int[] index = new int[100];
        int tos;

        Stack() {
            tos = -1;

        }

        void push(char item, int ind) {
            if (tos == 99)
                System.out.println("full");
            else {
                tos++;
                stck[tos] = item;
                index[tos] = ind;
            }
        }

        char pop() {
            if (tos < 0) {
                return 0;
            } else return stck[tos--];
        }

    }

}
