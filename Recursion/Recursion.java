
//Printing(statement) using recursion : -
// public class Recursion {
//     public static void main(String[] args) {
//         print(1);
//     }    
//     static void print(int n){
//         if(n == 5){
//             return;
//         }
//         System.out.println("Hello World");
//         print(n+1);
//     }
// }



// Linear Search using recursion : -
// import java.util.Scanner;
// public class Recursion{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {12, 23, 45, 24, 47, 67, 78, 89};
//         int i = 0;
//         System.out.println(search(arr, i));
//         scr.close();
//     }
//     static int search(int[] arr, int i){
//         int target = 89;
//         if(i >= arr.length){
//             return -1;
//         }
//         if(target == arr[i]){
//             return i;
//         }
//         return search(arr, i+1);
//     }
// }



//Binary Search using recursion : -
// public class Recursion{
//     public static void main(String[] args) {
//         int[] arr = {12, 23, 34, 45, 56, 67, 88};
//         int target = 67;
//         int start = 0;
//         int end = arr.length - 1;
//         int ans = search(arr, target, start, end);
//         System.out.println(ans);
//     }
//     static int search(int[] arr, int target, int start, int end){
//         if(start > end){
//             return -1;
//         }
//         int mid = start + (end - start) / 2;
//         if(target == arr[mid]){
//             return mid;
//         }
//         if(target > arr[mid]){
//             return search(arr, target, mid+1, end);
//         }
//         return search(arr, target, start, mid-1);
//     }
// }



// // Print N to 1 numbers : -
// import java.util.Scanner;
// public class Recursion{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int num = scr.nextInt();
//         Nto1(num);
//         scr.close();
//     }
//     static void Nto1(int num){
//         if(num == 0){
//             return;
//         }
//         System.out.println(num);
//         Nto1(num-1);
//     }
// }



// Print 1 to N numbers : -
// import java.util.Scanner;
// public class Recursion{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int num = scr.nextInt();
//         Print1toN(num);
//         scr.close();
//     }
//     static void Print1toN(int num){
//         if(num == 0){
//             return;
//         }
//         Print1toN(num-1);
//         System.out.println(num);
//     }
// }



// // Product of N to 1 : -
// import java.util.Scanner;
// public class Recursion{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int num = scr.nextInt();
//         System.out.println(Product(num));
//         scr.close();
//     }
//     static int Product(int num){
//         if(num == 1){
//             return 1;
//         }
//         return num * Product(num-1);
//     }
// }



// Product of digits : -
// import java.util.Scanner;
// public class Recursion{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int num = 123456;
//         System.out.println(prod(num));
//         scr.close();
//     }
//     static int prod(int num){
//         if(num / 10 == 0){
//             return num;
//         }
//         int rem = num % 10;
//         return rem * prod(num / 10);
//     }
// }



// Reverse a number : -
// import java.util.Scanner;
// public class Recursion{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int num = 540321;
//         System.out.println(Reverse(num));
//         scr.close();
//     }
//     // static String Reverse(int num){
//     static int Reverse(int num){
//         if(num / 10 == 0){
//             // return num + "";
//             return num;
//         }
//         int rem = num % 10;
//         int count = (int)(Math.log10(num) + 1);
//         return rem * (int)(Math.pow(10, count-1)) + Reverse(num/10);

//         // return rem + "" + Reverse(num/10);
//     }
// }



// Find the number is Palindrom or not? : -
// import java.util.Scanner;
// public class Recursion{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int num = 1234321;
//         int ans = Reverse(num);
//         System.out.println(Palindrom(num, ans));
//         scr.close();
//     }
//     static int Reverse(int num){
//         if(num / 10 == 0){
//             return num;
//         }
//         int rem = num % 10;
//         int count = (int)(Math.log10(num) + 1);
//         return rem * (int)(Math.pow(10, count-1)) + Reverse(num / 10);
//     }
//     static boolean Palindrom(int num, int ans){
//         if(num == ans){
//             return true;
//         }
//         return false;
//     }
// }



