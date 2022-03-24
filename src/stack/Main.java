package stack;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int Pre(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;

        }
        return -1;
    }

    static String infixToPostfix(String input) {
        String result = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            //Pengecekan kondisi jika char adalah operator
            if (Pre(c) > 0) {
                while (stack.isEmpty() == false && Pre(stack.peek()) >= Pre(c)) {
                    result += stack.pop();
                }
                stack.push(c);
            } else if (c == ')') {
                char x = stack.pop();
                while (x != '(') {
                    result += x;
                    x = stack.pop();
                }
            } else if (c == '(') {
                stack.push(c);

            } else{ // Character bukan merupakan operator

                result += c;
            }
        }
        for (int i = 0; i <= stack.size() ; i++) {
            result += stack.pop();
        }
        return result;
    }
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String exp = input.nextLine();
        System.out.println(infixToPostfix(exp));
    }

}



