
/* Pattern Questions : -
1.  *****
    *****
    *****
    *****
    *****
*/
// import java.util.Scanner;
// public class Pattern{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         int n = 5;
//         for(int i = 0; i < n;i++){
//             for(int j = 0; j < n; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         scr.close();
//     }
// }



/*
 2. *
    **
    ***
    ****
    *****
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int n = 5;
//         for(int row = 0;row < n;row++){
//             for(int col = 0;col <= row;col++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



/*
  3.*****
    ****
    ***
    **
    *
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int n = 5;
//         for(int row = 0; row < 5;row++){
//             for(int col = 0;col < n-row;col++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



/*
 4. 1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int n = 5;
//         for(int row = 1; row <= n; row++){
//             for(int col = 1; col <= row; col++){
//                 System.out.print(col + " ");
//             }
//             System.out.println();
//         }
//     }
// }



/*
 5. *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int n = 5;
//         for(int row = 0; row < n*2; row++){
//             int c = row >= n ? (2*n-1)-1-row : row;
//             for(int col = 0; col <= c; col++){
//                 System.out.print("x ");
//             }
//             System.out.println();
//         }
//     }
// }



/*
 6.      *
        **
       ***
      ****
     *****
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int n = 5;
//         int s;
//         for(int row = 0; row < n; row++){
//             for(s = 0; s < n-1-row; s++){
//                 System.out.print("  ");
//             }
//             for(int col = s; col < n; col++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



/*
 7.  *****
      ****
       ***
        **
         *
*/
// public class Pattern{
//     public static void main(String[] args) {
//         int n = 5;
//         int s;
//         for(int row = 0; row < n; row++){
//             for(s = 0; s < row; s++){
//                 System.out.print(" ");
//             }
//             for (int col = s; col < n; col++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



/*
 8.     *
       ***
      *****
     *******
    *********
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int n = 5;
//         int s;
//         int col;
//         for(int row = 0; row < n; row++){
//             for(s = 0; s < n-1-row; s++){
//                 System.out.print(" ");
//             }
//             for(col = s; col < n; col++){
//                 System.out.print("*");
//             }
//             for(int i = col; i < n+row;i++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



/*
 9. *********
     *******
      *****
       ***
        *
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int n = 5;
//         int s, col;
//         System.out.println();
//         for(int row = 0; row < n; row++){
//             for(s = 0; s < row; s++){
//                 System.out.print(" ");
//             }
//             for(col = s; col < n; col++){
//                 System.out.print("*");
//             }
//             for(int i = col; i < n*2-1-row; i++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



/*
 10.     *
        * *
       * * *
      * * * *
     * * * * *
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int s, n = 5;
//         for(int row = 0; row < n; row++){
//             for(s = 0; s < n-1-row; s++){
//                 System.out.print(" ");
//             }
//             for(int col = s; col < n; col++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



/*
 11. * * * * *
      * * * *
       * * *
        * *
         *
*/
// public class Pattern{
//     public static void main(String[] args) {
//         int s, n = 5;
//         for(int row = 0; row < n; row++){
//             for(s = 0; s < row; s++){
//                 System.out.print(" ");
//             }
//             for(int col = s; col < n; col++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



