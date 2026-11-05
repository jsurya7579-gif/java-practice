import java.util.*;
public class Balanced{
    public static boolean isBalance(String expr){
        Stack<Character> Stack = new Stack<>();
        for(int i=0; i<expr.length(); i++){
            char ch = expr.charAt(i);
            if(ch =='(' || ch == '{' || ch == '['){
                Stack.push(ch);
            }else if(ch == ')' || ch == '}' || ch == ']'){
                if(Stack.isEmpty()){
                    return false;
                }
                char top = Stack.pop();
                if((ch == ')' && top != '(') ||
                   (ch == '}' && top != '{') ||
                   (ch == ']' && top != '[')){
                    return false;
                }
            }
        }
        return Stack.isEmpty();
    }



    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        System.out.print("enter the expressionn:");
        String expression = sc.nextLine();
        if(isBalance(expression))
            System.out.println("expression is balanced:");
        else
            System.out.println("expression is not balanced:");
        sc.close();
    }
}