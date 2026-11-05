import java.util.*;
public class BinarySearch{

    static int binarySearch(int prices[], int left, int right, int key){
        if(left <= right){
            int mid = (left+right)/2;
            if(prices[mid] == key){
                return mid;
            }
            if(prices[mid] < key){
                return binarySearch(prices, mid+1, right, key);
            }
            return binarySearch(prices, left, mid-1, key);
        }
        return -1;
    }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number of books:");
        int n = sc.nextInt();

        int[] prices = new int[n];
        System.out.println("enter the ISBN numbers for each book:");
        for(int i=0; i<n; i++){
            prices[i] = sc.nextInt();
        }

        System.out.print("enter the ISBN number to search:");
        int key = sc.nextInt();

        int result = binarySearch(prices , 0 ,n-1, key);

        if(result!=-1){
            System.out.println("book found at index:" + result+1);
        } else {
            System.out.println("book not found");
        }
        sc.close();
    }
}