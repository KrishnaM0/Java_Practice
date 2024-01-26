
// Sum of n numbers till user enters 0 : -
// import java.util.Scanner;
// public class Fun{
//    public static void main(String[] args) {
//       Scanner scr = new Scanner(System.in);
//       System.out.print("Enter the numbers : ");
//       int num = scr.nextInt();
//       int ans = sum(num, scr);
//       System.out.print("The sum is : " + ans);
//       scr.close();
//    }
//    static int sum(int num, Scanner scr){
//       int sum1 = 0;
//       while(num != 0){
//          sum1 = sum1 + num;
//          num = scr.nextInt();
//       }
//       return sum1;
//    }
// }



// //Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user:-
// import java.util.Scanner;
// import java.lang.Math;
// public class Fun {
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         System.out.println("Enter three numbers : ");
//         int a = scr.nextInt();
//         int b = scr.nextInt();
//         int c = scr.nextInt();
//         int res = max(a,b,c);
//         int resm = min(a,b,c);
//         System.out.println("The max is : " + res);
//         System.out.println("The min is : " + resm);
//         scr.close();
//     }
//     static int max(int a, int b, int c){
//         int max1 = Math.max(a,b);
//         int max2 = Math.max(max1,c);
//         // System.out.println("The max value is : " + max2);
//         return max2;
//     }
//     static int min(int a,int b,int c){
//         int min1 = Math.min(a,b);
//         int min2 = Math.min(min1,c);
//         // System.out.println("The min value is : " + min2);
//         return min2;
//     }
// }



// //Define a program to find out whether a given number is even or odd:-
// import java.util.Scanner;
// public class Fun{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         System.out.print("\nEnter the number : ");
//         int num = scr.nextInt();
//         evenOrodd(num);
//         scr.close();
//     }
//     static void evenOrodd(int num){
//         if(num % 2 ==0)
//             System.out.println("\nThe number is even..\n");
//         else
//             System.out.println("\nThe number is odd...\n");
//     }
// }



/* A person is eligible to vote if his/her age is greater than or equal to 18.
   Define a method to find out if he/she is eligible to vote : -
*/
// import java.util.Scanner;
// public class Fun{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         System.out.print("\nEnter your age : ");
//         int age = scr.nextInt();
//         iseligibleForvote(age);
//         scr.close();
//     }
//     static void iseligibleForvote(int age){
//         if(age >18)
//             System.out.println("\nYour eligible for voting...\n");
//         else
//             System.out.println("\nYour not eligible for voting...\n");
//     }
// }



//Define a method that returns the product & sum of two numbers entered by user : -
// import java.util.Scanner;
// public class Fun{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         System.out.print("\nEnter two numbers : ");
//         int num1 = scr.nextInt();
//         int num2 = scr.nextInt();
//         sum(num1,num2);

//         int prodResult = prod(num1,num2);
//         System.out.print("\nThe product is : " + prodResult + '\n');
        
//         scr.close();
//     }
//     static void sum(int num1,int num2){
//         System.out.print("\nThe sum is : " + (num1 + num2) + '\n');
//     }
//     static int prod(int num1 , int num2){
//         return (num1 * num2);
//     }
// }



/*
Write a program that will ask the user to enter his/her marks (out of 100).
Define a method that will display grades according to the marks entered as below:
 
Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail 
*/
// import java.util.Scanner;
// public class Fun{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         System.out.print("Enter your marks(0 to 100) : ");
//         int marks = scr.nextInt();
//         if(marks<0 || marks>100){
//             System.out.println("Enter marks between 0 to 100...!");
//         }
//         grade(marks);
//         scr.close();
//     }
//     static void grade(int marks){
//         if(marks>91 && marks<100){
//             System.out.println("Grade : AA");
//         }
//         if(marks>81 && marks<90){
//             System.out.println("Grade : AB");
//         }
//         if(marks>71 && marks<80){
//             System.out.println("Grade : BB");
//         }
//         if(marks>61 && marks<70){
//             System.out.println("Grade : BC");
//         }
//         if(marks>51 && marks<60){
//             System.out.println("Grade : CD");
//         }
//         if(marks>41 && marks<50){
//             System.out.println("Grade : DD");
//         }
//         if(marks<=40 && marks>=0){
//             System.out.println("Fail");
//         }
//     }
// }



