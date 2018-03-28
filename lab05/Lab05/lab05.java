import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab05
{
  static List<Integer> lista = new ArrayList<Integer>();
  static List<Integer> listb = new ArrayList<Integer>();
  static List<Integer> listc = new ArrayList<Integer>();
  static List<Integer> listd = new ArrayList<Integer>();
  static List<Integer> liste = new ArrayList<Integer>();
  static List<Integer> listf = new ArrayList<Integer>();
  static List<Integer> listg = new ArrayList<Integer>();
  static int r = 1;
  static int s;
  Scanner scan = new Scanner(System.in);
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    for(int i=1; i<9; i++){
    lista.add(i);
    }
for(int i=1; i<9; i++){
    listb.add(i);
    }
for(int i=1; i<9; i++){
    listc.add(i);
    }
for(int i=1; i<9; i++){
    listd.add(i);
    }
for(int i=1; i<9; i++){
    liste.add(i);
    }
for(int i=1; i<9; i++){
    listf.add(i);
    }
for(int i=1; i<9; i++){
    listg.add(i);
    }
while(r<8){
System.out.println("Where is the queen going?(Possible spots 0-7)";
s = scan.nextInt();
r++
  }
}

public static void setValidPlacement(int s, int r){
  if(r == 1){
  if(s == 1){
  lista.remove(new Integer(1));
  lista.remove(new Integer(2));
  listb.remove(new Integer(1));
  listb.remove(new Integer(3));
  listc.remove(new Integer(1));
  listc.remove(new Integer(4));
  listd.remove(new Integer(1));
  listd.remove(new Integer(5));
  liste.remove(new Integer(1));
  liste.remove(new Integer(6));
  listf.remove(new Integer(1));
  listf.remove(new Integer(7));
  listg.remove(new Integer(1));
  listg.remove(new Integer(8));
  }
  if(s == 2){
  lista.remove(new Integer(1));
  lista.remove(new Integer(2));
  lista.remove(new Integer(3));
  listb.remove(new Integer(2));
  listb.remove(new Integer(4));
  listc.remove(new Integer(2));
  listc.remove(new Integer(5));
  listd.remove(new Integer(2));
  listd.remove(new Integer(6));
  liste.remove(new Integer(2));
  liste.remove(new Integer(7));
  listf.remove(new Integer(2));
  listf.remove(new Integer(8));
  listg.remove(new Integer(2));
  }
  if(s == 3){
  lista.remove(new Integer(2));
  lista.remove(new Integer(3));
  lista.remove(new Integer(4));
  listb.remove(new Integer(1));
  listb.remove(new Integer(3));
  listb.remove(new Integer(5));
  listc.remove(new Integer(3));
  listc.remove(new Integer(6));
  listd.remove(new Integer(3));
  listd.remove(new Integer(7));
  liste.remove(new Integer(3));
  liste.remove(new Integer(8));
  listf.remove(new Integer(3));
  listg.remove(new Integer(3));
  }
  if(s == 4){
  lista.remove(new Integer(3));
  lista.remove(new Integer(4));
  lista.remove(new Integer(5));
  listb.remove(new Integer(2));
  listb.remove(new Integer(4));
  listb.remove(new Integer(6));
  listc.remove(new Integer(1));
  listc.remove(new Integer(4));
  listc.remove(new Integer(7));
  listd.remove(new Integer(4));
  listd.remove(new Integer(8));
  liste.remove(new Integer(4));
  listf.remove(new Integer(4));
  listg.remove(new Integer(4));
  }
  if(s == 5){
  lista.remove(new Integer(4));
  lista.remove(new Integer(5));
  lista.remove(new Integer(6));
  listb.remove(new Integer(3));
  listb.remove(new Integer(5));
  listb.remove(new Integer(7));
  listc.remove(new Integer(2));
  listc.remove(new Integer(5));
  listc.remove(new Integer(8));
  listd.remove(new Integer(1));
  listd.remove(new Integer(5));
  liste.remove(new Integer(5));
  listf.remove(new Integer(5));
  listg.remove(new Integer(5));
  }
  if(s == 6){
  lista.remove(new Integer(5));
  lista.remove(new Integer(6));
  lista.remove(new Integer(7));
  listb.remove(new Integer(4));
  listb.remove(new Integer(6));
  listb.remove(new Integer(8));
  listc.remove(new Integer(3));
  listc.remove(new Integer(6));
  listd.remove(new Integer(2));
  listd.remove(new Integer(6));
  liste.remove(new Integer(1));
  liste.remove(new Integer(6));
  listf.remove(new Integer(6));
  listg.remove(new Integer(6));
  }
  if(s == 7){
  lista.remove(new Integer(6));
  lista.remove(new Integer(7));
  lista.remove(new Integer(8));
  listb.remove(new Integer(5));
  listb.remove(new Integer(7));
  listc.remove(new Integer(4));
  listc.remove(new Integer(7));
  listd.remove(new Integer(3));
  listd.remove(new Integer(7));
  liste.remove(new Integer(2));
  liste.remove(new Integer(7));
  listf.remove(new Integer(1));
  listf.remove(new Integer(7));
  listg.remove(new Integer(7));
  }
  if(s == 8){
  lista.remove(new Integer(7));
  lista.remove(new Integer(8));
  listb.remove(new Integer(6));
  listb.remove(new Integer(8));
  listc.remove(new Integer(5));
  listc.remove(new Integer(8));
  listd.remove(new Integer(4));
  listd.remove(new Integer(8));
  liste.remove(new Integer(3));
  liste.remove(new Integer(8));
  listf.remove(new Integer(2));
  listf.remove(new Integer(8));
  listg.remove(new Integer(1));
  listg.remove(new Integer(8));
  }
}
  if(r == 2){
  if(s == 1){
  listb.remove(new Integer(1));
  listb.remove(new Integer(2));
  listc.remove(new Integer(1));
  listc.remove(new Integer(3));
  listd.remove(new Integer(1));
  listd.remove(new Integer(4));
  liste.remove(new Integer(1));
  liste.remove(new Integer(5));
  listf.remove(new Integer(1));
  listf.remove(new Integer(6));
  listg.remove(new Integer(1));
  listg.remove(new Integer(7));
  }
  if(s == 2){
  listb.remove(new Integer(1));
  listb.remove(new Integer(2));
  listb.remove(new Integer(3));
  listc.remove(new Integer(2));
  listc.remove(new Integer(4));
  listd.remove(new Integer(2));
  listd.remove(new Integer(5));
  liste.remove(new Integer(2));
  liste.remove(new Integer(6));
  listf.remove(new Integer(2));
  listf.remove(new Integer(7));
  listg.remove(new Integer(2));
  listg.remove(new Integer(8));
  }
  if(s == 3){
  listb.remove(new Integer(2));
  listb.remove(new Integer(3));
  listb.remove(new Integer(4));
  listc.remove(new Integer(1));
  listc.remove(new Integer(3));
  listc.remove(new Integer(5));
  listd.remove(new Integer(3));
  listd.remove(new Integer(6));
  liste.remove(new Integer(3));
  liste.remove(new Integer(7));
  listf.remove(new Integer(3));
  listf.remove(new Integer(8));
  listg.remove(new Integer(3));
  }
  if(s == 4){
  listb.remove(new Integer(3));
  listb.remove(new Integer(4));
  listb.remove(new Integer(5));
  listc.remove(new Integer(2));
  listc.remove(new Integer(4));
  listc.remove(new Integer(6));
  listd.remove(new Integer(1));
  listd.remove(new Integer(4));
  listd.remove(new Integer(7));
  liste.remove(new Integer(4));
  liste.remove(new Integer(8));
  listf.remove(new Integer(4));
  listg.remove(new Integer(4));
  }
  if(s == 5){
  listb.remove(new Integer(4));
  listb.remove(new Integer(5));
  listb.remove(new Integer(6));
  listc.remove(new Integer(3));
  listc.remove(new Integer(5));
  listc.remove(new Integer(7));
  listd.remove(new Integer(2));
  listd.remove(new Integer(5));
  listd.remove(new Integer(8));
  liste.remove(new Integer(1));
  liste.remove(new Integer(5));
  listf.remove(new Integer(5));
  listg.remove(new Integer(5));
  }
  if(s == 6){
  listb.remove(new Integer(5));
  listb.remove(new Integer(6));
  listb.remove(new Integer(7));
  listc.remove(new Integer(4));
  listc.remove(new Integer(6));
  listc.remove(new Integer(8));
  listd.remove(new Integer(3));
  listd.remove(new Integer(6));
  liste.remove(new Integer(2));
  liste.remove(new Integer(6));
  listf.remove(new Integer(1));
  listf.remove(new Integer(6));
  listg.remove(new Integer(6));
  }
  if(s == 7){
  listb.remove(new Integer(6));
  listb.remove(new Integer(7));
  listb.remove(new Integer(8));
  listc.remove(new Integer(5));
  listc.remove(new Integer(7));
  listd.remove(new Integer(4));
  listd.remove(new Integer(7));
  liste.remove(new Integer(3));
  liste.remove(new Integer(7));
  listf.remove(new Integer(2));
  listf.remove(new Integer(7));
  listg.remove(new Integer(1));
  listg.remove(new Integer(7));
  }
  if(s == 8){
  listb.remove(new Integer(7));
  listb.remove(new Integer(8));
  listc.remove(new Integer(6));
  listc.remove(new Integer(8));
  listd.remove(new Integer(5));
  listd.remove(new Integer(8));
  liste.remove(new Integer(4));
  liste.remove(new Integer(8));
  listf.remove(new Integer(3));
  listf.remove(new Integer(8));
  listg.remove(new Integer(2));
  listg.remove(new Integer(8));
  }
}

  if(r == 3){
  if(s == 1){
  listc.remove(new Integer(1));
  listc.remove(new Integer(2));
  listd.remove(new Integer(1));
  listd.remove(new Integer(3));
  liste.remove(new Integer(1));
  liste.remove(new Integer(4));
  listf.remove(new Integer(1));
  listf.remove(new Integer(5));
  listg.remove(new Integer(1));
  listg.remove(new Integer(6));
  }
  if(s == 2){
  listc.remove(new Integer(1));
  listc.remove(new Integer(2));
  listc.remove(new Integer(3));
  listd.remove(new Integer(2));
  listd.remove(new Integer(4));
  liste.remove(new Integer(2));
  liste.remove(new Integer(5));
  listf.remove(new Integer(2));
  listf.remove(new Integer(6));
  listg.remove(new Integer(2));
  listg.remove(new Integer(7));
  }
  if(s == 3){
  listc.remove(new Integer(2));
  listc.remove(new Integer(3));
  listc.remove(new Integer(4));
  listd.remove(new Integer(1));
  listd.remove(new Integer(3));
  listd.remove(new Integer(5));
  liste.remove(new Integer(3));
  liste.remove(new Integer(6));
  listf.remove(new Integer(3));
  listf.remove(new Integer(7));
  listg.remove(new Integer(3));
  listg.remove(new Integer(8));
}
  if(s == 4){
  listc.remove(new Integer(3));
  listc.remove(new Integer(4));
  listc.remove(new Integer(5));
  listd.remove(new Integer(2));
  listd.remove(new Integer(4));
  listd.remove(new Integer(6));
  liste.remove(new Integer(1));
  liste.remove(new Integer(4));
  liste.remove(new Integer(7));
  listf.remove(new Integer(4));
  listf.remove(new Integer(8));
  listg.remove(new Integer(4));
  }
  if(s == 5){
  listc.remove(new Integer(4));
  listc.remove(new Integer(5));
  listc.remove(new Integer(6));
  listd.remove(new Integer(3));
  listd.remove(new Integer(5));
  listd.remove(new Integer(7));
  liste.remove(new Integer(2));
  liste.remove(new Integer(5));
  liste.remove(new Integer(8));
  listf.remove(new Integer(1));
  listf.remove(new Integer(5));
  listg.remove(new Integer(5));
  }
  if(s == 6){
  listc.remove(new Integer(5));
  listc.remove(new Integer(6));
  listc.remove(new Integer(7));
  listd.remove(new Integer(4));
  listd.remove(new Integer(6));
  listd.remove(new Integer(8));
  liste.remove(new Integer(3));
  liste.remove(new Integer(6));
  listf.remove(new Integer(2));
  listf.remove(new Integer(6));
  listg.remove(new Integer(1));
  listg.remove(new Integer(6));
  }
  if(s == 7){
  listc.remove(new Integer(6));
  listc.remove(new Integer(7));
  listc.remove(new Integer(8));
  listd.remove(new Integer(5));
  listd.remove(new Integer(7));
  liste.remove(new Integer(4));
  liste.remove(new Integer(7));
  listf.remove(new Integer(3));
  listf.remove(new Integer(7));
  listg.remove(new Integer(2));
  listg.remove(new Integer(7));
  }
  if(s == 8){
  listc.remove(new Integer(7));
  listc.remove(new Integer(8));
  listd.remove(new Integer(6));
  listd.remove(new Integer(8));
  liste.remove(new Integer(5));
  liste.remove(new Integer(8));
  listf.remove(new Integer(4));
  listf.remove(new Integer(8));
  listg.remove(new Integer(3));
  listg.remove(new Integer(8));
  }
}
if(r == 4){
  if(s == 1){
listd.remove(new Integer(1));
listd.remove(new Integer(2));
liste.remove(new Integer(1));
liste.remove(new Integer(3));
listf.remove(new Integer(1));
listf.remove(new Integer(4));
listg.remove(new Integer(1));
listg.remove(new Integer(5));
if(s == 2){
listd.remove(new Integer(1));
listd.remove(new Integer(2));
listd.remove(new Integer(3));
liste.remove(new Integer(2));
liste.remove(new Integer(4));
listf.remove(new Integer(2));
listf.remove(new Integer(5));
listg.remove(new Integer(2));
listg.remove(new Integer(6));
}
if(s == 3){
listd.remove(new Integer(2));
listd.remove(new Integer(3));
listd.remove(new Integer(4));
liste.remove(new Integer(1));
liste.remove(new Integer(3));
liste.remove(new Integer(5));
listf.remove(new Integer(3));
listf.remove(new Integer(6));
listg.remove(new Integer(3));
listg.remove(new Integer(7));
}
if(s == 4){
listd.remove(new Integer(3));
listd.remove(new Integer(4));
listd.remove(new Integer(5));
liste.remove(new Integer(2));
liste.remove(new Integer(4));
liste.remove(new Integer(6));
listf.remove(new Integer(1));
listf.remove(new Integer(4));
listf.remove(new Integer(7));
listg.remove(new Integer(4));
listg.remove(new Integer(8));
}
if(s == 5){
listd.remove(new Integer(4));
listd.remove(new Integer(5));
listd.remove(new Integer(6));
liste.remove(new Integer(3));
liste.remove(new Integer(5));
liste.remove(new Integer(7));
listf.remove(new Integer(2));
listf.remove(new Integer(5));
listf.remove(new Integer(8));
listg.remove(new Integer(1));
listg.remove(new Integer(5));
}
if(s == 6){
listd.remove(new Integer(5));
listd.remove(new Integer(6));
listd.remove(new Integer(7));
liste.remove(new Integer(4));
liste.remove(new Integer(6));
liste.remove(new Integer(8));
listf.remove(new Integer(3));
listf.remove(new Integer(6));
listg.remove(new Integer(2));
listg.remove(new Integer(6));
}
if(s == 7){
listd.remove(new Integer(6));
listd.remove(new Integer(7));
listd.remove(new Integer(8));
liste.remove(new Integer(5));
liste.remove(new Integer(7));
listf.remove(new Integer(4));
listf.remove(new Integer(7));
listg.remove(new Integer(3));
listg.remove(new Integer(7));
}
if(s == 8){
listd.remove(new Integer(7));
listd.remove(new Integer(8));
liste.remove(new Integer(6));
liste.remove(new Integer(8));
listf.remove(new Integer(5));
listf.remove(new Integer(8));
}
}
if(r == 5){
if(s == 1){
liste.remove(new Integer(1));
liste.remove(new Integer(2));
listf.remove(new Integer(1));
listf.remove(new Integer(3));
listg.remove(new Integer(1));
listg.remove(new Integer(4));
if(s == 2){
liste.remove(new Integer(1));
liste.remove(new Integer(2));
liste.remove(new Integer(3));
listf.remove(new Integer(2));
listf.remove(new Integer(4));
listg.remove(new Integer(2));
listg.remove(new Integer(5));
if(s == 3){
liste.remove(new Integer(2));
liste.remove(new Integer(3));
liste.remove(new Integer(4));
listf.remove(new Integer(1));
listf.remove(new Integer(3));
listf.remove(new Integer(5));
listg.remove(new Integer(3));
listg.remove(new Integer(6));
if(s == 4){
liste.remove(new Integer(3,4,5));
listf.remove(new Integer(2,4,6));
listg.remove(new Integer(1,4,7));
}
if(s == 5){
liste.remove(new Integer(4));
liste.remove(new Integer(5));
liste.remove(new Integer(6));
listf.remove(new Integer(3));
listf.remove(new Integer(5));
listf.remove(new Integer(7));
listg.remove(new Integer(2));
listg.remove(new Integer(5));
listg.remove(new Integer(8));
}
if(s == 6){
liste.remove(new Integer(5));
liste.remove(new Integer(6));
liste.remove(new Integer(7));
listf.remove(new Integer(4));
listf.remove(new Integer(6));
listf.remove(new Integer(8));
listg.remove(new Integer(3));
listg.remove(new Integer(6));
if(s == 7){
liste.remove(new Integer(6));
liste.remove(new Integer(7));
liste.remove(new Integer(8));
listf.remove(new Integer(5));
listf.remove(new Integer(7));
listg.remove(new Integer(4));
listg.remove(new Integer(7));
}
if(s == 8){
liste.remove(new Integer(7));
liste.remove(new Integer(8));
listf.remove(new Integer(6));
listf.remove(new Integer(8));
listg.remove(new Integer(5));
listg.remove(new Integer(8));
}
}
if(r == 6)
if(s == 1){
listf.remove(new Integer(1));
listf.remove(new Integer(2));
listg.remove(new Integer(1));
listg.remove(new Integer(3));
if(s == 2){
listf.remove(new Integer(1));
listf.remove(new Integer(2));
listf.remove(new Integer(3));
listg.remove(new Integer(2));
listg.remove(new Integer(4));
if(s == 3){
listf.remove(new Integer(2));
listf.remove(new Integer(3));
listf.remove(new Integer(4));
listg.remove(new Integer(1));
listg.remove(new Integer(3));
listg.remove(new Integer(5));
if(s == 4){
listf.remove(new Integer(3,4,5));
listg.remove(new Integer(2,4,6));
}
if(s == 5){
listf.remove(new Integer(4));
listf.remove(new Integer(5));
listf.remove(new Integer(6));
listg.remove(new Integer(3));
listg.remove(new Integer(5));
listg.remove(new Integer(7));
if(s == 6){
listf.remove(new Integer(5));
listf.remove(new Integer(6));
listf.remove(new Integer(7));
listg.remove(new Integer(4));
listg.remove(new Integer(6));
listg.remove(new Integer(8));
if(s == 7){
listf.remove(new Integer(6));
listf.remove(new Integer(7));
listf.remove(new Integer(8));
listg.remove(new Integer(5));
listg.remove(new Integer(7));
}
if(s == 8){
listf.remove(new Integer(7,8));
listg.remove(new Integer(6,8));
}
}
if(r == 7){
if(s == 1){
listg.remove(new Integer(1));
listg.remove(new Integer(2));
}
if(s == 2){
listg.remove(new Integer(1));
listg.remove(new Integer(2));
listg.remove(new Integer(3));}
if(s == 3){
listg.remove(new Integer(2));
listg.remove(new Integer(3));
listg.remove(new Integer(4));
}
if(s == 4){
listg.remove(new Integer(3,4,5));
}
if(s == 5){
listg.remove(new Integer(4));
listg.remove(new Integer(5));
listg.remove(new Integer(6));
}
if(s == 6){
listg.remove(new Integer(5));
listg.remove(new Integer(6));
listg.remove(new Integer(7));
}
if(s == 7){
listg.remove(new Integer(6));
listg.remove(new Integer(7));
listg.remove(new Integer(8));
}
if(s == 8){
listg.remove(new Integer(7,8));
}
}
}
}

