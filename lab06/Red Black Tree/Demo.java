import javax.swing.*;
import java.util.Scanner;

public class Demo extends JFrame {

    private RedBlack<Integer, String> tree = new RedBlack<Integer, String>();
    private Boolean run = true;
    //    private RedBlack2 tree = new RedBlack2();

    private Demo() {
      super("Red Black Tree");
      getContentPane().add(new JLabel(tree));
      pack();
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(false);

        Scanner scan = new Scanner(System.in);
        System.out.println("Add root node");
        int input1 =scan.nextInt();

        while(run){

            tree.add(input1, "");
            System.out.println("Would you like to add another node?");
            if(scan.next().equals("n")){
              run = false;
            }
            else{
              System.out.println("Enter node value");
              input1 = scan.nextInt();
            }
        }
        setVisible(true);
    }

    static public void main(String[] arg) {
        new Demo();
    }
}