/*
Write a program to print the factorial of a number by defining a method named 'Factorial'.
Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
4! = 1 * 2 * 3 * 4 = 24 
3! = 3 * 2 * 1 = 6 
2! = 2 * 1 = 2 
Also, 
1! = 1 
0! = 1
*/
// import java.util.Scanner;
// public class Fun{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int num = scr.nextInt();
//         int result = Factorial(num);
//         System.out.println("Factorial of :" + num + " = " + result);
//         scr.close();
//     }
//     static int Factorial(int num){
//         int a = 1;
//         if(num == 0 || num == 1){
//             return 1;
//         }
//         for(int i=1;i<=num;i++){
//             a = a * i;
//         }
//         return a;
//     }
// }



/*
Write a function to check if a given triplet is a Pythagorean triplet or not : -
(A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number)..!
*/
// import java.util.Scanner;
// import java.lang.Math;
// public class Fun{
//     public static void main(String[] args) {
//         Scanner scr =  new Scanner(System.in);
//         System.out.print("\nEnter three numbers : ");
//         int num1 = scr.nextInt();
//         int num2 = scr.nextInt();
//         int num3 = scr.nextInt();
//         triplet(num1,num2,num3);
//         scr.close();
//     }
//     static void triplet(int num1,int num2,int num3){
//         int temp = Math.max(num1,num2);
//         int max = Math.max(num3,temp);
//         int temp1 = Math.min(num1,num2);
//         int min = Math.min(num3,temp1);
//         int min1 = 0 ;
//         if(num1 != min && num1 != max){
//             min1 = num1;
//         }
//         if(num2 != min && num2 != max){
//             min1 = num2;
//         }
//         if(num3 != min && num3 != max){
//             min1 = num3;
//         }
//         if((max*max==(min*min + min1*min1))){
//             System.out.println("\nPythagorian Triplet\n");
//         }
//         else{
//             System.out.println("\nNot pythagorian triplet\n");
//         }

//     }
// }



// prime numbers : -
// import java.util.Scanner;
// public class Fun{
//    public static void main(String[] args) {
//       Scanner scr = new Scanner(System.in);
//       System.out.print("Enter the number : ");
//       int num = scr.nextInt();
//       boolean ans = isprime(num);
//       System.out.println(ans);
//       scr.close();
//    }
//    static boolean isprime(int num){
//       if(num<=1){
//          return false;
//       }
//       int c = 2;
//       while(c*c <= num){
//          if(num % c == 0){
//             return false;
//          }
//          c++;
//       }
//       return c * c > num;
//    }
// }



// // Prime Numbers : -
// import java.util.Scanner;
// public class Fun{
//         public static void main(String[] args) {
//                 Scanner scr = new Scanner(System.in);
//                 System.out.print("Enter a number till the prime numbers you want: ");
//                 int num1 = scr.nextInt();
//                 for(int i = 1; i < num1; i++){
//                         boolean ans = isprime(i);
//                         if(ans == true){
//                                 System.out.print(i + " ");
//                         }
//                 }
//                 scr.close();
//         }
//         static boolean isprime(int num){
//                 if(num <= 1){
//                         return false;
//                 }
//                 int start = 2;
//                 while(start < num){
//                         if(num % start == 0){
//                                 return false;
//                         }
//                         start++;
//                 }
//                 return true;
//         }
// }



// // Prime numbers : -
// import java.util.Scanner;
// public class Fun{
//    public static void main(String[] args) {
//       Scanner scr = new Scanner(System.in);
//       int n = 37;
//       boolean[] isprime = new boolean[n+1];
//       prime(isprime, n);
//       scr.close();
//    }
//    static void prime(boolean[] isprime, int n){
//       for(int i = 2; i < n; i++){
//          if(!isprime[i]){
//             for(int j = i*2; j < n; j+=i){
//                isprime[j] = true;
//             }
//          }
//       }
//       for(int k = 2; k <= n; k++){
//          if(!isprime[k]){
//             System.out.print(k + " ");
//          }
//       }
//    }
// }



