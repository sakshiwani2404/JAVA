import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            findSum(n);
           
        }
    }
    // public static void findSum(int num)  //alternative way to solve for low range
    // {
    //     int sum = 0 ; 
    //     for(int i=3;i<num;i+=3)
    //         sum+=i;
            
    //     for(int i =5;i<num;i+=5)
    //     {
    //         if(i%3!=0)
    //             sum+=i;
    //     }
    //     System.out.println(sum);
    // }
    public static void findSum(int num )
    {
        System.out.println(sum(num,3)+sum(num,5)-sum(num,15));
        
    }
    public static long sum(int num , int k )
    {
        long p = (num-1)/k;
        return k * p*(p+1)/2;
    }
}
