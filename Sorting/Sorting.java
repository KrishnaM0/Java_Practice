
// Inbuilt Sorting method to sort an array : -
// import java.util.Scanner;
// import java.util.Arrays;
// public class Sorting{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {5, 4, 3, 2, 1};
//         Arrays.sort(arr);
//         System.out.println(Arrays.toString(arr));
//         scr.close();
//     }
// }



// Bubble Sorting : -
// import java.util.Arrays;
// import java.util.Scanner;
// public class Sorting{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {34, 12, 1, 23, 70, 45, 56, 89, 67, 2};
//         // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//         bubble(arr);
//         System.out.println('\n' + Arrays.toString(arr) + '\n');
//         scr.close();
//     }
//     static void bubble(int[] arr){
//         boolean swapped = false;
//         for(int i = 0; i < arr.length-1; i++){
//             for(int j = 0; j < arr.length-1-i; j++){
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                     swapped = true;
//                 }
//             }
//             if(!swapped){
//              // System.out.println("break");
//                 break;
//             }
//         }
//     }
// }



// Bubble Sorting in 2D array : -
// import java.util.Scanner;
// public class Sorting{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[][] arr = {
//             {23, 12, 78, 3},
//             {13, 1, 0},
//             {78, 23, 11, 4}
//         };
//         for(int row = 0; row < arr.length; row++){
//             for(int i = 0; i < arr.length; i++){
//                 for(int col = 0; col < arr[row].length-1-i; col++){
//                     if(arr[row][col] > arr[row][col + 1]){
//                         int temp = arr[row][col];
//                         arr[row][col] = arr[row][col+1];
//                         arr[row][col+1] = temp;
//                     }
//                 }
//             }
//         }
//         for(int row = 0;row<arr.length;row++){
//             for(int col = 0;col<arr[row].length;col++){
//                 System.out.print(arr[row][col] + " ");
//             }
//             System.out.println();
//         }
//         scr.close();
//     }
// }



// // Selection sorting : -
// import java.util.Arrays;
// import java.util.Scanner;
// public class Sorting{
//     public static void main(String[] args){
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {12, 1, 45, 23, 17, 0, -1};
//         // int[] arr = {5, 4, 3, 2, 1, 0};
//         selection(arr);
//         scr.close();
//     }
//     static void selection(int[] arr){
//         int loc = -1;
//         for(int i = 0; i < arr.length - 1; i++){
//             int last = arr.length - 1-i;
//             int ans = Max(arr, last, loc);
//             swap(arr, 0, last, ans);
//         }
//         System.out.println(Arrays.toString(arr));

//     }
//     static int Max(int[] arr, int last, int loc){
//         int max = Integer.MIN_VALUE;
//         for(int i = 0; i <= last; i++){
//             if(arr[i] > max){
//                 max = arr[i];
//                 loc = i;
//             }
//         }
//         return loc;
//     }
//     static void swap(int[] arr , int start , int last, int loc){
//         int temp = arr[last];
//         arr[last] = arr[loc];
//         arr[loc] = temp;
//     }
// }



// Selection Sorting Optimized : -
// import java.util.Arrays;
// import java.util.Scanner;
// public class Sorting{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {23, 12, 1, 0, -1, 45, 11};
//         // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
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
//                 System.out.println("Break !");  //if no comparasion is happened(there is no min value) in the inner loop!
//                 break;                            //(in case of already sorted array) !
//             }
//             int temp = arr[min];
//             arr[min] = arr[i];
//             arr[i] = temp;
//         }
//     }
// }



// Insertion Sorting : -
// import java.util.Arrays;
// import java.util.Scanner;
// public class Sorting{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {34, 12, 1, -23, -1, 0, 56, -2};
//         insertion(arr);
//         System.out.print("\nThe sorted array is : ");
//         System.out.println(Arrays.toString(arr) + "\n");
//         scr.close();
//     }
//     static void insertion(int[] arr){
//         for(int i = 0; i < arr.length-1; i++){
//             for(int j = i+1; j > 0; j--){
//                 if(arr[j] < arr[j-1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j-1];
//                     arr[j-1] = temp;
//                 }
//                 else{
//                     break;
//                 }
//             }
//         }
//     }
// }