/*
12.  * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int s, n = 5;
//         for(int row = 0; row < n*2; row++){
//             int c = row >= n ? 2*n-1-row : row;
//             for(s = 0; s < c; s++){
//                 System.out.print(" ");
//             }
//             for(int col = s; col < n; col++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



/*
 13.     *
        * *
       *   *
      *     *
     *********
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int s, n = 5;
//         for(int row = 1; row < n; row++){
//             for(s = 1; s <= n-row; s++){
//                 System.out.print(" ");
//             }
//             for(int col = 1; col <= row*2; col++){
//                 if(col == 1 || col == row*2-1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }

//             }
//             System.out.println();
//         }
//         for(int i = 0; i < n*2-1; i++){
//             System.out.print("*");
//         }
//     }
// }



/*
 14. *********
      *     *
       *   *
        * *
         *
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int s, n = 5;
//         for (int i = 0; i < n*2-1; i++) {
//             System.out.print("*");
//         }
//         for(int row = 0; row < n; row++){
//             for(s = 0; s < row; s++){
//                 System.out.print(" ");
//             }
//             for(int col = s; col < n*2-1; col++){
//                 if(col == s || col == (n*2-1)-row){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



/*
 15.     *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int s, n = 5;
//         for(int row = 1; row <= n; row++){
//             for(s = 1; s <= n-row; s++){
//                 System.out.print(" ");
//             }
//             for(int col = 1; col <= row*2; col++){
//                 if(col == 1 || col == row*2-1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }

//             }
//             System.out.println();
//         }
//         int spaces;
//         for(int row = 1; row <= n-1; row++){
//             for(spaces = 1; spaces <= row; spaces++){
//                 System.out.print(" ");
//             }
//             for(int col = 1; col < n*2; col++){
//                 if(col == 1 || col == n*2-spaces-row){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



/*
 16.          1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int numRows = 5; // You can change this value to adjust the number of rows
        
//         for (int i = 0; i < numRows; i++) {
//             // Print spaces for formatting
//             for (int j = 0; j < numRows - i; j++) {
//                 System.out.print("  ");
//             }
            
//             // Calculate and print the numbers for the current row
//             int num = 1;
//             for (int j = 0; j <= i; j++) {
//                 System.out.print(num + "   ");
//                 num = num * (i - j) / (j + 1);
//             }
            
//             // Move to the next line for the next row
//             System.out.println();
//         }
//     }
// }



/*
 17.     1
        212
       32123
      4321234
       32123
        212
         1
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int spaces, n = 5;
//         for(int row = 1; row < n*2; row++){
//             int c = row > n ? (n*2)-row : row;
//             for(spaces = 1; spaces <= n-c; spaces++){
//                 System.out.print("  ");
//             }
//             for(int col = c; col >= 1; col--){
//                 System.out.print(col + " ");
//             }
//             for(int col = 2; col <= c; col++){
//                 System.out.print(col+ " ");
//             }
//             System.out.println();
//         }
//     }
// }



/*
 18.  **********
      ****  ****
      ***    ***
      **      **
      *        *
      *        *
      **      **
      ***    ***
      ****  ****
      **********
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int s, n = 5;
//         for(int row = 0; row < n*2; row++){
//             int c = row >= n ? (n*2-1)-row : row; 
//             for(int col = 0; col < n-c; col++){
//                 System.out.print("*");
//             }
//             for(s = 0; s < c; s++){
//                 System.out.print("  ");
//             }
//             for(int col1 = s; col1 < n; col1++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



/*
 19.   *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int s, n = 5;
//         for(int row = 0; row < n*2; row++){
//             int c = row >= n ? (n*2-2)-row : row;
//             for(int col = 0; col <= c; col++){
//                 System.out.print("*");
//             }
//             for(s = 0; s < n-1-c; s++){
//                 System.out.print("  ");
//             }
//             for(int col1 = s; col1 < n; col1++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



/*
 20.   ****
       *  *
       *  *
       *  *
       ****
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int n = 5;
//         for(int row = 0; row < n; row++){
//             if(row == 0 || row == n-1){
//                 for(int col = 0; col < n-1; col++){
//                     System.out.print("*");
//                 }
//             }
//             else{
//                 for(int col = 0; col < n-1; col++){
//                     if(col == 0 || col == n-2){
//                         System.out.print("*");
//                     }
//                     else{
//                         System.out.print(" ");
//                     }
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



/*
  21.  1
       2  3
       4  5  6
       7  8  9  10
       11 12 13 14 15
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int n = 5;
//         int sum = 0;
//         for(int row = 1; row <= n; row++){
//             for(int col = 1; col<=row; col++){
//                 sum = sum + 1;
//                 System.out.print(sum + " ");
//             }
//             System.out.println();
//         }
//     }
// }



/*
 22.   1
       0 1
       1 0 1
       0 1 0 1
       1 0 1 0 1
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int n = 5;
//         for(int row = 0; row < n; row++){
//             int value = (row % 2 == 0) ? 1 : 0;
//             for(int col = 0; col <= row; col++){
//                System.out.print(value + " ");
//                value = 1 - value;
//             }
//             System.out.println();
//         }
//     }
// }



/*
 23.       *      *
         *   *  *   *
       *      *      *
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int s, n = 3;
//         for(int row = 0; row < n; row++){
//             for(s = 0; s < n-1-row; s++){
//                 System.out.print(" ");
//             }
//             for(int col = s; col < n; col++){
//                 if(col == s || col == n-1){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             for(s = 0; s < n-1-row; s++){
//                 System.out.print("  ");
//             }
//             for(int col1 = s; col1 < n; col1++){
//                 if(col1 == s || col1 == n-1){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();

//         }
//     }
        
// }



/*
 24.   *        *
       **      **
       * *    * *
       *  *  *  *
       *   **   *
       *   **   *
       *  *  *  *
       * *    * *
       **      **
       *        *
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int s, n = 5;
//         for(int row = 0; row < n*2; row++){
//             int c = row >= n ? (n*2-1)-row : row;
//             for(int col = 0; col <= c; col++){
//                 if(col == 0 || col == c){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             for(s = 0; s < n-1-c; s++){
//                 System.out.print("  ");
//             }
//             for(int col1 = s; col1 < n; col1++){
//                 if(col1 == s || col1 == n-1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



/*
 25.      *****
         *   *
        *   *
       *   *
      *****
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int s, n = 5;
//         for(int row = 0; row < n; row++){
//             for(s = 0; s < n-1-row; s++){
//                 System.out.print(" ");
//             }
//             if(row == 0 || row == n-1){
//                 for(int col = 0; col < n; col++){
//                     System.out.print("*");
//                 }
//             }
//             else{
//                 for(int col = 0; col < n; col++){
//                     if(col == 0 || col == n-1){
//                         System.out.print("*");
//                     }
//                     else{
//                         System.out.print(" ");
//                     }
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



/*
 26.  1 1 1 1 1 1
      2 2 2 2 2
      3 3 3 3
      4 4 4
      5 5
      6
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int n = 6;
//         for(int row = 1; row <= n; row++){
//             for(int col = 1; col <= n-row+1; col++){
//                 System.out.print(row + " ");
//             }
//             System.out.println();
//         }
//     }
// }



/*
 27.   1 2 3 4  17 18 19 20
         5 6 7  14 15 16
           8 9  12 13
            10  11
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int s, n = 4;
//         int value = 0;
//         int value1 = 20;
//         for(int row = 1; row <= n; row++){
//             for(s = 1; s < row; s++){
//                 System.out.print("  ");
//             }
//             for(int col = s; col <= n; col++){
//                 value = value + 1;
//                 System.out.print(value + " ");
//             }
//             System.out.print("  ");
//             for(int col1 = 0; col1 < n-row+1; col1++){
//                 System.out.print(value1 + " ");
//                 value1 = value1 - 1;
//             }
//             System.out.println();
//         }
//     }
// }



/*
 28.     *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *
 */
