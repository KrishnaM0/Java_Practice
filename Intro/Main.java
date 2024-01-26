
// Leap year code:-
// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         // System.out.println("Hello World");
//         for(int i=0;i<4;i++){
//             try (Scanner input = new Scanner(System.in)) {
//                 System.out.print("Enter the year: ");
//                 int year = input.nextInt();
//                 if((year % 4==0 || year % 400==0) && year%100!=0)
//                     System.out.println("The year is a leap year: "+year);
//                 else
//                     System.out.println("The year is not a leap year..");
//             }
//             }
//     }
// }



// Addition & multiplication code:-
// import java.util.Scanner;
// class Main{
//     public static void main(String[] args){
        // int a = 30;
        // float b = 23.4f;
        // float sum = (int)(a+b);
        // System.out.println("The sum is : " + sum);
// 
        // Scanner scr = new Scanner(System.in);
        // System.out.print("Enter num1: ");
        // int a = scr.nextInt();
        // System.out.print("Enter num2: ");
        // int b = scr.nextInt();
        // int prod = a*b;
        // System.out.println("The product is: " + prod);
//     }
// }



// Table code:-
// import java.util.Scanner;
// class Main{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);

//         System.out.print("Enter the table: ");
//         int num = scr.nextInt();
//         System.out.println("The table is : ");

//         for(int i=1;i<=10;i++){
//             System.out.println(i*num);
//         }
//     }
// }



// // Summation of multiple integers until num=0 is typed:- 
// import java.util.Scanner;
// class Main{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int sum = 0;
//         int num;
//         System.out.println("Enter the number: ");
//         do{
//             num = scr.nextInt();
//             sum=sum+num;
            
//         }while(num!=0);
//         System.out.println("The sum is : " + sum);
//     }
// }



// //Take name as input and print a greeting message for that particular name:-
// import java.util.Scanner;
// class Main{
//     public static void main(String[] args){
//         String name = "Krishna";
//         Scanner scr = new Scanner(System.in);
//         System.out.println("Enter your name: ");
//         String ch = scr.nextLine();
//         System.out.println("Hello " + ch);
//         System.out.println("Hello " + name);
//     }
// }



// // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest:-
// import java.util.Scanner;
// class Main{
//     public static void main(String[] args) {
//         try (Scanner scr = new Scanner(System.in)) {
//             System.out.println("Enter the principal: ");
//             float pri = scr.nextFloat();
//             System.out.println("Enter the time: ");
//             float time = scr.nextFloat();
//             System.out.println("Enter the rate: ");
//             float rate = scr.nextFloat();
//             System.out.println("The simple interest will be : " + (pri*time*rate)/100);
//         }
//     }
// }



// // Take 2 numbers as input and print the largest number:-
// import java.util.Scanner;
// class Main{
//         public static void main(String[] args) {
//                 Scanner scr = new Scanner(System.in);
//                 System.out.println("Enter num1: ");
//                 int num1 = scr.nextInt();
//                 System.out.println("Enter num2: ");
//                 int num2 = scr.nextInt();
//                 if(num1>num2){
//                         System.out.println("The num1 is largest number: " + num1);
//                 }
//                 else{
//                         System.out.println("The num2 is largest number: " + num2);
//                 }

//         }
// }



// //Input currency in rupees and output in USD:-
// import java.util.Scanner;
// class Main{
//         public static void main(String[] args){
//                 System.out.println("Enter the value in RS: ");
//                 Scanner input = new Scanner(System.in);
//                 float value = input.nextFloat();
//                 System.out.println("The conversion in USD is : " + value*82.0156);
//                 input.close();
//         }
// }



// // To calculate Fibonacci Series up to n numbers:-(0,1,1,2,3,5,8,13,21...)
// import java.util.Scanner;
// class Main{
//         public static void main(String[] args) {
//                 Scanner scr = new Scanner(System.in);
//                 System.out.print("\nEnter the number: ");
//                 int num = scr.nextInt();
//                 int a = 0;
//                 int b = 1;
//                 int sum = a + b;
//                 System.out.print("\nThe fibonacci series is : ");
//                 do{
//                         System.out.print(sum + " ");
//                         a = b;
//                         b = sum;
//                         sum = a + b;
//                 }while(sum<=num);
//                 scr.close();

//         }
// }



// // To find out whether the given String is Palindrome or not:-
// class Main{    
//         public static void main(String[] args) {  
//                 String string = "Krishna";  
//                 boolean flag = true;  
          
//                 //Converts the given string into lowercase  
//                 string = string.toLowerCase();  
          
//                 //Iterate the string forward and backward, compare one character at a time   
//                 //till middle of the string is reached  
//                 for(int i = 0; i < string.length()/2; i++){  
//                         if(string.charAt(i) != string.charAt(string.length()-i-1)){  
//                                 flag = false;  
//                                 break;  
//                         }  
//                 }  
//                 if(flag)  
//                         System.out.println("Given string is palindrome");  
//                 else  
//                         System.out.println("Given string is not a palindrome");  
//         }  
// }



