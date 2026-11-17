
public class basicloopquestion {
    public static void main(String[] args) {

       /* odd and even print question
        for(int i = 0; i <= 100; i += 2) {
            System.out.println("Even="+i);//0 se 100 even 
        }
for(int j=1; j<100; j+=2){
    System.out.println("odd="+j);
} */
// print table 
/*for (int i =  1; i<=10;i++){
System.out.println("9 X "+ i + " = "+9*i);
}*/
//Print all numbers divisible by 3 from 1 to 30.
for(int i = 1; i<=30; i++){
    if (i%3==0) {
System.out.println("divisble by is 3 = "+i);
    }
     else if(i%3!=0){
System.out.println(" not divisble by is 3 = "+i);
     }
}
    }
}