// public class Pattern{
//     public static void main(String[] args) {
//         int s, n = 5;
//         for(int row = 0; row < n*2; row++){
//             int c = row >= n ? (n*2-2)-row : row;
//             for(s = 0; s < n-1-c; s++){
//                 System.out.print(" ");
//             }
//             for(int col = s; col < n; col++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



/*
 29.      
       *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *
 */
// public class Pattern{
//       public static void main(String[] args) {
//             int s, n = 5;
//             for(int row = 0; row < n*2; row ++){
//                   int c = row >= n ? (n*2-2)-row : row;
//                   for(int col = 0; col <= c; col++){
//                         System.out.print("*");
//                   }
//                   for(s = 0; s < n-1-c; s++){
//                         System.out.print("  ");
//                   }
//                   for(int col1 = s; col1 < n; col1++){
//                         System.out.print("*");
//                   }
//                   System.out.println();
//             }
//       }
// }



/*
 30.        1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
 */
// public class Pattern{
//       public static void main(String[] args) {
//             int s, n = 5;
//             for(int row = 1 ; row <= n; row++){
//                   for(s = 0; s < n-row; s++){
//                         System.out.print("  ");
//                   }
//                   for(int col = row; col >= 1; col--){
//                         System.out.print(col + " ");
//                   }
//                   for(int col = 2; col <= row; col++){
//                         System.out.print(col + " ");
//                   }
//                   System.out.println();
//             }
//       }
// }