// //Input a number and print all the factors of that number (use loops):-
// import java.util.Scanner;
// class Main{
//         public static void main(String[] args) {
//                 Scanner scr = new Scanner(System.in);
//                 System.out.print("Enter the number : ");
//                 int num = scr.nextInt();
//                 System.out.print("\nThe factors are : ");
//                 for(int i=1;i<=num;i++){
//                         if(num % i == 0){
//                                 System.out.print(i + " ");
//                         }
//                 }
//                 scr.close();
//         }
// }



// //Take integer inputs till the user enters 0 and print the largest number from all:- 
// import java.util.Scanner;
// class Main{
//         public static void main(String[] args) {
//                 Scanner scr = new Scanner(System.in);
//                 int num;
//                 int max = 0;
//                 System.out.println("Enter the numbers : ");
//                 do{
//                         num = scr.nextInt();
//                         if(num>max){
//                                max = num;

//                         }
//                 }while(num!=0);
//                 System.out.println("The maximum number is : " + max);

//                 scr.close();
//         }
// }



// //Calculate Average Of N Numbers:-
// import java.util.Scanner;
// class Main{
//         public static void main(String[] args) {
//                 Scanner scr = new Scanner(System.in);
//                 System.out.print("Enter the number : ");
//                 int num = scr.nextInt();
//                 int sum = 0;
//                 for(int i=1;i<=num;i++){
//                         sum = sum + i;
//                 }
//                 System.out.println("The sum is : " + sum);
//                 float average = sum/num;
//                 System.out.println("Average : " + average);

//                 scr.close();
//         }
// }



// //Power In Java:-
// import java.util.Scanner;
// import java.lang.Math;
// class Main{
//         public static void main(String[] args) {
//                 Scanner scr = new Scanner(System.in);
//                 System.out.print("\nEnter the number: ");
//                 int num = scr.nextInt();
//                 System.out.print("\nEnter the power num: ");
//                 int power = scr.nextInt();
//                 System.out.println("\nThe power of the number " + num + " is : " + Math.pow(num,power) + "\n");
//                 scr.close();
//         }
// }



// //Java Program Vowel Or Consonant:-
// import java.util.Scanner;
// class Main{
//         public static void main(String[] args) {
//                 Scanner scr = new Scanner(System.in);
//                 while(true){
//                         System.out.print("\nEnter the character : ");
//                         char ch = scr.next().charAt(0);
//                         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//                                 System.out.println("The character is an vowel : " + ch);
//                         }
//                         else{
//                                 System.out.println("The character is consonant : " + ch);
//                         }
//                 }
//         }
// }



// // Perfect Number In Java:- [if sum of all the factors of num 28 except 28 is 28 then, num 28 is an perfect number..]
// import java.util.Scanner;
// class Main{
//         public static void main(String[] args) {
//                 Scanner scr = new Scanner(System.in);
//                 System.out.print("Enter the number: ");
//                 int num = scr.nextInt();
//                 int sum =0;
//                 for(int i=1;i<num;i++){
//                         if(num % i==0){
//                                 sum = sum + i;
//                         }
//                 }
//                 if (sum==num){
//                         System.out.println("The number " + num + " is an perfect Number..");
//                 }
//                 else 
//                         System.out.println("The number is not a perfect number");
//                 scr.close();

//         }
// }



// // Factorial Program In Java:-
// import java.util.Scanner;
// class Main{
//         public static void main(String[] args) {
//                 Scanner scr = new Scanner(System.in);
//                 System.out.print("Enter the number : ");
//                 int num = scr.nextInt();
//                 int prod = 1;
//                 for (int i=1;i<=num;i++){
//                         prod = prod * i;  
//                 }
//                 System.out.println("The fatorial of "+num + " is : " +prod );
//                 scr.close();
//         }
// }



// // Reverse A String In Java:-
// import java.util.Scanner;
// class Main{
//         public static void main(String[] args) {
//                 Scanner scr = new Scanner(System.in);
//                 String str = "Krishna";
//                 System.out.print("\nOriginal string : " + str);
//                 System.out.print("\nReverse string :  ");
//                 for(int i=str.length()-1;i>=0;i--){
//                         char temp = str.charAt(i);
//                         System.out.print(temp);
//                 }

//                 scr.close();

//         }
// }



// // Sum Of A Digits Of Number:-
// import java.util.Scanner;

// class Main{
//         public static void main(String[] args) {
//                 Scanner scr = new Scanner(System.in);
//                 System.out.print("\nEnter the number : ");
//                 int num = scr.nextInt();
//                 int sum = 0;
//                 while(num>0){
//                         int rem = num % 10;
//                         sum = sum + rem;
//                         num = num / 10;
//                 }
//                 System.out.println("\nThe sum is : " + sum);
//                 scr.close();

//         }
// }



