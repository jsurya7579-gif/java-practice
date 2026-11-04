import java.util.*;

public class StudentManagement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of e-books:");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter the prices of the e-book:");
        for(int i=0; i<n; i++){
            prices[i] = sc.nextInt();
        }
        System.out.print("enter the wallet balance:");
        int target = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean found = false;
        for(int i=0; i<n; i++){
            int complement = target - prices[i];
            if(map.containsKey(complement)){
                System.out.println("\nmatch found");
                System.out.println("_______________");
                System.out.println("first e-bookk:$" + complement);
                System.out.println("second e-book:$" + prices[i]);
                System.out.println("index of first e-book:" + map.get(complement));
                System.out.println("index of second e-book:" + i);

                found = true;
                break;                
            }
            map.put(prices[i],i);
        }
        if(!found){
            System.out.println("no match found");
        }
        sc.close();
    }

}