// Count zeros in a number : -
// import java.util.Scanner;
// public class Recursion{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int num = 10240600;
//         int count = 0;
//         System.out.println(Count0s(num, count));
//         scr.close();
//     }
//     static int Count0s(int num, int count){
//         if(num / 10 == 0){
//             return count;
//         }
//         if(num % 10 == 0){
//             return Count0s(num / 10, count+1);
//         }
//         return Count0s(num / 10, count);
//     }
// }



// Count steps : -
// import java.util.Scanner;
// public class Recursion{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int num = 14;
//         int count = 0;
//         System.out.println(Count_steps(num, count));
//         scr.close();
//     }
//     static int Count_steps(int num, int count){
//         if(num == 0){
//             return count;
//         }
//         if(num % 2 == 0){
//             return Count_steps(num / 2, count + 1);
//         }
//         return Count_steps(num - 1, count + 1);
//     }
// }



// Sorted Array or not?..using Recursion : -
// import java.util.Scanner;
// public class Recursion{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {12, 23, 24, 45, 56, 67};
//         int i = 0;
//         System.out.println(isSorted(arr, i));
//         scr.close();
//     }
//     static boolean isSorted(int[] arr, int i){
//         if(i == arr.length-1){
//             return true;
//         }
//         return arr[i] < arr[i+1] && isSorted(arr, i+1);
//     }
// }



// Linear Search on multiple occurences : -
// import java.util.ArrayList;
// import java.util.Scanner;
// public class Recursion{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {1, 2, 2 ,45, 4, 5, 4};
//         int i = 0, target = 4;
//         search(arr, target, i);
//         System.out.println(list);
//         scr.close();
//     }
//     static ArrayList<Integer> list = new ArrayList<>();
//     static void search(int[] arr, int target, int i){
//         if(i >= arr.length){
//             return;
//         }
//         if(target == arr[i]){
//             list.add(i);
//         }
//         search(arr, target, i+1);
//     }
// }



// Linear search using recursion and returning an ArrayList : -
// import java.util.ArrayList;
// import java.util.Scanner;
// public class Recursion{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {1, 2, 2, 45, 4, 5, 4};
//         int i = 0, target = 4;
//         ArrayList<Integer> list = new ArrayList<>();
//         System.out.println(FindallIndex(arr, target, i, list));
//         scr.close();
//     }
//     static ArrayList FindallIndex(int[] arr, int target, int i, ArrayList<Integer> list){
//         if(i >= arr.length){
//             return list;
//         }
//         if(target == arr[i]){
//             list.add(i);
//         }
//         return FindallIndex(arr, target, i+1, list);
//     }
// }



// Return the list without passing the argument : -   (Linear Search on multiple occurences)
// import java.util.ArrayList;
// import java.util.Scanner;
// public class Recursion{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {12, 23 ,3, 2, 3, 6, 6};
//         int target = 6;
//         int i = 0;
//         System.out.println(linear(arr, target, i));
//         scr.close();
//     }
//     static ArrayList<Integer> linear(int[] arr, int target, int i){
//         ArrayList<Integer> list = new ArrayList<>();
//         if(i == arr.length){
//             return list;
//         }
//         if(target == arr[i]){
//             list.add(i);
//         }
//         ArrayList<Integer> ansFromBelowCall = linear(arr, target, i+1);
//         list.addAll(ansFromBelowCall);
//         return list;
//     }
// }



// Rotated Binary Search using Recursion : -
// import java.util.Scanner;
// public class Recursion{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {5, 6, 7, 8, 9, 10, 12, 23, 45, 2, 3, 4};
//         int target = 3;
//         int start = 0;
//         int end = arr.length-1;
//         System.out.println(search(arr, target, start, end));
//         scr.close();
//     }
//     static int search(int[] arr, int target, int start, int end){
//         int mid = start + (end - start) / 2;
//         while(arr[mid] < arr[mid+1]){
            
