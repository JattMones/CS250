import java.util.Scanner;

public class input{

public static void main(String[] args){
Boolean run = true;

System.out.println("Welcome to the Pennsylvania Emergency airline finder. Perfect for last minute cancelations & other inconvieninces.");
Scanner scan = new Scanner(System.in);
while(run){
System.out.println("Press 1 to show all flight information. \nPress 2 to show a mst of airport locations. \nPress 3 to search for a custom route (specific flight). \nPress 4 to search for flights by the price. \nPress 5 to edit flight information.");
  int input = scan.nextInt();
  if(input == 1){
    System.out.println("1");//method or code for printing all flight information goes here
  }
  else if(input == 2){
System.out.println("2");//method for calculating an mst of our tree using BFS (Prompt says it should be done by distance)
  }
  else if(input == 3){
    Boolean next = true;
    Boolean to = true;
    while(next){
    System.out.println("Enter the city you'd like to see flight information about");
    String city = scan.next();
    System.out.println("To or from Pittsburgh?");
    String check = scan.next();
    if(check.equals("from")){
    to = false;
    }
    //method will take (city, to) as input, and print the specific flight information for it.
    System.out.println("3");//method will take more user input to figure out what cities they're traveling between, and how they want to sort their seach (3 different ways in prompt)
    System.out.println("Would you like to search for another custom flight?(y/n)");
    if(scan.next().equals("n")){
      next = false;
    }
    }
    }
  else if(input == 4){//method will ask for a "price cap" from the user, display all flights under that price cap
    System.out.println("Please select the maximum price for your ticket (tickets range from $250-$1500");
    int max = scan.nextInt();
    //put "max" into some method and show all prices </= max.
    System.out.println("4");
  }
  else{
    System.out.println("Would you like too add or remove a flight?");
    String edit = scan.next();
    if(edit.equals("add")){
      //method or code to add data to our file
    }
    else{
      //method of code to remove data from our file
    }
    System.out.println("5");//method will add or remove flights/nodes. This method will feature writing and deleting from the data file.
  }
  System.out.println("Would you like to exit?(y/n)");
  if(scan.next().equals("y"))
  {
    run = false;
  }
}
System.out.println("Thanks for using our system! Exiting...");
}
}