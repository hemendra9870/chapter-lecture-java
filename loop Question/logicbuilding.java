import java.util.*;
public class logicbuilding {
    public static void main(String[] args) {
        //Find the sum of numbers from 1 to 10.
       /*  int sum=0;
        for(int i = 1; i<=10;i++){
            sum = sum+i;
        }
        System.out.println("sum of numbers from 1 to 10 = "+sum);
        */
      // Find the sum of even numbers from 1 to 50.
    /*    int sum=0;
        for(int i = 0; i<=50;i+=2){
            sum = sum+i;
        }
        System.out.println("sum of even  numbers from 1 to 50 = "+sum); */
        //Find the factorial of a number.
       /*  Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int fact = 1;

        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers");
        } 
        else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;  
                // 0 answer 1 aata because loop ek baar bhi nahi chalta 
            }

            System.out.println("Factorial = " + fact);
        }

        sc.close(); */
//Count how many numbers are divisible by 5 between 1 and 100.
        /*int count = 0 ;
            for (int i = 1; i <= 100; i++) {
                if (i%5==0) {
                    count++;
                }
            }
  System.out.println("digit cont divisble by 5 =" +count); */
    //Take a number from the user and print its multiplication table.
    Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number:");
        int n = sc.nextInt();
            /*for (int i = 1; i <= 10; i++) {
System.out.println(+n+ " X "+ i + " = "+n*i);
            } */
           // check prime number code
          int count=0;
           if (n>1) {
for(int i=1;i<=n;i++){
if (n%i==0) {
    count++;
}
        
    }
    if (count==2) {
        System.out.println("is prime number");
    }
    else{
        System.out.println("is not a prime");
    }
}
else{
    System.out.println("please enter a correct number");
}
 
// use of code boolean in prime number check.
/* boolean isprime=true;
if(n<=1){
    isprime=false;
}
else{
    for(int i=2;i<n;i++){
if (n%i==0) {
    isprime=false;
    break;
}
    }
}
if (isprime) {
    System.out.println("is a prime number = "+n);
}
else{
    System.out.println("is not a prime number = "+n);
}*/
}
    }


    

