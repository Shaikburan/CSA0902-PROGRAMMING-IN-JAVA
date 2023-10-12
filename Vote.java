import java.util.Scanner;
public class Vote
{
public static void main(String[] args)
{
Scanner src=new Scanner(System.in);
int age=src.nextInt();
if(age>=18){
System.out.println("you are eligible to vote");
}
else{
int remain=18-age;
System.out.println("you are eligible after "+remain+" years");
}
}
}
