import java.util.*;
public class AddBinary{
public static void main(String[] args)
{
int b=Integer.parseInt("11",2);
int a=Integer.parseInt("1",2);
int c=a+b;
String d= Integer.toBinaryString(c);
System.out.println(d);
}
}
