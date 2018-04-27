import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

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
    System.out.println("Enter: \n(1) for flight distances \n(2) for flight prices");
    int choice = scan.nextInt();
    if(choice == 1){
      Get.distance();
    }
    if(choice == 2){
    Get.price();
  }else{
      continue;
    }
  }
  else if(input == 2){
    System.out.println("Enter: \n(1) for flight distances MST \n(2) for flight prices MST");
    int choice = scan.nextInt();
    if(choice == 1){
      Get.PrimDistance();
      System.out.println("");

    }
    if(choice == 2){
    Get.PrimPrice();
    System.out.println("");
  }else{
      continue;
    }
  }
  else if(input == 3){
    try {
    Boolean next = true;
    String city;
    String[] tempsArray;
    while(next){
      Scanner distanceReader = new Scanner(new File("routeEWG.txt")).useDelimiter("\\s*\t*\\s");
      Scanner PriceReader = new Scanner(new File("priceEWG.txt")).useDelimiter("\\s*\t*\\s");

      distanceReader.next();
      PriceReader.next();
      distanceReader.next();
      PriceReader.next();
      distanceReader.next();
      PriceReader.next();
      distanceReader.next();
      PriceReader.next();
    int count = 0;
    int count2 = 29;
    System.out.println("Enter the city you'd like to see flight information about");
    city = scan.next();
    System.out.println("PIT or PHL");
    String check = scan.next();
    if(check.equals("PIT")){
        count2 = 0;
    }
    while(count < 30){
      try{
    tempsArray = cityArray.toArray2();
  }
  catch(IOException e){
    continue;
  }
          if(city.equals(tempsArray[count])){
            System.out.println(city+": "+count);
            count2 =count2 + count;
      }
      count++;
    }
    for(int l=0;l<count2-1;l++){
      distanceReader.next();
      PriceReader.next();
      distanceReader.next();
      PriceReader.next();
      distanceReader.next();
      PriceReader.next();
    }
    System.out.print("Distance(km): "+distanceReader.next()+" Price: $"+PriceReader.next());

    //method will take (city, to) as input, and print the specific flight information for it.
  //method will take more user input to figure out what cities they're traveling between, and how they want to sort their seach (3 different ways in prompt)
    System.out.println("\nWould you like to search for another custom flight?(y/n)");
    if(scan.next().equals("n")){
      next = false;
    }
  }
  }catch (FileNotFoundException e){

   continue;
  }
}
else if(input == 4){//method will ask for a "price cap" from the user, display all flights under that price cap
  System.out.println("Please select the maximum price for your ticket (tickets range from $200-$450");
  int max = scan.nextInt();
  if(max < 200){
    System.out.println("None");
  }
  else if (max == 200){
    System.out.println("Flights under $" + max + ":" + "\nMorgantown Municipal Walter L. Bill Hart Field \nJohn Murtha Johnstown Cambria County \nNew York JFK");
  }
  else if(max <= 250 && max > 200){
  System.out.println("Flights under $" + max + ":" + "\nArnold Palmer Regional Airport \nAltoona Blair County \nCarslise \nWashington \nNew York LaGuardia \nMorgantown Municipal Walter L. Bill Hart Field \nJohn Murtha Johnstown Cambria County \nNew York JFK");
  }
  else if(max <= 300 && max > 250){
  System.out.println("Flights under $" + max + ":" + "\nAllegheny County \nNorth Central west Virginia Airport \nLatrobe \nDubois \nAkron \nMiami \nVegas \nDetroit \nErie \nArnold Palmer Regional Airport \nAltoona Blair County \nCarslise \nWashington \nNew York LaGuardia \nMorgantown Municipal Walter L. Bill Hart Field \nJohn Murtha Johnstown Cambria County \nNew York JFK");
  }
  else if(max <= 350 && max > 300){
  System.out.println("Flights under $" + max + ":" + "\nOrlando \nDallas \nAllegheny County \nNorth Central west Virginia Airport \nLatrobe \nDubois \nAkron \nMiami \nVegas \nDetroit \nErie \nArnold Palmer Regional Airport \nAltoona Blair County \nCarslise \nWashington \nNew York LaGuardia \nMorgantown Municipal Walter L. Bill Hart Field \nJohn Murtha Johnstown Cambria County \nNew York JFK");
  }
  else if(max <= 400 && max > 350){
  System.out.println("Flights under $" + max + ":" + "\nDenver \nLos Angeles \nSan Fran \nMinneapolis \nSeattle \nChicago \nAtlanta \nOrlando \nDallas \nAllegheny County \nNorth Central west Virginia Airport \nLatrobe \nDubois \nAkron \nMiami \nVegas \nDetroit \nErie \nArnold Palmer Regional Airport \nAltoona Blair County \nCarslise \nWashington \nNew York LaGuardia \nMorgantown Municipal Walter L. Bill Hart Field \nJohn Murtha Johnstown Cambria County \nNew York JFK");
  }
  else if(max < 450 && max > 400){
  System.out.println("Flights under $" + max + ":" + "\nDenver \nLos Angeles \nSan Fran \nMinneapolis \nSeattle \nChicago \nAtlanta \nOrlando \nDallas \nAllegheny County \nNorth Central west Virginia Airport \nLatrobe \nDubois \nAkron \nMiami \nVegas \nDetroit \nErie \nArnold Palmer Regional Airport \nAltoona Blair County \nCarslise \nWashington \nNew York LaGuardia \nMorgantown Municipal Walter L. Bill Hart Field \nJohn Murtha Johnstown Cambria County \nNew York JFK");
  }
  else{
    System.out.println("All Cities");
  }
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
