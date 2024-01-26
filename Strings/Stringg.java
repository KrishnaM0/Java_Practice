
// Palindrom string : -
// import java.util.Scanner;
// public class Stringg {
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         String str = "abcdcba";
//         System.out.println(ispalindrom(str));
//         scr.close();
//     }
//     static boolean ispalindrom(String str){
//         for(int i = 0; i <= str.length() / 2; i++){
//             if(str.charAt(i) != str.charAt(str.length()-1-i)){
//                 return false;
//             }
//         }
//         return true;
//     }
// }



// // String methods : -
// import java.util.Arrays;
// import java.util.ArrayList;
// import java.util.Scanner;
// public class Stringg{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         // String str = "Krishna Balaji";
//         String str = "Krishna";
//         // System.out.println(str.toLowerCase());
//         // System.out.println(str.toUpperCase());
//         // System.out.println(str.concat(" "+ 1));
//         // System.out.println(Arrays.toString(str.split(" ")));
//         // System.out.println("    Krishna     ".strip());
//         // System.out.println(str + " Roll no. : " + 28);
//         // System.out.println((char)('A' + 1));
//         // System.out.println(str.trim());
//         // System.out.println("Krishna" + 28 + new ArrayList<>());
//         scr.close();
//     }
// }



// // String Builder : - (print A to Z alphabets)
// import java.util.Arrays;
// import java.util.Scanner;
// public class Stringg{
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         StringBuilder builder = new StringBuilder();
//         for(int i = 0; i < 26; i++){
//             char ch = (char)('A' + i);
//             builder.append(ch);
//         }
//         System.out.println(builder.toString());
//         // System.out.println(builder.capacity());
//         // System.out.println(builder.charAt(1));
//         // System.out.println(builder.reverse());
//         scr.close();
//     }
// }
