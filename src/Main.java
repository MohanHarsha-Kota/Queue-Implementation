import java.util.Scanner;
import static java.lang.Boolean.TRUE;
import static java.lang.System.exit;

public class Main {

    static int N;
    static int start = -1;
    static int end = -1;

    static void push(int element, int[] QUEUE)
    {
        end++;
        if(end == N)
        {
            System.out.println("Queue is Full ");
            end--;
        }
        else
        {
            start = 0;
            QUEUE[end] = element;
        }
    }

    static int pop(int[] QUEUE)
    {
        int element;
        if(start == -1||start > end)
        {
            System.out.println("Queue is Already Empty");
            return -1;
        }
        else
        {
            element = QUEUE[start];
            QUEUE[start] = 0;
            start++;
            return element;
        }
    }
    public static void main(String[] args) {
	System.out.println("--- Linear Queue Implementation ---");
	Scanner scan = new Scanner(System.in);
    int id, element;
    System.out.println("Enter Length of Queue");
    N = scan.nextInt();
    int[] QUEUE = new int[N];
    while(TRUE)
    {
        System.out.println("Press \n 1. To Push element into the Queue \n 2. To Pop an element out of Queue \n 3. To View the Queue \n 4. Exit from the Program ");
        System.out.println("Enter your choice");
        id = scan.nextInt();
            switch (id)
            {
                case 1:
                    System.out.println("Enter a number");
                    element = scan.nextInt();
                    push(element, QUEUE);
                    break;
                case 2:
                    System.out.println("Removed Element is:  "+pop(QUEUE));
                    break;
                case 3:
                    System.out.println("Elements in Queue are:");
                    for(int i = 0; i< QUEUE.length;i++)
                        System.out.print(QUEUE[i]+ " ");
                    System.out.println();
                    break;
                case 4:
                    exit(0);
                default: System.out.println("Invalid Option");
            }
        }
    }
}
