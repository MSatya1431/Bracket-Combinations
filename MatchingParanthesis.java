import java.util.*; 
import java.io.*;

class Main 
{
  public static long[] factArr = new long[10001];
  public static long fact(int f)
  {
    if(f<=1) return 1;
    if(factArr[f] == 0)
    {
      factArr[f] = f* fact(f-1);
    }
    return factArr[f];
  }


  public static int BracketCombinations(int n) {
    
    long f1 =   fact(2*n);
    long f2 = fact(n+1)*fact(n); 
    long div = f1/f2;
    return (int)(div);

  }
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(BracketCombinations(s.nextLine())); 
  }

}
