public class onebit
{
public static int HammingWeight(int n){
int count=0;
while(n!=0){
count+=n&1;
n>>>=1;
}
return count;
}
public static void main(String[] args){
int num=42;
int result= HammingWeight(num);
System.out.println("the number of '1' bits in"+num+"is:"+result);
}
}
