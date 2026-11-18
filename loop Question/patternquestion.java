public class patternquestion {
 public static void main(String[]args){
/* * * * *
   * * * *   square pattern
   * * * *
   * * * *  
  for(int i =1;i<=4;i++){
    for(int j =1; j<=4; j++){
        System.out.print("*");
    }
    System.out.println();
  }*/
 /*1111
   2222
   3333
   4444 
 for(int i =1;i<=4;i++){
    for(int j =1; j<=4; j++){
        System.out.print(i);
    }
    System.out.println();
}  */
/* 
1234
1234
1234
1234

for(int i =1;i<=4;i++){
    for(int j =1; j<=4; j++){
        System.out.print(j);
    }
    System.out.println();
}   */
/*
*
**
***        Traigle pattern
****
*****

for(int i =1;i<=5;i++){
    for(int j =1; j<=i; j++){
        System.out.print("*");
    }
    System.out.println();
    }
    */
   /*
        *****
       *****
      *****         rombush solid pattern
     *****
    *****
   */
 /*  int n=5;
   for(int i =1;i<=n;i++){
    for(int j =1 ; j<=n-i;j++){
        System.out.print(" ");
    }
    for(int j =1; j<=n; j++){
        System.out.print("*");
    }
    System.out.println();
}  
    */
   /* *****
      ****
      ***
      **
      *   
   
  int n=5;
  for(int i =1;i<=n;i++){
    for(int j =1; j<=n-i+1; j++){
        System.out.print("*");
    }
    System.out.println();
    }  
    */
   /*
    *
   **
  ***
 ****
*****
   */
  /*int n=5;
  for(int i =1;i<=n;i++){
    for(int j =1; j<=n-i; j++){
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
    }  
    */
            /*
*****
 ****
  ***
   **
    *
          
         int n=5;
  for(int i =1;i<=n;i++){
    for(int j =1; j<=i-1; j++){
        System.out.print(" ");
    }
    for(int j=1;j<=n-i+1;j++){
        System.out.print("*");
    }
    System.out.println();
    }  
    */
   /*
    *
   ***
  *****    praymid pattern important 
 *******
*********
 
  int n=5;
  for(int i =1;i<=n;i++){
    for(int j =1; j<=n-i; j++){
        System.out.print(" ");
    }
    for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
    }
    System.out.println();
    }  
    */
    /*
    *********
   *********
  *********  solid rombus 
 *********
*********
    
   int n=5;
  for(int i =1;i<=n;i++){
    for(int j =1; j<=n-i; j++){
        System.out.print(" ");
    }
    for(int j=1;j<=2*n-1;j++){
        System.out.print("*");
    }
    System.out.println();
    }  */
   /*
   *******
    *****  inverse pyramid important for logic
     ***
      * 
   * */
     /*int n=10;
  for(int i =1;i<=n;i++){
    for(int j =1; j<=i-1; j++){
        System.out.print(" ");
    }
    for(int j=1;j<=2*n-(2*i+1);j++){  // odd number-space(i-1)
        System.out.print("*");
    }
    System.out.println();
    */
}
 }
