import java.util.Scanner;

public class R2{ 
  public static void main(String args[]){  
    Scanner kb= new Scanner(System.in);
    int r= kb.nextInt();
    int s =kb.nextInt(); 
    if (-1000<=s && s<=1000 && -1000<=r && r<=1000)
      System.out.println(s*2-r);
 
  }  
} 