// Cycle Sorting : -
// import java.util.Arrays;
// import java.util.Scanner;
// public class Sorting{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         // int[] arr = {6, 5, 4, 3, 2, 1};
//         // int[] arr = {-1, 23, 1, 2, 4};
//         int[] arr = {2, 1, 6, 4, 5, 3};
//         Cycle(arr);
//         System.out.println();
//         System.out.println(Arrays.toString(arr));
//         scr.close();
//     }
//     static void Cycle(int[] arr){
//         int i = 0;
//         while(i < arr.length){
//             int corrrect_index = arr[i] - 1;
//             if(arr[i] < arr.length && arr[i] > 0 && arr[i] != arr[corrrect_index]){
//                 int temp = arr[i];
//                 arr[i] = arr[corrrect_index];
//                 arr[corrrect_index] = temp;
//             }
//             else{
//                 i++;
//             }
//         }
//     }
// }



// Missing number in range [0, n] : -
// import java.util.Arrays;
// import java.util.Scanner;
// public class Sorting{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {3, 0, 1};
//         // Cycle(arr);
//         System.out.println(Arrays.toString(arr));
//         System.out.println(Cycle(arr));
//         scr.close();
//     }
//     static int Cycle(int[] arr){
//         int i = 0;
//         while(i < arr.length){
//             int correct = arr[i];
//             if(arr[i] < arr.length && arr[i] != arr[correct]){
//                 int temp = arr[i];
//                 arr[i] = arr[correct];
//                 arr[correct] = temp;
//             }
//             else{
//                 i++;
//             }
//         }
//         for(int j = 0; j< arr.length; j++){
//             if(arr[j] != j){
//                 return j;
//             }
//         }
//         return -1;
//     }
// }



// Find all disapeared numbers in an array [1, n]: -
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Scanner;
// import java.util.List;
// public class Sorting{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {4, 3, 2, 7, 8, 3, 2, 1};
//         System.out.println(CycleSorting(arr));
//         System.out.println(Arrays.toString(arr));
//         scr.close();
//     }
//     static List<Integer> CycleSorting(int[] arr){
//         int i = 0;
//         while(i < arr.length){
//             int correct_index = arr[i] - 1;
//             if(arr[i] <= arr.length && arr[i] != arr[correct_index]){
//                 int temp = arr[i];
//                 arr[i] = arr[correct_index];
//                 arr[correct_index] = temp;
//             }
//             else{
//                 i++;
//             }
//         }
//         List<Integer> ans = new ArrayList<>();
//         for(int j = 0 ; j < arr.length; j++){
//             if(arr[j] != j + 1){
//                 ans.add(j+1);
//             //    System.out.print((j+1) + " ");
//             }
//         }
//         return ans;
//     }
// }



// Find all duplicate numbers in an array : -
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;
// public class Sorting{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         // int[] arr = {1, 3, 4, 2, 2};       //{1, 2, 3, 4, 2}
//         int[] arr = {4, 3, 2, 7, 8, 2, 3 , 1};
//         System.out.println(cycle(arr));
//         scr.close();
//     }
//     static List<Integer> cycle(int[] arr){
//         int i = 0;
//         while(i < arr.length){
//             int corrrect_index = arr[i] - 1;
//             if(arr[i] != arr[corrrect_index]){
//                 int temp = arr[i];
//                 arr[i] = arr[corrrect_index];
//                 arr[corrrect_index] = temp;
//             }
//             else{
//                 i++;
//             }
//         }
//         List<Integer> ans = new ArrayList<>();
//         for (int j = 0; j < arr.length; j++) {
//             if(arr[j] != j+1){
//                 // return arr[j];
//                 ans.add(arr[j]);  
//             }
//         }
//         return ans;
//     }
// }



// Find the missing & duplicate numberes in an array : -
// import java.util.Arrays;
// import java.util.Scanner;
// public class Sorting{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {2, 1, 4, 2};
//         System.out.print("The duplicate and missing numbers are : ");
//         System.out.println(Arrays.toString(cycle(arr)));
//         System.out.println(Arrays.toString(arr));
//         scr.close();
//     }
//     static int[] cycle(int[] arr){
//         int i = 0;
//         int[] ans = {-1, -1};
//         while(i < arr.length){
//             int correct = arr[i] - 1;
//             if(arr[i] != arr[correct]){
//                 int temp = arr[i];
//                 arr[i] = arr[correct];
//                 arr[correct] = temp;
//             }
//             else{
//                 i++;
//             }
//         }
//         for (int j = 0; j < arr.length; j++) {
//             if(arr[j] != j + 1){
//                 return new int[]{arr[j], j+1};
//             }
//         }
//         return ans;
//     }
// }



