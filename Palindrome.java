import java.util.Scanner;
public class Palindrome
{
public static void main(String[] args)
{
Scanner src= new Scanner(System.in);
System.out.println("Enter a number:");
int a=src.nextInt();
int temp=a;
int reverse=0;
while(a!=0){
int remainder=a%10;
reverse=reverse*10+remainder;
a=a/10;
}
if(temp==reverse){
System.out.println("It is a palindrome");
}
else{
System.out.println("It isn't a palindrome");
}
}
}
