import java.util.*;
public class whileloopquestion {
    public static void main(String[] args) {
         // Print numbers from 1 to 20 using while loop.
        /*  int i =1;
         while(i<=20){
            System.out.println(i);
            i++;
         }*/
//Find the sum of digits of a number.
Scanner sc= new Scanner(System.in);
System.out.print("Enter a number : ");
int num1=sc.nextInt();
System.out.print("Enter a second  number : ");
int num2=sc.nextInt();
/*int count =0;
while (num>0) {
    num=num/10;
    count++;
}
System.out.println("count number of digit in number = "+count);
    */
   //find the  sum of the digit.
  /*  int sum=0;
   while (num>0) {
int ans= num%10;
sum=sum+ans;
num=num/10;
   }
   System.out.println("sum of the digit = "+sum);*/
   // reversed the digits of a number -- 12345--> 54321
   /*int ans =0;
   while (num>0) {
     ans= ans*10 + num%10;
    num/=10;
   }
   System.out.println("reversed of digit --> "+ans);
*/
//sum of the digit 1-2+3-4.....n; even subtract and odd add
/*int ans=0;
for(int i =1;i<=num;i++){
if (i%2==0) {
   ans=ans-i;
}
else{
   ans=ans+i;
}
}
System.out.println("even subtract and odd add = "+ans);
*/
//give two number and find the a raised two the power.
int ans=1;
for(int i = 1; i<=num2;i++){
ans=ans*num1;
}
System.out.println("multiply the power :"+ans);
   }
}