//                 mid = mid + 1;

//         }
//         if(target >= arr[0] && target <= arr[mid]){
//                 start = 0;
//                 end = mid;
//             }
//             else{
//                 start = mid + 1;
//                 end = arr.length-1;
//             }
//         while(start <= end){
//             mid = start + (end - start) / 2;
//             if(target == arr[mid]){
//                 return mid;
//             }
//             if(target > arr[mid]){
//                 start = mid + 1;
//             }
//             else{
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }
// }



// Triangle1 pattern using recursion : -
// import java.util.Scanner;
// public class Recursion{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int row = 5;
//         int col = 0;
//         System.out.println();
//         pattern(row, col);
//         scr.close();
//     }
//     static void pattern(int row, int col){
//         if(row < 0){
//             return;
//         }
//         if(col < row){
//             System.out.print("* ");
//             pattern(row, col+1);
//         }
//         else{
//             System.out.println();
//             pattern(row-1, 0);
//         }
//     }
// }



// Triangle2 pattern using recursion : -
// import java.util.Scanner;
// public class Recursion{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int row = 5;
//         int col = 0;
//         pattern(row, col);
//         scr.close();
//     }
//     static void pattern(int row, int col){
//         if(row < 0){
//             return;
//         }
//         if(col < row){
//             pattern(row, col+1);
//             System.out.print("* ");
//         }
//         else{
//             pattern(row-1, 0);
//             System.out.println();
//         }
//     }
// }



// Bubble sorting using recursion : -
// import java.util.Arrays;
// import java.util.Scanner;
// public class Recursion {
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {12, 1, 34, 23, 3, 35};
//         BubbleSort(arr, arr.length);
//         System.out.println(Arrays.toString(arr));
//         scr.close();
//     }
//     static void BubbleSort(int[] arr, int n) {
//         if (n == 1) {
//             return;
//         }
//         for (int i = 0; i < n - 1; i++) {
//             if (arr[i] > arr[i + 1]) {
//                 int temp = arr[i];
//                 arr[i] = arr[i + 1];
//                 arr[i + 1] = temp;
//             }
//         }
//         BubbleSort(arr, n - 1);
//     }
// }



// Slection sorting using recursion : -
// import java.util.Arrays;
// import java.util.Scanner;
// public class Recursion{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         // int[] arr = {23, 1, 25, 2, 56, 3};
//         int[] arr = {12, 1, 34, 23, 3, 35};
//         selection(arr);
//         System.out.println(Arrays.toString(arr));
//         scr.close();
//     }
//     static void selection(int[] arr){
//         boolean ismin = false;
//         for(int i = 0; i < arr.length-1; i++){
//             int min = i;
//             for(int j = i+1; j < arr.length; j++){
//                 if(arr[j] < arr[min]){
//                     min = j;
//                     ismin = true;
//                 }
//             }
//             if(!ismin){
//                 System.out.println("Break");
//                 break;
//             }
//             int temp = arr[min];
//             arr[min] = arr[i];
//             arr[i] = temp;
//         }
//     }
// }



// Selection sorting using recursion : -
// import java.util.Arrays;
// import java.util.Scanner;
// public class Recursion{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {23, 1, 25, 2, 56, 3};
//         int i = 0;
//         selection(arr, i);
//         System.out.println(Arrays.toString(arr));
//         scr.close();
//     }
//     static void selection(int[] arr, int i){
//         int min = i;
//         if(i >= arr.length-1){
//             return;
//         }
//         for(int j = i+1; j < arr.length; j++){
//             if(arr[j] < arr[min]){
//                 min = j;
//             }
//         }
//         int temp = arr[i];
//         arr[i] = arr[min];
//         arr[min] = temp;
//         selection(arr, i+1);
//     }
// }
