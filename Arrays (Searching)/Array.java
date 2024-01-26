
//Linear Search in Int values : -
// import java.util.Scanner;
// public class Array{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] nums = new int[6];
//         System.out.print("\nEnter the numbers : ");
//         for(int i=0;i<nums.length;i++){
//             nums[i] = scr.nextInt();
//         }
//         System.out.print("Enter the search element : ");
//         int search = scr.nextInt();
//         for(int j=0;j<nums.length;j++){
//             if(nums[j]==search){
//                 System.out.println("The search element found..");
//             }
//         }
//         scr.close();
//     }
// }



// // Linear Search in string : -
// import java.util.Arrays;
// import java.util.Scanner;
// public class Array{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         String[] str = new String[4];
//         System.out.print("Enter the string element : ");
//         for (int i = 0; i < str.length; i++) {
//             str[i] = scr.next();
//         }
//         System.out.println(Arrays.toString(str));
//         System.out.print("Enter the search element : ");
//         String search = scr.next();
//         boolean found = false;
//             for (int i = 0; i < str.length; i++) {
//                 if(str[i].equals(search)){
//                     System.out.println("Element is found : " + str[i]);
//                     found = true;
//                     break;
//                 }
//             }
//         if(!found){
//                 System.out.println("Element not found..!");
//             }
//         scr.close();
//     }
// }



