import java.util.Scanner;
import java.util.Random;
import java.util.Queue;
public class hotPotato{
public static int winner(Queue q){
//We assume that it takes each player one second to pass the potato, and that
//One round of hot potato takes 8 seconds
while(!q.peek() == null){
int a = q.remove();
if(q.peek() == null){
  return a;
}
else{
  q.push(a);
  int b = q.remove();
  q.push(b);
  int c = q.remove();
  q.push(c);
  int d = q.remove();
  q.push(d);
  int e = q.remove();
  q.push(e);
  int f = q.remove();
  q.push(f);
  int g = q.remove();
  q.push(g);
  q.remove();
}
}
}
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
Queue<Integer> q = new LinkedList<>();
System.out.println("How many players are playing?");
int p = scan.nextInt;
for (int i=p; i>0; i--){
    q.add(i);
}
int winner = winner(q)
System.out.println("The winner is " + winner);
}
}
