import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class lab05 extends lab5{
  static ArrayList<Integer> list1 = new ArrayList<Integer>();
  static ArrayList<Integer> list2 = new ArrayList<Integer>();
  static ArrayList<Integer> list3 = new ArrayList<Integer>();
  static ArrayList<Integer> list4 = new ArrayList<Integer>();
  static ArrayList<Integer> list5 = new ArrayList<Integer>();
  static ArrayList<Integer> list6 = new ArrayList<Integer>();
  static ArrayList<Integer> list7 = new ArrayList<Integer>();
  static ArrayList<ArrayList> list8 = new ArrayList<ArrayList>();
  static int r = 1;
  static int s;
  static Scanner scan = new Scanner(System.in);
  static Boolean t;
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    t = true;
    for(int i=1; i<9; i++){
    list1.add(i);
    list2.add(i);
    list3.add(i);
    list4.add(i);
    list5.add(i);
    list6.add(i);
    list7.add(i);
    }
    list8.add(list1);
    list8.add(list2);
    list8.add(list3);
    list8.add(list4);
    list8.add(list5);
    list8.add(list6);
    list8.add(list7);
System.out.println("Where is the queen going?(Possible spots 1-8)");
s = scan.nextInt();
while(r<8){
if(confirmValidPlacement(s, list8.get(r-1)))
setValidPlacement(s, r);
if(t == true){
for(int j=1; j<s; j++){
System.out.print("*");
}
System.out.print("Q");
while(s<8){
System.out.print("*");
s = s+1;
}
}
s = scan.nextInt();
if(confirmValidPlacement(s, list8.get(r-1))){
System.out.println("");
r++;
}
else{
  System.out.println("Pick a different (valid) spot");
  t = false;
}
}
}

