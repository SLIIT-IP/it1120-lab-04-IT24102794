import java.util.Scanner;
       public class IT24102794Lab4Q3{
              public static void main(String[]args){
                   int number;
                   Scanner x = new Scanner(System.in);
                   System.out.print("Enter a number :");
                   number = x.nextInt();
                   System.out.print(number > 0 ? "The number is Positive." : number < 0 ? "The number is Negative." : "The number is zero.");
       }
}