// // Subtract the Product and Sum of Digits of an Integer:-
// import java.util.Scanner;
// class Main{
//         public static void main(String[] args) {
//                 Scanner scr = new Scanner(System.in);
//                 System.out.print("\nEnter the number : ");
//                 int num = scr.nextInt();
//                 int sum = 0;
//                 int prod = 1;
//                 while(num>0){
//                         int rem = num % 10;
//                         sum = sum + rem;
//                         prod = prod * rem;
//                         num = num / 10;
//                 }
//                 System.out.println("\nThe sub of prod & sum of the digit is : " + (prod - sum) + "\n");

//                 scr.close();
//         }
// }



/*
Kunal is allowed to go out with his friends only on the even days of a given month.
Write a program to count the number of days he can go out in the month of August.
*/
// import java.util.Scanner;
// class Main{
//         public static void main(String[] args) {
//                 Scanner scr = new Scanner(System.in);
//                 int aug_days= 31;
//                 int count = 0;
//                 for(int i=1;i<aug_days;i++){
//                         if(i % 2==0){
//                                 count++;
//                         }
//                 }
//                 System.out.println("\nThe total days kunal can go out in month of aug_days are : " + count + '\n');
//                 scr.close();
//         }
// }



// // Write a program to print the sum of negative numbers :-
// import java.util.Scanner;
// class Main{
//         public static void main(String[] args) {
//                 Scanner scr = new Scanner(System.in);
//                 System.out.print("\nEnter the -ve numbers : ");
//                 int num = scr.nextInt();
//                 int sum = 0;
//                 while(num != 0){
//                         sum = sum + num;
//                         num = scr.nextInt();
//                 }
//                 System.out.print("The sum is : " + sum);
//                 scr.close();
//         }
// }



/*
sum of positive even numbers, -ve numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user.
The list terminates when the user enters a zero. 
*/
// import java.util.Scanner;
// class Main{
//         public static void main(String[] args) {
//                 Scanner scr = new Scanner(System.in);
//                 System.out.print("\nEnter the numbers : ");
//                 int num;
//                 int nsum = 0;
//                 int esum = 0;
//                 int osum = 0;
//                 while(true){
//                         num = scr.nextInt();
//                         if(num == 0)
//                                 break;
        
//                         if(num < 0)
//                                 nsum = nsum + num;
                        
//                         if(num > 0 && num % 2 == 0)
//                                 esum = esum + num;

//                         if(num > 0 && num % 2 != 0)
//                                 osum = osum + num;

//                 }
//                 System.out.println("\nThe sum of -ve numbers : " + nsum);
//                 System.out.println("The sum +ve even numbers : " + esum);
//                 System.out.println("The sum +ve odd numbers : " + osum);
//                 System.out.println();
//                 scr.close();
//         }
// }



// // Take I/p of two numbers and an operator (+, -, *, /) and calculate the value. (Use switch cases):-
// import java.util.Scanner;
// class Main{
//         public static void main(String[] args) {
//                 Scanner scr = new Scanner(System.in);
//                 System.out.println("\nEnter the operator between + - * /");
//                 char ch = scr.next().charAt(0);
//                 System.out.println("Enter two numbers : ");
//                 int num1 = scr.nextInt();
//                 int num2 = scr.nextInt();
//                 switch(ch){
//                         case'+'->System.out.println("The sum is : " + (num1 + num2));
                            
//                         case'-'->System.out.println("The sum is : " + (num1 - num2));

//                         case'*'->System.out.println("The sum is : " + (num1 * num2));

//                         case'/'->System.out.println("The sum is : " + (num1 / num2));
                        
//                         default -> System.out.println("Enter the valid operator..!");
//                 }
                
//                 scr.close();
//         }
// }



// // Take I/p of two numbers & an operator (+, -, *, /) and calculate the value. (Use switch cases):-
// import java.util.Scanner;
// class Main{
//     public static void main(String[] args){

//         Scanner scr = new Scanner(System.in);

//         for(int i=0;i<3;i++){

//             try{

//                 float num1,num2;
//                 int ch;
//                 System.out.println("\n\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
//                 System.out.print("Enter your choice: ");
//                 ch = scr.nextInt();

//                 System.out.print("\nEnter The Number: ");
//                 num1 = scr.nextFloat();
//                 System.out.print("Enter The Number: ");
//                 num2 = scr.nextFloat();

//                 switch(ch){

//                     case 1:
//                         float sum = num1 + num2;
//                         System.out.print("The sum is : "+ sum);
//                             break;

//                     case 2:
//                         float sub = num1 - num2;
//                         System.out.print("The sub is : "+ sub);
//                             break;

//                     case 3:
//                         float mul = num1 * num2;
//                         System.out.print("The prod is : "+ mul);
//                             break;

//                     case 4:
//                         float div = num1 / num2;
//                         System.out.print("The div is : "+ div);
//                             break;

//                     default: System.out.println("You Entered Invalid Choice..!");
//                 }
//             }
//             catch(Exception e){
//                 System.out.println("\n ENTER THE INTEGER/FLOAT VALUE..!\n");
//                 break;
//             }
//         }
//     scr.close();
//     }
// }