public static void setValidPlacement(int s, int r){
  if(r == 1){
  if(s == 1){
  list1.remove(new Integer(1));
  list2.remove(new Integer(1));
  list3.remove(new Integer(1));
  list4.remove(new Integer(1));
  list5.remove(new Integer(1));
  list6.remove(new Integer(1));
  list7.remove(new Integer(1));//I could possibly increase efficiency here (and in every other instance), by running a loop to remove elements "s"-8
  list1.remove(new Integer(2));
  list2.remove(new Integer(3));
  list3.remove(new Integer(4));
  list4.remove(new Integer(5));
  list5.remove(new Integer(6));
  list6.remove(new Integer(7));
  list7.remove(new Integer(8));
      //break;                    //Added //break; statements for increased efficiency
  }
  if(s == 2){
  list1.remove(new Integer(1));
  list1.remove(new Integer(2));
  list1.remove(new Integer(3));
  list2.remove(new Integer(2));
  list2.remove(new Integer(4));
  list3.remove(new Integer(2));
  list3.remove(new Integer(5));
  list4.remove(new Integer(2));
  list4.remove(new Integer(6));
  list5.remove(new Integer(2));
  list5.remove(new Integer(7));
  list6.remove(new Integer(2));
  list6.remove(new Integer(8));
  list7.remove(new Integer(2));
      //break;
  }
  if(s == 3){
  list1.remove(new Integer(2));
  list1.remove(new Integer(3));
  list1.remove(new Integer(4));
  list2.remove(new Integer(1));
  list2.remove(new Integer(3));
  list2.remove(new Integer(5));
  list3.remove(new Integer(3));
  list3.remove(new Integer(6));
  list4.remove(new Integer(3));
  list4.remove(new Integer(7));
  list5.remove(new Integer(3));
  list5.remove(new Integer(8));
  list6.remove(new Integer(3));
  list7.remove(new Integer(3));
    //break;
  }
  if(s == 4){
  list1.remove(new Integer(3));
  list1.remove(new Integer(4));
  list1.remove(new Integer(5));
  list2.remove(new Integer(2));
  list2.remove(new Integer(4));
  list2.remove(new Integer(6));
  list3.remove(new Integer(1));
  list3.remove(new Integer(4));
  list3.remove(new Integer(7));
  list4.remove(new Integer(4));
  list4.remove(new Integer(8));
  list5.remove(new Integer(4));
  list6.remove(new Integer(4));
  list7.remove(new Integer(4));
    //break;
  }
  if(s == 5){
  list1.remove(new Integer(4));
  list1.remove(new Integer(5));
  list1.remove(new Integer(6));
  list2.remove(new Integer(3));
  list2.remove(new Integer(5));
  list2.remove(new Integer(7));
  list3.remove(new Integer(2));
  list3.remove(new Integer(5));
  list3.remove(new Integer(8));
  list4.remove(new Integer(1));
  list4.remove(new Integer(5));
  list5.remove(new Integer(5));
  list6.remove(new Integer(5));
  list7.remove(new Integer(5));
    //break;
  }
  if(s == 6){
  list1.remove(new Integer(5));
  list1.remove(new Integer(6));
  list1.remove(new Integer(7));
  list2.remove(new Integer(4));
  list2.remove(new Integer(6));
  list2.remove(new Integer(8));
  list3.remove(new Integer(3));
  list3.remove(new Integer(6));
  list4.remove(new Integer(2));
  list4.remove(new Integer(6));
  list5.remove(new Integer(1));
  list5.remove(new Integer(6));
  list6.remove(new Integer(6));
  list7.remove(new Integer(6));
    //break;
  }
  if(s == 7){
  list1.remove(new Integer(6));
  list1.remove(new Integer(7));
  list1.remove(new Integer(8));
  list2.remove(new Integer(5));
  list2.remove(new Integer(7));
  list3.remove(new Integer(4));
  list3.remove(new Integer(7));
  list4.remove(new Integer(3));
  list4.remove(new Integer(7));
  list5.remove(new Integer(2));
  list5.remove(new Integer(7));
  list6.remove(new Integer(1));
  list6.remove(new Integer(7));
  list7.remove(new Integer(7));
    //break;
  }
  if(s == 8){
  list1.remove(new Integer(7));
  list1.remove(new Integer(8));
  list2.remove(new Integer(6));
  list2.remove(new Integer(8));
  list3.remove(new Integer(5));
  list3.remove(new Integer(8));
  list4.remove(new Integer(4));
  list4.remove(new Integer(8));
  list5.remove(new Integer(3));
  list5.remove(new Integer(8));
  list6.remove(new Integer(2));
  list6.remove(new Integer(8));
  list7.remove(new Integer(1));
  list7.remove(new Integer(8));
    //removed //break; statement for increased efficiency
  }
}
  if(r == 2){
  if(s == 1){
  list2.remove(new Integer(1));
  list2.remove(new Integer(2));
  list3.remove(new Integer(1));
  list3.remove(new Integer(3));
  list4.remove(new Integer(1));
  list4.remove(new Integer(4));
  list5.remove(new Integer(1));
  list5.remove(new Integer(5));
  list6.remove(new Integer(1));
  list6.remove(new Integer(6));
  list7.remove(new Integer(1));
  list7.remove(new Integer(7));
    //break;
  }
  if(s == 2){
  list2.remove(new Integer(1));
  list2.remove(new Integer(2));
  list2.remove(new Integer(3));
  list3.remove(new Integer(2));
  list3.remove(new Integer(4));
  list4.remove(new Integer(2));
  list4.remove(new Integer(5));
  list5.remove(new Integer(2));
  list5.remove(new Integer(6));
  list6.remove(new Integer(2));
  list6.remove(new Integer(7));
  list7.remove(new Integer(2));
  list7.remove(new Integer(8));
    //break;
  }
  if(s == 3){
  list2.remove(new Integer(2));
  list2.remove(new Integer(3));
  list2.remove(new Integer(4));
  list3.remove(new Integer(1));
  list3.remove(new Integer(3));
  list3.remove(new Integer(5));
  list4.remove(new Integer(3));
  list4.remove(new Integer(6));
  list5.remove(new Integer(3));
  list5.remove(new Integer(7));
  list6.remove(new Integer(3));
  list6.remove(new Integer(8));
  list7.remove(new Integer(3));
    //break;
  }
  if(s == 4){
  list2.remove(new Integer(3));
  list2.remove(new Integer(4));
  list2.remove(new Integer(5));
  list3.remove(new Integer(2));
  list3.remove(new Integer(4));
  list3.remove(new Integer(6));
  list4.remove(new Integer(1));
  list4.remove(new Integer(4));
  list4.remove(new Integer(7));
  list5.remove(new Integer(4));
  list5.remove(new Integer(8));
  list6.remove(new Integer(4));
  list7.remove(new Integer(4));
    //break;
  }
  if(s == 5){
  list2.remove(new Integer(4));
  list2.remove(new Integer(5));
  list2.remove(new Integer(6));
  list3.remove(new Integer(3));
  list3.remove(new Integer(5));
  list3.remove(new Integer(7));
  list4.remove(new Integer(2));
  list4.remove(new Integer(5));
  list4.remove(new Integer(8));
  list5.remove(new Integer(1));
  list5.remove(new Integer(5));
  list6.remove(new Integer(5));
  list7.remove(new Integer(5));
    //break;
  }
  if(s == 6){
  list2.remove(new Integer(5));
  list2.remove(new Integer(6));
  list2.remove(new Integer(7));
  list3.remove(new Integer(4));
  list3.remove(new Integer(6));
  list3.remove(new Integer(8));
  list4.remove(new Integer(3));
  list4.remove(new Integer(6));
  list5.remove(new Integer(2));
  list5.remove(new Integer(6));
  list6.remove(new Integer(1));
  list6.remove(new Integer(6));
  list7.remove(new Integer(6));
    //break;
  }
  if(s == 7){
  list2.remove(new Integer(6));
  list2.remove(new Integer(7));
  list2.remove(new Integer(8));
  list3.remove(new Integer(5));
  list3.remove(new Integer(7));
  list4.remove(new Integer(4));
  list4.remove(new Integer(7));
  list5.remove(new Integer(3));
  list5.remove(new Integer(7));
  list6.remove(new Integer(2));
  list6.remove(new Integer(7));
  list7.remove(new Integer(1));
  list7.remove(new Integer(7));
    //break;
  }
  if(s == 8){
  list2.remove(new Integer(7));
  list2.remove(new Integer(8));
  list3.remove(new Integer(6));
  list3.remove(new Integer(8));
  list4.remove(new Integer(5));
  list4.remove(new Integer(8));
  list5.remove(new Integer(4));
  list5.remove(new Integer(8));
  list6.remove(new Integer(3));
  list6.remove(new Integer(8));
  list7.remove(new Integer(2));
  list7.remove(new Integer(8));
  }
}

  if(r == 3){
  if(s == 1){
  list3.remove(new Integer(1));
  list3.remove(new Integer(2));
  list4.remove(new Integer(1));
  list4.remove(new Integer(3));
  list5.remove(new Integer(1));
  list5.remove(new Integer(4));
  list6.remove(new Integer(1));
  list6.remove(new Integer(5));
  list7.remove(new Integer(1));
  list7.remove(new Integer(6));
    //break;
  }
  if(s == 2){
  list3.remove(new Integer(1));
  list3.remove(new Integer(2));
  list3.remove(new Integer(3));
  list4.remove(new Integer(2));
  list4.remove(new Integer(4));
  list5.remove(new Integer(2));
  list5.remove(new Integer(5));
  list6.remove(new Integer(2));
  list6.remove(new Integer(6));
  list7.remove(new Integer(2));
  list7.remove(new Integer(7));
    //break;
  }
  if(s == 3){
  list3.remove(new Integer(2));
  list3.remove(new Integer(3));
  list3.remove(new Integer(4));
  list4.remove(new Integer(1));
  list4.remove(new Integer(3));
  list4.remove(new Integer(5));
  list5.remove(new Integer(3));
  list5.remove(new Integer(6));
  list6.remove(new Integer(3));
  list6.remove(new Integer(7));
  list7.remove(new Integer(3));
  list7.remove(new Integer(8));
    //break;
  }
  if(s == 4){
  list3.remove(new Integer(3));
  list3.remove(new Integer(4));
  list3.remove(new Integer(5));
  list4.remove(new Integer(2));
  list4.remove(new Integer(4));
  list4.remove(new Integer(6));
  list5.remove(new Integer(1));
  list5.remove(new Integer(4));
  list5.remove(new Integer(7));
  list6.remove(new Integer(4));
  list6.remove(new Integer(8));
  list7.remove(new Integer(4));
    //break;
  }
  if(s == 5){
  list3.remove(new Integer(4));
  list3.remove(new Integer(5));
  list3.remove(new Integer(6));
  list4.remove(new Integer(3));
  list4.remove(new Integer(5));
  list4.remove(new Integer(7));
  list5.remove(new Integer(2));
  list5.remove(new Integer(5));
  list5.remove(new Integer(8));
  list6.remove(new Integer(1));
  list6.remove(new Integer(5));
  list7.remove(new Integer(5));
    //break;
  }
  if(s == 6){
  list3.remove(new Integer(5));
  list3.remove(new Integer(6));
  list3.remove(new Integer(7));
  list4.remove(new Integer(4));
  list4.remove(new Integer(6));
  list4.remove(new Integer(8));
  list5.remove(new Integer(3));
  list5.remove(new Integer(6));
  list6.remove(new Integer(2));
  list6.remove(new Integer(6));
  list7.remove(new Integer(1));
  list7.remove(new Integer(6));
    //break;
  }
  if(s == 7){
  list3.remove(new Integer(6));
  list3.remove(new Integer(7));
  list3.remove(new Integer(8));
  list4.remove(new Integer(5));
  list4.remove(new Integer(7));
  list5.remove(new Integer(4));
  list5.remove(new Integer(7));
  list6.remove(new Integer(3));
  list6.remove(new Integer(7));
  list7.remove(new Integer(2));
  list7.remove(new Integer(7));
    //break;
  }
  if(s == 8){
  list3.remove(new Integer(7));
  list3.remove(new Integer(8));
  list4.remove(new Integer(6));
  list4.remove(new Integer(8));
  list5.remove(new Integer(5));
  list5.remove(new Integer(8));
  list6.remove(new Integer(4));
  list6.remove(new Integer(8));
  list7.remove(new Integer(3));
  list7.remove(new Integer(8));
  }
}
if(r == 4){
  if(s == 1){
list4.remove(new Integer(1));
list4.remove(new Integer(2));
list5.remove(new Integer(1));
list5.remove(new Integer(3));
list6.remove(new Integer(1));
list6.remove(new Integer(4));
list7.remove(new Integer(1));
list7.remove(new Integer(5));
    //break;
}
if(s == 2){
list4.remove(new Integer(1));
list4.remove(new Integer(2));
list4.remove(new Integer(3));
list5.remove(new Integer(2));
list5.remove(new Integer(4));
list6.remove(new Integer(2));
list6.remove(new Integer(5));
list7.remove(new Integer(2));
list7.remove(new Integer(6));
  //break;
}
if(s == 3){
list4.remove(new Integer(2));
list4.remove(new Integer(3));
list4.remove(new Integer(4));
list5.remove(new Integer(1));
list5.remove(new Integer(3));
list5.remove(new Integer(5));
list6.remove(new Integer(3));
list6.remove(new Integer(6));
list7.remove(new Integer(3));
list7.remove(new Integer(7));
  //break;
}
if(s == 4){
list4.remove(new Integer(3));
list4.remove(new Integer(4));
list4.remove(new Integer(5));
list5.remove(new Integer(2));
list5.remove(new Integer(4));
list5.remove(new Integer(6));
list6.remove(new Integer(1));
list6.remove(new Integer(4));
list6.remove(new Integer(7));
list7.remove(new Integer(4));
list7.remove(new Integer(8));
  //break;
}
if(s == 5){
list4.remove(new Integer(4));
list4.remove(new Integer(5));
list4.remove(new Integer(6));
list5.remove(new Integer(3));
list5.remove(new Integer(5));
list5.remove(new Integer(7));
list6.remove(new Integer(2));
list6.remove(new Integer(5));
list6.remove(new Integer(8));
list7.remove(new Integer(1));
list7.remove(new Integer(5));
  //break;
}
if(s == 6){
list4.remove(new Integer(5));
list4.remove(new Integer(6));
list4.remove(new Integer(7));
list5.remove(new Integer(4));
list5.remove(new Integer(6));
list5.remove(new Integer(8));
list6.remove(new Integer(3));
list6.remove(new Integer(6));
list7.remove(new Integer(2));
list7.remove(new Integer(6));
  //break;
}
if(s == 7){
list4.remove(new Integer(6));
list4.remove(new Integer(7));
list4.remove(new Integer(8));
list5.remove(new Integer(5));
list5.remove(new Integer(7));
list6.remove(new Integer(4));
list6.remove(new Integer(7));
list7.remove(new Integer(3));
list7.remove(new Integer(7));
  //break;
}
if(s == 8){
list4.remove(new Integer(7));
list4.remove(new Integer(8));
list5.remove(new Integer(6));
list5.remove(new Integer(8));
list6.remove(new Integer(5));
list6.remove(new Integer(8));
}
}
if(r == 5){
if(s == 1){
list5.remove(new Integer(1));
list5.remove(new Integer(2));
list6.remove(new Integer(1));
list6.remove(new Integer(3));
list7.remove(new Integer(1));
list7.remove(new Integer(4));
  //break;
}
if(s == 2){
list5.remove(new Integer(1));
list5.remove(new Integer(2));
list5.remove(new Integer(3));
list6.remove(new Integer(2));
list6.remove(new Integer(4));
list7.remove(new Integer(2));
list7.remove(new Integer(5));
  //break;
}
if(s == 3){
list5.remove(new Integer(2));
list5.remove(new Integer(3));
list5.remove(new Integer(4));
list6.remove(new Integer(1));
list6.remove(new Integer(3));
list6.remove(new Integer(5));
list7.remove(new Integer(3));
list7.remove(new Integer(6));
  //break;
}
if(s == 4){
list5.remove(new Integer(3));
list5.remove(new Integer(4));
list5.remove(new Integer(5));
list6.remove(new Integer(2));
list6.remove(new Integer(4));
list6.remove(new Integer(6));
list7.remove(new Integer(1));
list7.remove(new Integer(4));
list7.remove(new Integer(7));
  //break;
}
if(s == 5){
list5.remove(new Integer(4));
list5.remove(new Integer(5));
list5.remove(new Integer(6));
list6.remove(new Integer(3));
list6.remove(new Integer(5));
list6.remove(new Integer(7));
list7.remove(new Integer(2));
list7.remove(new Integer(5));
list7.remove(new Integer(8));
  //break;
}
if(s == 6){
list5.remove(new Integer(5));
list5.remove(new Integer(6));
list5.remove(new Integer(7));
list6.remove(new Integer(4));
list6.remove(new Integer(6));
list6.remove(new Integer(8));
list7.remove(new Integer(3));
list7.remove(new Integer(6));
  //break;
}
if(s == 7){
list5.remove(new Integer(6));
list5.remove(new Integer(7));
list5.remove(new Integer(8));
list6.remove(new Integer(5));
list6.remove(new Integer(7));
list7.remove(new Integer(4));
list7.remove(new Integer(7));
  //break;
}
if(s == 8){
list5.remove(new Integer(7));
list5.remove(new Integer(8));
list6.remove(new Integer(6));
list6.remove(new Integer(8));
list7.remove(new Integer(5));
list7.remove(new Integer(8));
}
}
if(r == 6){
if(s == 1){
list6.remove(new Integer(1));
list6.remove(new Integer(2));
list7.remove(new Integer(1));
list7.remove(new Integer(3));
  //break;
}
if(s == 2){
list6.remove(new Integer(1));
list6.remove(new Integer(2));
list6.remove(new Integer(3));
list7.remove(new Integer(2));
list7.remove(new Integer(4));
  //break;
}
if(s == 3){
list6.remove(new Integer(2));
list6.remove(new Integer(3));
list6.remove(new Integer(4));
list7.remove(new Integer(1));
list7.remove(new Integer(3));
list7.remove(new Integer(5));
  //break;
}
if(s == 4){
list6.remove(new Integer(3));
list6.remove(new Integer(4));
list6.remove(new Integer(5));
list7.remove(new Integer(2));
list7.remove(new Integer(4));
list7.remove(new Integer(6));
  //break;
}
if(s == 5){
list6.remove(new Integer(4));
list6.remove(new Integer(5));
list6.remove(new Integer(6));
list7.remove(new Integer(3));
list7.remove(new Integer(5));
list7.remove(new Integer(7));
  //break;
}
if(s == 6){
list6.remove(new Integer(5));
list6.remove(new Integer(6));
list6.remove(new Integer(7));
list7.remove(new Integer(4));
list7.remove(new Integer(6));
list7.remove(new Integer(8));
  //break;
}
if(s == 7){
list6.remove(new Integer(6));
list6.remove(new Integer(7));
list6.remove(new Integer(8));
list7.remove(new Integer(5));
list7.remove(new Integer(7));
  //break;
}
if(s == 8){
list6.remove(new Integer(7));
list6.remove(new Integer(8));
list7.remove(new Integer(6));
list7.remove(new Integer(8));
}
}
if(r == 7){
if(s == 1){
list7.remove(new Integer(1));
list7.remove(new Integer(2));
  //break;
}
if(s == 2){
list7.remove(new Integer(1));
list7.remove(new Integer(2));
list7.remove(new Integer(3));
//break;
}
if(s == 3){
list7.remove(new Integer(2));
list7.remove(new Integer(3));
list7.remove(new Integer(4));
  //break;
}
if(s == 4){
list7.remove(new Integer(3));
list7.remove(new Integer(4));
list7.remove(new Integer(5));
  //break;
}
if(s == 5){
list7.remove(new Integer(4));
list7.remove(new Integer(5));
list7.remove(new Integer(6));
  //break;
}
if(s == 6){
list7.remove(new Integer(5));
list7.remove(new Integer(6));
list7.remove(new Integer(7));
  //break;
}
if(s == 7){
list7.remove(new Integer(6));
list7.remove(new Integer(7));
list7.remove(new Integer(8));
  //break;
}
if(s == 8){
list7.remove(new Integer(7));
list7.remove(new Integer(8));
}
}
}
}