/*
Input:
N = 5 
A[] = {3,1,3,3,2} 
Output:
3
Explanation:
Since, 3 is present more
than N/2 times, so it is 
the majority element.

Your Task:
The task is to complete the function majorityElement() which returns the majority element in the array.
If no majority exists, return -1.
 */

// import java.util.Arrays;
// import java.util.Scanner;
// public class Fun{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {3, 1, 3, 3, 2};
//         int size = arr.length;
//         int ans = majorityElement(arr , size);
//         System.out.println(ans);
//         // System.out.println(Arrays.toString(arr));
//         scr.close();
//     }
//     static int majorityElement(int[] arr, int size){
//         int max_count = 0;
//         for(int j=0;j<size;j++){
//             int count = 0;
//             for(int i = 0; i < size; i++){
//                 if(arr[j] == arr[i]){
//                     count++;
//                 }
//             }
//             if(count > max_count){
//                 max_count = count;
//             }
//         }
//         if(max_count > size / 2){
//             return max_count;
//         }
//         else{
//             return -1;
//         }
//     }
// }



// GCD & LCM : - (Greatest common divisor & Least Common multiple)(HCF-Highest Common Factor)
// import java.util.Scanner;
// public class Fun{
//    public static void main(String[] args) {
//       Scanner scr = new Scanner(System.in);
//       System.out.println("GCD : " + GCD(150, 100));
//       System.out.print("LCM : " + LCM(150, 100));
//       scr.close();
//    }
//    static int GCD(int a, int b){
//       if(a == 0){
//          return b;
//       }
//       return GCD(b % a, a);
//    }
//    static int LCM(int a, int b){
//       return a * b / GCD(a, b);
//    }
// }



// Factors : -
// import java.util.Scanner;
// public class Fun{
//    public static void main(String[] args) {
//       Scanner scr = new Scanner(System.in);
//       System.out.print("Enter the number : ");
//       int num = scr.nextInt();
//       Factors(num);
//       scr.close();
//    }
//    static void Factors(int num){
//       for(int i = 1; i <= num; i++){
//          if(num % i == 0){
//             System.out.print(i + " ");
//          }
//       }
//    }
// }



// Square root : -
// import java.util.Scanner;
// import java.lang.Math;
// public class Fun{
//    public static void main(String[] args) {
//       Scanner scr = new Scanner(System.in);
//       System.out.print("Enter the number : ");
//       int num = scr.nextInt();
//       System.out.print(sqrt(num));
//       scr.close();
//    }
//    static double sqrt(int num){
//       double ans = Math.sqrt(num);
//       return ans;
//    }
// }



// Flipping an image : - (Google)  (Reverse all the rows and covert the 0's to 1 and vice-versa)
// public class Fun{
//    public static void main(String[] args) {
//       int[][] arr = {
//          {1, 1, 0},
//          {1, 0, 1},
//          {0, 0, 0}
//       };
//       System.out.println();
//       reverse(arr);
//    }
//    static void reverse(int[][] arr){
//       System.out.println("original array : ");
//       for(int row = 0; row < arr.length; row++){
//          System.out.print("\t\t\t");
//          for(int col = 0; col < arr[row].length; col++){
//             System.out.print(arr[row][col] + " ");
//          }
//          System.out.println();
//       }
//       for(int row = 0; row < arr.length; row++){
//          int length = arr[row].length;
//          for(int col = 0; col < length/2; col++){
//             int temp = arr[row][col];
//             arr[row][col] = arr[row][length-1-col];
//             arr[row][length-1-col] = temp;
//          }
//       }
//       System.out.println("Reverse of array : ");
//       for(int row = 0; row < arr.length; row++){
//          System.out.print("\t\t\t");
//          for(int col = 0; col < arr[row].length; col++){
//             System.out.print(arr[row][col] + " ");
//          }
//          System.out.println();
//       }
//       System.out.println("Invert of array : ");
//       for(int row = 0; row < arr.length; row++){
//          System.out.print("\t\t\t");
//          for(int col = 0; col < arr[row].length; col++){
//             arr[row][col] = arr[row][col]^1;
//             System.out.print(arr[row][col] + " ");
//          }
//          System.out.println();
//       }
//       System.out.println();
//    }
// }