// //maximum value of an array : -
// import java.util.Arrays;
// import java.util.Scanner;
// public class Array{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = new int[5];
//         // int[] arr = {23,1,24,2,3,44};
//         int max = 0;
//         System.out.print("Enter the numbers : ");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = scr.nextInt();
//         }
//         System.out.print("In string format : " + Arrays.toString(arr));
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i]>max) {
//                 max = arr[i];
//             }
//         }
//         System.out.print("\nThe max value is : " + max);
//         scr.close();
//     }
// }



// // Reversing an arrray : -
// import java.util.Arrays;
// import java.util.Scanner;
// public class Array{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         System.out.print("Enter the strings : ");
//         String[] str = new String[6];
//         for (int i = 0; i < str.length; i++) {
//             str[i] = scr.next();
//         }
//         // for (int i=str.length-1;i>=0;i--){
//         //     System.out.print(str[i] + " ");
//         // }
//         int start = 0;
//         int end = str.length-1;
//         while(start<end){
//             String temp = str[start];
//             str[start] = str[end];
//             str[end] = temp;
//             start++;
//             end--;
//         }
//         System.out.println(Arrays.toString(str));
//         scr.close();
//     }
// }



// //Swaping the elements in an array : -
// import java.util.Arrays;
// import java.util.Scanner;
// public class Array{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         System.out.print("\nEnter Fruit names : ");
//         String[] str = new String[5];
//         for (int i = 0; i < str.length; i++) {
//             str[i] = scr.next();
//         }
//         System.out.println(Arrays.toString(str));
//         System.out.println("\nEnter the indexes to swap the positons : ");
//         System.out.print("\tIndex 1 : ");
//         int snum1 = scr.nextInt();
//         System.out.print("\tIndex 2 : ");
//         int snum2 = scr.nextInt();
//         swap(str , snum1 , snum2);
//         scr.close();
//     }
//     static void swap(String[] str , int snum1 , int snum2){
//         String temp = str[snum1];
//         str[snum1] = str[snum2];
//         str[snum2] = temp;
//         System.out.println(Arrays.toString(str)); 
//     }
// }



// // Search in range : -
// import java.util.Scanner;
// public class Array{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {23,34,45,56,2};
//         int search = 56;
//         searchR(arr, 1, 3 , search);
//         scr.close();
//     }
//     static void searchR(int[] arr , int start, int end, int search){
//         for (int i = start; i <= end; i++) {
//             if(arr[i] == search){
//                 System.out.println("Element found..");
//             }
//         }
//     }
// }



// // Search in 2D : -
// import java.util.Scanner;
// public class Array{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[][] arr = new int[3][2];
//         System.out.print("Enter the numbers[3][2] : ");
//         for(int row=0;row<3;row++){
//             for(int col=0;col<2;col++){
//                 arr[row][col] = scr.nextInt();
//             }
//         }
//         boolean found = false;
//         System.out.print("Enter the search element : ");
//         int search = scr.nextInt();
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 if(arr[i][j] == search){
//                     System.out.print("\nNumber found : " + arr[i][j]);
//                     found = true;
//                 }
//             }
//         }
//         if(!found){
//             System.out.println("\nElement not found..!");
//         }
//         scr.close();
//     }
// }



// // Find numbers with even numbers of digits : -
// // {05 , 12, 234 , 6789} == 12 & 6789 having even number digits(2 & 4)..!
// import java.util.Scanner;
// public class Array{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {5 , 12 , 234 , 6789 , -4563};
//         System.out.println(iseven(arr));
//         scr.close();
//     }
//     static int iseven(int[] arr){
//         int count = 0;
//         for (int num : arr) {
//             int ans = digit(num);
//             if(ans % 2 == 0 ){
//                 // System.out.print(num + " ");
//                 count++;
//             }
//         }
//         return count;
//     }
//     static int digit(int num){
//         if(num < 0){
//             num = num * -1;
//         }
//         return (int)(Math.log10(num))+1; //for returning the number of digits..
//         // int count = 0;
//         // while(num > 0){
//         //         count++;
//         //         num = num / 10;
//         // }
//         // return count;
//     }
// }



// // Max wealth : -
// import java.util.Scanner;
// public class Array{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[][] accounts = {
//             {1,2,3,4},
//             {3,4,5},
//             {6,7,8,9,10}
//         };
//         System.out.println("\nThe richest person's wealth is : " + wealth(accounts) + '\n');
//         scr.close();
//     }
//     static int wealth(int[][] accounts){
//         int count = 0;
//         int ans = Integer.MIN_VALUE;
//         System.out.println();
//         for (int person = 0; person < accounts.length; person++) {
//             int sum = 0;
//             for(int account = 0;account<accounts[person].length;account++){
//                 sum = sum + accounts[person][account];
//             }
//             count++;
//             System.out.println(count + ". Person" + " wealth is : " + sum);
//             if(sum>ans){
//                 ans = sum;
//             }
//         }
//         return ans;
//     }
// }



// // Binary Search : -
// import java.util.Scanner;
// public class Array{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {12 , 23 , 34 , 45 , 56 , 67};
//         int target = 67;
//         System.out.print("\nAt position : " + search(arr , target));
//         scr.close();
//     }
//     static int search(int[] arr , int target){
//         int start = 0;
//         int end = arr.length - 1;
//         while(start <= end){
//             int mid = start + (end - start) / 2;
//             if(arr[mid] == target){
//                 return mid;
//             }
//             if(arr[mid] < target){
//                 start = mid + 1;
//             }
//             if(arr[mid] > target){
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }
// }



// // Order-Agnostic Binary search : -
// import java.util.Arrays;
// import java.util.Scanner;
// public class Array{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = { -25 , -13 , 0 , 12 , 23 , 34 , 78 , 89 };
//         System.out.println();
//         // int[] arr = { 98 , 87 , 76 , 65 , 54 , 0 , -23 , -34 };
//         System.out.println(Arrays.toString(arr));
//         System.out.print("\nEnter the search element : ");
//         int target = scr.nextInt();
//         int ans = searchB(arr, target);
//         System.out.print("At position : " + ans);
//         scr.close();
//     }
//     static int searchB(int[] arr , int target){
//         int start = 0;
//         int end = arr.length - 1;
//         boolean isAsc = arr[start] < arr[end];
//         while(start <= end){
//             int mid = start + (end - start) / 2;
//             if(isAsc == true){
//                 if(arr[mid] == target){
//                     return mid;
//                 }
//                 if(arr[mid] < target){
//                     start = mid + 1;
//                 }
//                 if(arr[mid] > target){
//                     end = mid - 1;
//                 }
//             }
//             else{
//                 if(arr[mid] == target){
//                     return mid;
//                 }
//                 if(arr[mid] > target){
//                     start = mid + 1;
//                 }
//                 if(arr[mid] < target){
//                     end = mid - 1;
//                 }
//             }
//         }
//         return -1;
//     }
// }



/*
Find from the array : -
Floor   : - greatest number smaller than the target number(or equal to)...
Ceiling : - smallest number greater than the target number(or equal to)...
*/
// import java.util.Arrays;
// import java.util.Scanner;
// public class Array{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {12,23,34,45,56,67};
//         System.out.println(Arrays.toString(arr));
//         System.out.print("Enter the target element : ");
//         int target = scr.nextInt();
//         System.out.println(search(arr , target));
//         scr.close();
//     }
//     static int search(int[] arr , int target){
//         int start = 0;
//         int end = arr.length - 1;
//         while(start <= end){
//             int mid = start + (end - start) / 2;
//             if(target == arr[mid]){
//                 return arr[mid];
//             }
//             if(target < arr[mid]){
//                end = mid - 1;
//             }
//             if(target > arr[mid]){
//                 start = mid + 1;
//             }
//         }

//     return arr[end];     //Floor
//  // return arr[start];  //Ceiling 
//     }
// }



// Ceiling in characters : - Smallest element greater than the target element..
// import java.util.Arrays;
// import java.util.Scanner;
// public class Array{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         char[] letters = {'c','f','j','l','o','q','t','x'};
//         for (int i = 0; i < 4; i++) {
//             System.out.print('\n' + Arrays.toString(letters) + "\nEnter the target char : ");
//             char target = scr.next().charAt(0);
//             System.out.println(ceiling(letters, target));
//         }
//         scr.close();
//     }
//     static char ceiling(char[] letters, char target){
//         int start = 0;
//         int end = letters.length - 1;
//         while(start <= end){
//             int mid = start + (end - start) / 2;
//             if(target == letters[mid] && target != letters[letters.length-1] ){
//                 return letters[mid+1];
//             }
//             if(target == letters[letters.length-1]){
//                 return letters[start];
//             }
//             if(target > letters[mid]){
//                 start = mid + 1;
//             }
//             else{
//                 end = mid - 1;
//             }
//         }
//         return letters[start % letters.length];
//     }
// }



// First & Last position in sorted array : -
// import java.util.Arrays;
// import java.util.Scanner;
// public class Array{
//     public static void main(String[] args){
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {1 ,7 ,7, 7, 8, 8, 8, 12, 12};
//         // int[] arr = {};    
//         System.out.println("\n" + Arrays.toString(arr));
//         System.out.print("\nEnter the target element : ");
//         int target = scr.nextInt();
//         int[] ans = {-1, -1};
//         ans[0] = search(arr,target,true);
//         if(ans[0] != -1){
//             ans[1] = search(arr,target,false);
//         }
//         System.out.println(Arrays.toString(ans));
//         scr.close();
//     }
//     static int search(int[] arr, int target, boolean FindStartIndex){
//         int start = 0;
//         int end = arr.length - 1;
//         int ans = -1;
//         while(start <= end){
//             int mid = start + (end - start) / 2;
//             if(target < arr[mid]){
//                 end = mid - 1;
//             }
//             if(target > arr[mid]){
//                 start = mid + 1;
//             }
//             if(target == arr[mid]){
//                 ans = mid;
//                 if(FindStartIndex){
//                     end = mid - 1;
//                 }
//                 else{
//                     start = mid + 1;
//                 }
//             }
//         }
//         return ans;
//     }
// }



//position of an element in infinite sorted array : -
// import java.util.Scanner;
// public class Array{
//     public static void main(String[] args) {
        
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {12, 23, 34, 45, 56, 67, 78, 89, 90, 102, 112, 234};
//         int target = 56;
//         System.out.println(ans(arr , target));
//         scr.close();
//     }
//     static int ans(int[] arr , int target){
//         int start = 0;
//         int end = 1;
//         while(target > arr[end]){
//             int temp = end + 1;
//             end = end + (end - start + 1) * 2;
//             start = temp;
//         }
//         return search(arr, target, start, end);
//     }
//     static int search(int[] arr, int target, int start, int end){
//         while(start <= end){
//             int mid = start + (end - start) / 2;
//             if(target > arr[mid]){
//                 start = mid + 1;
//             }
//             if(target < arr[mid]){
//                 end = mid - 1;
//             }
//             if(target == arr[mid]){
//                 return mid;
//             }
//         }
//         return -1;
//     }
// } 



// Peak index in mountain array : -
// import java.util.Arrays;
// import java.util.Scanner;
// public class Array{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {2, 4, 5, 6, 8, 10, 9, 7, 3, 1};
//         System.out.println();
//         System.out.println(Arrays.toString(arr));
//         System.out.print("\nThe peak element is : ");
//         System.out.println(peak(arr));
//         scr.close();
//     }
//     static int peak(int[] arr){
//         int start = 0;
//         int end = arr.length - 1;
//         while(start < end){
//             int mid = start + (end - start) / 2;
//             if(arr[mid] > arr[mid+1]){
//                 end = mid;
//             }
//             else{
//                 start = mid + 1;
//             }
//         }
//         return arr[end];
//         // return end or start because, both were pointing to the same number at the end of the loop...  
//     }
// }



// //search in mountain array : -
// import java.util.Scanner;
// public class Array{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {2, 4, 5, 6, 8, 10, 9, 7, 3, 1};
//         System.out.println("Enter the search element : ");
//         int target = scr.nextInt();
//         int ans;
//         ans = search(arr , target , true);
//         if(ans == -1){
//             ans = search(arr , target , false);
//         }
//         System.out.print("Position of element : " + ans);
//         scr.close();
//     }
//     static int search(int[] arr , int target , boolean found){
//         int ans = peak(arr);
//         int start = 0;
//         if(found == true){
//             while(start <= ans){
//                 int mid = start + (ans - start) / 2;
//                 if(target == arr[mid]){
//                     return mid;
//                 }
//                 if(target > arr[mid]){
//                     start = mid + 1;
//                 }
//                 if(target < arr[mid]){
//                     ans = mid - 1;
//                 }
//             }
//         }
//         else{
//             int end = arr.length - 1;
//             start = ans + 1;
//             while(start <= end){
//                 int mid = start + (end - start) / 2;
//                 if(target == arr[mid]){
//                     return mid;
//                 }
//                 if(target > arr[mid]){
//                     end = mid - 1;
//                 }
//                 if(target < arr[mid]){
//                     start = mid + 1;
//                 }

//             }
//         }
//         return -1;
//     }
//     static int peak(int[] arr){
//         int start = 0;
//         int end = arr.length - 1;
//         while(start < end){
//             int mid = start + (end - start) / 2;
//             if(arr[mid] > arr[mid+1]){
//                 end = mid;
//             }
//             else{
//                 start = mid + 1;
//             }
//         }
//         return end;
//     }
// }



// // Binary search in 2D array : -
// import java.util.Arrays;
// import java.util.Scanner;
// public class Array{
//     public static void main(String[] args) {
//         Scanner scr  = new Scanner(System.in);
//         int[][] arr = {
//             {2, 3, 4, 5},
//             {6, 7, 8, 9, 10},
//             {11, 12, 34, 45, 56, 67, 78},
//             {79, 89, 90, 100, 101}
//         };
//         System.out.print("\nEnter the target element : ");
//         int target = scr.nextInt();
//         System.out.println("\nPostiton of an element : " + Arrays.toString(search(arr , target)) + '\n');
//         scr.close();
//     }
//     static int[] search(int[][] arr , int target){
//         int[] ans = {-1, -1}; 
//         for(int row=0;row<arr.length;row++){
//             for(int col=0;col<arr[row].length;col++){
//                 int start = 0;
//                 int end = arr[row].length-1;
//                 // int[] ans = {-1, -1};
//                 while(start <= end){
//                     int mid = start + (end - start) / 2;
//                     if(target == arr[row][mid]){
//                         return new int[]{row,mid};
//                     }
//                     if(target < arr[row][mid]){
//                         end = mid - 1;
//                     }
//                     if(target > arr[row][mid]){
//                         start = mid + 1;
//                     }
//                 }
//             }
//         }
//         return ans;
//     }
// }



// Binary search in 2D Array optimized : -(Sorted row/column-vise)
// import java.util.Scanner;
// import java.util.Arrays;
// public class Array {
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[][] arr = {
//             {23, 34, 45},
//             {24, 35, 46},
//             {25, 36, 47}
//         };
//         System.out.print("\nEnter the target element : ");
//         int target = scr.nextInt();
//         System.out.println("\nPosition of an element : " + Arrays.toString(search(arr, target)) + '\n');
//         scr.close();
//     }

//     static int[] search(int[][] arr, int target) {
//         int[] ans = {-1, -1};
//         int row = 0;
//         int col = arr[0].length - 1;
        
//         while (row < arr.length && col >= 0) {
//             if (target == arr[row][col]) {
//                 ans[0] = row;
//                 ans[1] = col;
//                 return ans;
//             } else if (target < arr[row][col]) {
//                 col--; // Move left in the current row
//             } else {
//                 row++; // Move down to the next row
//             }
//         }
//         return ans;
//     }
// }



// Reverse an array : -
// import java.util.Arrays;
// import java.util.Scanner;
// public class Array{
//    public static void main(String[] args) {
//       Scanner scr = new Scanner(System.in);
//       int[] arr = {12, 23, 45, 56, 67, 78, 89};
//       reverse(arr);
//       scr.close();
//    }
//    static void reverse(int[] arr){
//       int end = arr.length;
//       for(int i = 0; i < end/2; i++){
//          int temp = arr[i];
//          arr[i] = arr[end-1-i];
//          arr[end-1-i] = temp;
//       }
//       System.out.print(Arrays.toString(arr));
//    }
// }



// Reverse an 2D array : -
// import java.util.Scanner;
// public class Array{
//    public static void main(String[] args) {
//       Scanner scr = new Scanner(System.in);
//       int[][] arr = {
//          {12, 23, 34, 45},
//          {56 ,67, 78 ,89}
//       };
//       reverse(arr);
//       scr.close();
//    }
//    static void reverse(int[][] arr){
//       for(int row = 0; row < arr.length; row++){
//          int length = arr[row].length;
//          for(int col = 0; col < length/2; col++){
//             int temp = arr[row][col];
//             arr[row][col] = arr[row][length-1-col];
//             arr[row][length-1-col] = temp;
//          }
//       }
//       for(int row = 0; row < arr.length; row++){
//          for(int col = 0; col < arr[row].length; col++){
//             System.out.print(arr[row][col] + " ");
//          }
//          System.out.println();
//       }
//    }
// }
