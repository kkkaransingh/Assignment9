package assignment14;
import java.util.Scanner;

public class Assignment14 {

  
    public static void main(String[] args) {
       int studentcount;
       int subjectcount;
       int i;
       int j;
       //declare matrix 2d
      
       
       Scanner keyboard  = new Scanner (System.in);
       // ask the user the num of student and subject
       System.out.println("hello user");
       System.out.print("how many students (rows)?");
       studentcount =keyboard.nextInt();
       System.out.print("how many subject(columns)?");
       subjectcount =keyboard.nextInt();
       int [][] marks =new int[studentcount][subjectcount];
       // lets loop to input marks
       for (i = 0;i <studentcount ;i++){
       
           System.out.println("student " +(i+1) );
       
           //marks loop
           for( j =0 ;j<subjectcount ;j++){
           
               System.out.print("marks " + (j+1) +":");
               marks[i][j] =keyboard.nextInt();
    }}
       //lets loop to print this table
       for (i=0;i<studentcount; i++){
           for (  j=0 ;j<subjectcount ;j++)
           {
           System.out.print("|------");
           }
       System.out.println("|");
       
       //marks
       for (j=0;j<subjectcount ;j++){
System.out.print(String.format("| %4d " , marks[i][j])) ;}
         System.out.println("|");
       }
       for ( int  k=0 ;k<subjectcount ;k++)
           {
           System.out.print("|------");
           }
       System.out.println("|");
       
}
}

   
    
