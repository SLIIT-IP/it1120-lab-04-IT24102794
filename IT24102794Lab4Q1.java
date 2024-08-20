import java.util.Scanner;
        public class IT24102794Lab4Q1{
               public static void main(String[]args){
                     double number;
                     Scanner x = new Scanner(System.in);
                     System.out.print("Enter a number :");
                     number = x.nextInt();
               if(number < 0) {
                     System.out.print("The number is Negative.");
               }
               else if (number > 0) { 
                     System.out.print("The number is Positive.");
               }
               else {
                     System.out.print("The number is Zero.");
               }
      }
}