import java.util.*;
public  class BinarySearch{
    static  int binarysearch(int[] isbn, int left,int right, int key){
        if(left<=right){
            int mid = (left+right)/2;
            if(isbn[mid] == key)
                return mid;
        if(key<isbn[mid])
            return binarysearch(isbn,left,mid-1,key);
        return binarysearch(isbn,mid+1,right,key);
        }
        return -1;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of books:");
        int n =sc.nextInt();
        int[] isbn = new int[n];
        System.out.println("enter the isbn number for each book:");
        for(int i=0; i<n; i++){
            isbn[i] = sc.nextInt();
        }
        System.out.print("enter the isbn to search:");
        int key = sc.nextInt();
        int result = binarysearch(isbn,0,n-1,key);
        if(result!= -1){
            System.out.println("book found at position:" + (result+1));
        } else{
            System.out.println("book not found");
        }
        sc.close();
    }
}