// First missing positive : -
// import java.util.Arrays;
// import java.util.Scanner;
// public class Sorting{
//     public static void main(String[] args){
//         Scanner scr = new Scanner(System.in);
//         // int[] arr = {3, 2, 1};
//         // int[] arr = {3, 4, -1, 1};
//         int[] arr = {7, 8, 9, 11, 12};
//         System.out.println("\nFirst missing element : " + cycle(arr));
//         System.out.println(Arrays.toString(arr));
//         scr.close();
//     }
//     static int cycle(int[] arr){
//         int i = 0;
//         while(i < arr.length){
//           //int correct = arr[i];
//             int correct = arr[i] - 1;
//             if(arr[i] <= arr.length && arr[i] > 0 && arr[i] != arr[correct]){
//                 int temp = arr[i];
//                 arr[i] = arr[correct];
//                 arr[correct] = temp;
//             }
//             else{
//                 i++;
//             }
//         }
//         for(int j = 0; j < arr.length; j++){
//             if(arr[j] != j + 1){
//                 return j + 1;
//             }
//         }
//         return arr.length + 1;
//     }
// }



// Merge Sorting (Storing the ans in new array - [No change in the existing array] ): -
// import java.util.Arrays;
// import java.util.Scanner;
// public class Sorting{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {5, 4, 3, 2, 1};
//         int[] ans = mergeSort(arr);
//         System.out.println(Arrays.toString(ans));
//         scr.close();
//     }
//     static int[] mergeSort(int[] arr){
//         if(arr.length == 1){
//             return arr;
//         }
//         int mid = arr.length / 2;
//         int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
//         int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
//         return merge(left, right);
//     }
//     static int[] merge(int[] first, int[] second){
//         int[] mix = new int[first.length + second.length];
        
//         int i = 0;
//         int j = 0;
//         int k = 0;
//         while(i < first.length && j < second.length){
//             if(first[i] < second[j]){
//                 mix[k] = first[i];
//                 i++;
//             }
//             else{
//                 mix[k] = second[j];
//                 j++;
//             }
//             k++;
//         }
//         while(i < first.length){
//             mix[k] = first[i];
//             i++;
//             k++;
//         }
//         while(j < second.length){
//             mix[k] = second[j];
//             j++;
//             k++;
//         }
//         return mix;
//     }
// }



// Merge Sorting optimized (Inplace = without creating new array) : -
// import java.util.Arrays;
// import java.util.Scanner;
// public class Sorting{
//     public static void main(String[] args)
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {5, 4, 3, 2, 1};
//         int start = 0;
//         int end = arr.length;
//         mergesorting(arr, start, end);
//         System.out.println(Arrays.toString(arr));
//         scr.close();
//     }
//     static void mergesorting(int[] arr, int start, int end){
//         if(end - start == 1){
//             return;
//         }
//         int mid = start + (end - start) / 2;
//         mergesorting(arr, 0, mid);
//         mergesorting(arr, mid, end);
//         mergeInplace(arr, start, mid, end);
//     }
//     static void mergeInplace(int[] arr, int start, int mid, int end){
//         int[] mix = new int[end - start];
//         int i = start;
//         int j = mid;
//         int k = 0;
//         while(i < mid && j < end){
//             if(arr[i] < arr[j]){
//                 mix[k] = arr[i];
//                 i++;
//             }
//             else{
//                 mix[k] = arr[j];
//                 j++;
//             }
//             k++;
//             while(i < mid){
//                 mix[k] = arr[i];
//                 i++;
//                 k++;
//             }
//             while(j < end){
//                 mix[k] = arr[j];
//                 j++;
//                 k++;
//             }
//         }
//         for(int l = 0; l < mix.length; l++){
//             arr[start + l] = mix[l];
//         }
//     }
// }



// Quick Sorting : -
// import java.util.Arrays;
// import java.util.Scanner;
// public class Sorting{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int[] arr = {5, 4, 3, 2, 1};
//         Quick(arr, 0, arr.length-1);
//         System.out.println(Arrays.toString(arr));
//         scr.close();
//     }
//     static void Quick(int[] arr, int low, int high){
//         if(low >= high){
//             return;
//         }
//         int start = low;
//         int end = high;
//         int mid = start + (end - start) / 2;
//         int pivot = arr[mid];
//         while(start <= end){
//             while(arr[start] < pivot){
//                 start++;
//             }
//             while(arr[end] > pivot){
//                 end--;
//             }
//             if(start <= end){
//                 int temp = arr[start];
//                 arr[start] = arr[end];
//                 arr[end] = temp;
//                 start++;
//                 end--;
//             }
//         }
//         Quick(arr, low, end);
//         Quick(arr, start, high);
//     }
// }
