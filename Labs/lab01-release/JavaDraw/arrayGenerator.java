import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class arrayGenerator{
    public static void main( String[] args ){
        System.out.println( "How many arrays would you like to generate? (select r for a random #)");
        Random r = new Random();
        int number;
        int[][] Array = new int[int[]][number];
        Scanner scan = new Scanner(System.in);
        if(scan.next().charAt(0) == 'r'){
            number = r.nextInt(100);
            System.out.println( "Generating " + number + " Arrays..." );
            for(int i=0; i < number; i++){
                System.out.println( "How many elements are in your array? (select r for a random #)" );
                int[] integers;

                if(scan.next().charAt(0) == 'r'){
                    int elements = r.nextInt(100000000);
                     System.out.println("The array has " + elements + " elements");
                     integers = new int[elements];

                    for(int j = 0; j < elements; j++) {
                        integers[j] = r.nextInt();
                }
            }
                else{
                    int elements = scan.nextInt();
                    integers = new int[elements];

                    for(int j = 0; j < elements; j++) {
                        integers[j] = r.nextInt();

                }
            }
            System.out.println(Arrays.toString(integers));
            Array[i][i] = integers;
        }
        }
        else{
            System.out.println("Please retype your number");
            number = scan.nextInt();
            System.out.println( "Generating " + number + " Arrays..." );

            for(int i=0; i < number; i++){
                System.out.println( "How many elements are in your array? (select r for a random #)" );
                int[] integers;

                if(scan.next().charAt(0) == 'r'){
                    int elements = r.nextInt(1000000);
                     System.out.println("The array has " + elements + " elements");
                     integers = new int[elements];

                    for(int j = 0; j < elements; j++) {
                        integers[j] = r.nextInt();


                }
            }
                else{
                    System.out.println("Please retype your number");
                    int elements = scan.nextInt();
                    integers = new int[elements];

                    for(int j = 0; j < elements; j++) {
                        integers[j] = r.nextInt();

                }
            }
            System.out.println(Arrays.toString(integers));
            Array[i][i] = integers;

        }

        }

    }
}
