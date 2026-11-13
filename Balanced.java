import java.util.Stack;
import java.util.Scanner;

public class Balanced{
    static boolean isBalance(String expr){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<expr.length(); i++){
            char ch = expr.charAt(i);
            if(ch == '(' || ch == '{' || ch  == '['){
                stack.push(ch);
            }else if(ch == ')' || ch == '}' || ch == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((ch == ')' && top!= '(') || (ch == '}' && top!='{') || (ch == ']' && top!= '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expression:");
        String expression = sc.nextLine();
        if(isBalance(expression)){
            System.out.println("the expression is balanced");
        } else {
            System.out.println("the expression is not balanced");
        }
        sc.close();
        
    }
}