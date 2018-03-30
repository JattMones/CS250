import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class lab05OG{
static Scanner Scan = new Scanner(System.in);

public static void main(String[] args)throws FileNotFoundException
{
  System.out.println("Welcome to the Efficient 8-queens Checker! Would you like to check a specific solution or print all existing solutions?(input 'check' or 'print')");
if(Scan.nextLine().equals("check")){
  System.out.print("Choose a spot for the queen on the first throw (possible spots 3-6)");
  int answer = Scan.nextInt();
if(answer == 4){
  System.out.println("Choose next rows spot (1,2,6,7)");
  answer = Scan.nextInt();
  if(answer == 7){
    System.out.println("Choose next rows spot (1,3)");
    answer = Scan.nextInt();
    if(answer == 1){
    printFile("C:\\Users\\Matt Jones\\Desktop\\School\\compSci\\cs250\\Lab05\\Sol6.txt");

   }


    else if(answer == 3){
      printFile("C:\\Users\\Matt Jones\\Desktop\\School\\compSci\\cs250\\Lab05\\Sol7.txt");
    }
    else{
      System.out.println("Invalid input (input 1 or 3) Exiting...");
    }
  }
  else if(answer == 1){
    printFile("C:\\Users\\Matt Jones\\Desktop\\School\\compSci\\cs250\\Lab05\\Sol3.txt");
  }
  else if(answer == 2){
      printFile("C:\\Users\\Matt Jones\\Desktop\\School\\compSci\\cs250\\Lab05\\Sol4.txt");
  }
  else if(answer == 6){
    printFile("C:\\Users\\Matt Jones\\Desktop\\School\\compSci\\cs250\\Lab05\\Sol5.txt");
  }

  else{
    System.out.println("Not valid input (input 1, 2, 6, or 7) Exiting...");
}
}
else if(answer == 5){
  System.out.println("Choose next rows spot (2,3,7)");
  answer = Scan.nextInt();
  if(answer == 2){
    printFile("C:\\Users\\Matt Jones\\Desktop\\School\\compSci\\cs250\\Lab05\\Sol8.txt");
  }
  else if(answer == 3){
    printFile("C:\\Users\\Matt Jones\\Desktop\\School\\compSci\\cs250\\Lab05\\Sol9.txt");
  }
  else if(answer == 7){
    printFile("C:\\Users\\Matt Jones\\Desktop\\School\\compSci\\cs250\\Lab05\\Sol10.txt");
  }
  else{
      System.out.println("Not valid input (input 2, 3, or 7) Exiting...");
  }
}
else if(answer == 6){
  System.out.println("Choose next rows spot (2,4)");
  answer = Scan.nextInt();
  if(answer == 2){
    printFile("C:\\Users\\Matt Jones\\Desktop\\School\\compSci\\cs250\\Lab05\\Sol11.txt");
  }
  else if(answer == 4){
    printFile("C:\\Users\\Matt Jones\\Desktop\\School\\compSci\\cs250\\Lab05\\Sol12.txt");
  }
  else{
    System.out.println("Not valid input (input 2 or 4) Exiting...");
  }
}
else if(answer == 3){
  System.out.println("The queen is placed in the second spot");
  System.out.println("Choose next rows spot (4,8)");
  answer = Scan.nextInt();
  if(answer == 4){
    printFile("C:\\Users\\Matt Jones\\Desktop\\School\\compSci\\cs250\\Lab05\\Sol1.txt");
  }
  else if(answer == 8){
    printFile("C:\\Users\\Matt Jones\\Desktop\\School\\compSci\\cs250\\Lab05\\Sol2.txt");
  }
  else{
    System.out.println("Not valid input (input 4 or 8) Exiting...");
  }
  }
else{
  System.out.println("Not valid input (input 3, 4, 5, or 6) Exting...");
}
}
else{
  printFile("C:\\Users\\Matt Jones\\Desktop\\School\\compSci\\cs250\\Lab05\\Sol1.txt");
  System.out.println("-----------");
  printFile("C:\\Users\\Matt Jones\\Desktop\\School\\compSci\\cs250\\Lab05\\Sol2.txt");
  System.out.println("-----------");
  printFile("C:\\Users\\Matt Jones\\Desktop\\School\\compSci\\cs250\\Lab05\\Sol3.txt");
  System.out.println("-----------");
  printFile("C:\\Users\\Matt Jones\\Desktop\\School\\compSci\\cs250\\Lab05\\Sol4.txt");
  System.out.println("-----------");
  printFile("C:\\Users\\Matt Jones\\Desktop\\School\\compSci\\cs250\\Lab05\\Sol5.txt");
  System.out.println("-----------");
  printFile("C:\\Users\\Matt Jones\\Desktop\\School\\compSci\\cs250\\Lab05\\Sol6.txt");
  System.out.println("-----------");
  printFile("C:\\Users\\Matt Jones\\Desktop\\School\\compSci\\cs250\\Lab05\\Sol7.txt");
  System.out.println("-----------");
  printFile("C:\\Users\\Matt Jones\\Desktop\\School\\compSci\\cs250\\Lab05\\Sol8.txt");
}
  }
public static void printFile(String filepath)throws FileNotFoundException
{//might need to change this String variable to file
    File file = new File(filepath);
    Scanner sc = new Scanner(file);

    // we just need to use \\Z as delimiter
    sc.useDelimiter("\\Z");

    System.out.println(sc.next());
}
}
