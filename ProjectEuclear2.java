import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ProjectEuclear2 {
    public static long fibEvenSum(long n)
    {
        long a=0;long b=1;
        long sum=0;
        for(;b<=n;)
        {
            if(b%2==0)
                sum+=b;
        
            long next=a+b;
            a=b;
            b=next;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int a0 = 0; a0 < t; a0++)
        {
            
            long n = in.nextLong();
            System.out.println(fibEvenSum(n));
        }
        
    }
}
