/* package whatever; // don't place package name! */

/* package whatever; // don't place package name! */

import java.util.Scanner;
class Ideone
{
  public static void main(String args[]) throws java.lang.Exception
  {
    Scanner sc=new Scanner(System.in);
    char ch=sc.next().charAt(0);
    if (ch >='a' && ch <= 'z'||ch >='A' && ch <='Z') 
    {
      System.out.println("Alphabet");
    }
    else
    {
      System.out.println("No");
     }
   }
  }
     
