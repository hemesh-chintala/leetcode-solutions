import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0;i<T;i++){
		    int N = sc.nextInt();
		    int A[] = new int[N];
		    int B[] = new int[N];
		    int total = 0;
		    for(int j = 0;j<N;j++){
		         A[j] = sc.nextInt();
		        
		        
		        total += A[j];
		       
		    }
		    int mindiff = Integer.MAX_VALUE;
		    for(int k=0;k<N;k++){
		        B[k] = sc.nextInt();
		        mindiff = Math.min(mindiff,(A[k]-B[k]));
		    }
		    System.out.println(total-mindiff);
		}
        
	}
}
