import java.util.Scanner;
import java.util.Random;
import java.util.Queue;
import java.util.LinkedList;
import java.util.stream.Stream;
public class hotpotato{
Queue<Integer> q;
public static int winner(Queue queue){
  int a = 0;
//We assume that it takes each player one second to pass the potato, and that
//One round of hot potato takes 8 seconds
while(queue.peek() != null){
a = (int) queue.remove();
if(queue.peek() == null){
  queue.remove();
}
else{
  queue.add(a);
  int b = (int) queue.remove();
  queue.add(b);
  int c = (int) queue.remove();
  queue.add(c);
  int d = (int) queue.remove();
  queue.add(d);
  int e = (int) queue.remove();
  queue.add(e);
  int f = (int) queue.remove();
  queue.add(f);
  int g = (int) queue.remove();
  queue.add(g);
  queue.remove();
}
}
return a;
}
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("How many players are playing?");
int p = scan.nextInt();
Queue<Integer> q = new LinkedList<>(p);
for (int i=1; p+1>i; i++){
    q.add(i);
}
Stream.of(q.toString()).forEach(System.out::println);
int winner = winner(q);
System.out.println("The winner is " + winner);
}
}