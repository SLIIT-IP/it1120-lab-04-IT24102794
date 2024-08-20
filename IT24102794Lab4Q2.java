import java.util.Scanner;
      public class IT24102794Lab4Q2{
            public static void main(String[]args){
                  double ExamMark,LabSubmissionMark,ExamPercentage,LabSubmissionPercentage,FinalMark;
                  Scanner x = new Scanner(System.in);

                  System.out.print("Input the exam mark(given out 100) :");
                  ExamMark = x.nextDouble();
                     if(ExamMark < 0 || ExamMark > 100){
                  System.out.println("Invalid input for exam mark. Terminating program.");
                     }
                  
                  System.out.print("Input the lab submission mark(given out of 100) :");
                  LabSubmissionMark = x.nextDouble();
                     if(LabSubmissionMark < 0 || LabSubmissionMark > 100){
                  System.out.println("Invalid input for lab submission mark. Terminating program.");
                     }

                  System.out.print("Please enter the percentage given for the exam :");
                  ExamPercentage = x.nextDouble();
                  System.out.print("please enter the percentage given for the lab submission :");
                  LabSubmissionPercentage = x.nextDouble();

                      if(ExamPercentage + LabSubmissionPercentage !=100) ;
                  System.out.print("Invalid input. The percentage must add up to 100.Terminating program.");

                  FinalMark = (ExamMark * ExamPercentage/100) + (LabSubmissionMark * LabSubmissionPercentage/100) ;
                  System.out.print("Final Mark = "+ FinalMark);
        }
}