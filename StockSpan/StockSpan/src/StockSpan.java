import java.util.Stack;
import java.util.Arrays;
import java.util.Scanner;
 
public class StockSpan{
static void calculateSpan(int price[], int n, int S[]){
    // Create a stack and push index of first element to it
    Stack<Integer> st= new Stack<>();
    st.push(0); 
     
    // Span value of first element is always 1
    S[0] = 1;
     
    // Calculate span values for rest of the elements
    for (int i=1; i<n; i++)
    {
        // Pop elements from stack while stack is not empty and top of
        // stack is smaller than price[i]
    	while (!st.empty() && price[st.peek()] <= price[i])
            st.pop();
 
        // If stack becomes empty, then price[i] is greater than all elements
        // on left of it, i.e., price[0], price[1],..price[i-1]. Else price[i]
        // is greater than elements after top of stack
        S[i] = (st.empty())? (i + 1) : (i - st.peek());
 
        // Push this element to stack
        st.push(i);
    }
}
 
// A utility function to print elements of array
static void printArray(int arr[])
{
    System.out.print(Arrays.toString(arr));
}
 
// Driver method
public static void main(String[] args){	
	Scanner scan = new Scanner(System.in);
	System.out.println("Please type in a stocks price, followed by the enter key. (6 stocks)");
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	int d = scan.nextInt();
	int e = scan.nextInt();
	int f = scan.nextInt();
    int price[] = {a, b, c, d, e, f};
    int n = price.length;
    int S[]=new int[n];
     
    // Fill the span values in array S[]
    calculateSpan(price, n, S);

    // print the calculated span values
    System.out.println(S[5]+"\nWhich additional stock span would you like printed? (1,2,3,4,5)");
    	int t = scan.nextInt();
    	if(t==1){ 
    		System.out.println( "1: "+ S[0]);
    	}
    	else if(t==2){ 
    		System.out.println( "2: "+ S[1]);
    	}
    	else if(t==3){ 
    		System.out.println( "3: "+ S[2]);
    	}
    	else if(t==4){ 
    		System.out.println( "4: "+ S[3]);
    	}
    	else if(t==5){ 
    		System.out.println( "5: "+ S[4]);
    	}
   
    	else{
    		System.out.println("Error, exiting...");
    
    		System.exit(0);
    	}
    }
}
