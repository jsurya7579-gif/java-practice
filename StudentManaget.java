import java.util.*;
public class StudentManaget{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter nummber of e-books:");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("enter the prices for each e-book:");
        for(int i=0; i<n; i++){
            prices[i] = sc.nextInt();
        }
        System.out.print("enter the wallet balance:");
        int balance = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int complement = balance - prices[i];
            if(map.containsKey(complement)){
                System.out.println("matching e-books found:");
                System.out.println("_______________________");
                System.out.println("first e-book price:" + complement);
                System.out.println("second e-book  price:" + prices[i]);
                System.out.println("index of firsst e-book :" + map.get(complement));
                System.out.println("index of second e-book :" + i);
            }
            map.put(prices[i],i);
        }
        sc.close();

    }
}