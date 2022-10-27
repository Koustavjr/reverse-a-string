import java.util.*;
class Main {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter String");
    String str = sc.next();
    int l=str.length();
    String str1="";
    for(int i=l-1;i>=0;i--)
      {
        str1=str1+str.charAt(i);
      }
    System.out.println("Reverse String "+str1);
  }
}