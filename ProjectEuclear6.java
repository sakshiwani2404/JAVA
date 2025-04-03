
import java.util.*;


public class ProjectEuclear6 {
    public static long addSqr(long n){
               
        long sum=n*(n+1)/2;;
        
        return sum*sum;
    }
    public static long sqrAdd(long n)
    {
        long sum=(n*(n+1)*(2*n+1))/6;
        
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextInt();
            System.out.println(addSqr(n)-sqrAdd(n));
        }
    }
}