// // // Not Solved : -
/*
 31.     4 4 4 4 4 4 4  
         4 3 3 3 3 3 4   
         4 3 2 2 2 3 4   
         4 3 2 1 2 3 4   
         4 3 2 2 2 3 4   
         4 3 3 3 3 3 4   
         4 4 4 4 4 4 4   

 */



/*
  32.  E
       D E
       C D E
       B C D E
       A B C D E
*/
//   public class Pattern{
//       public static void main(String[] args) {
//             char[][] ch = new char[5][5];
//             for(int row = 0; row < ch.length; row++){
//                   char ch1 = 'E';
//                   for(int col = row; col >= 0; col--){
//                         ch[row][col] = ch1;
//                         ch1 = (char)(ch1 - 1);
//                   }
//                   // System.out.println();
//             }
//             for(int row = 0; row < ch.length; row++){
//                   for(int col = 0; col < ch.length; col++){
//                         System.out.print(ch[row][col] + " ");
//                   }
//                   System.out.println();
//             }
//       }
//   }



/*
 33.   a
       B c
       D e F
       g H i J
       k L m N o
 */
// public class Pattern{
//       public static void main(String[] args) {
//             int n = 5;
//             char ch = 'a';
//             boolean iscap = false;
//             boolean islow = false;
//             for(int row = 0; row < n; row++){
//                   // for(int col = 0; col <= row; col++)
//                   int col = 0;
//                   while(col <= row)
//                   {
                        /*
                         System.out.print(Character.toLowerCase(ch) + " ");
                        ch = (char)(ch + 1);
                        col++;
                        if(col > row){
                              break;
                        }
                        System.out.print(Character.toUpperCase(ch) + " ");
                        ch = (char)(ch + 1);
                        col++;
                         */
//                         if(islow == false){
//                               System.out.print(Character.toLowerCase(ch) + " ");
//                               iscap = true;
//                               col++;
//                         }
//                         ch = (char)(ch + 1);
//                         if(col > row){
//                               break;
//                         }
//                         if(iscap == true){
//                               System.out.print(Character.toUpperCase(ch) + " ");
//                               islow = false;
//                               col++;
//                         }
//                         ch = (char)(ch + 1);
//                   }
//                   System.out.println();
//             }
//       }
// }



/*
 34.   E D C B A
       D C B A
       C B A
       B A
       A
 */
// public class Pattern{
//       public static void main(String[] args) {
//             char[][]  str = new char[5][5];
//             for(int row = 0; row < str.length; row++){
//                   char ch = 'A';
//                   for(int col = str.length-1-row; col >= 0; col--){
//                         str[row][col] = ch;
//                         ch = (char)(ch + 1);
//                   }
//                   System.out.println();
//             }
//             for(int row = 0; row< str.length; row++){
//                   for (int col = 0; col < str.length; col++) {
//                         System.out.print(str[row][col] + " ");
//                   }
//                   System.out.println();
//             }
//       }
// }



 /* 
  35.  1      1
       12    21
       123  321
       12344321
  */
//   public class Pattern{
//       public static void main(String[] args) {
//             int s, col, n = 9;
//             System.out.println();
//             for(int row = 1; row <= n; row++){
//                   for(col = 1; col <= row; col++){
//                         System.out.print(col + " ");
//                   }
//                   for(s = 1; s <= n-row; s++){
//                         System.out.print("    ");
//                   }
//                   for(int col1 = row; col1 >= 1; col1--){
//                         System.out.print(col1 + " ");
//                   }
//                   System.out.println();
//             }
//             System.out.println();
//       }
//   }
