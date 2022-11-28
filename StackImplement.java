//Stack implementation in java
//Methods -> 1.Push  2.Pop 3.Display 4.Exit

import java.util.Scanner;

public class StackImplement {
    public static void main(String[] args) {
        //Scanner Class For Input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Stack : ");
        int max = sc.nextInt();

        //Variable Declerations
        int[] array = new int[max];
        int choice = 0;
        int top = -1;

        while (choice != 4) {
            System.out.println("******************** Stack Data Structure ******************** ");
            System.out.println(" \t\t1.Push \n \t\t2.Pop \n \t\t3.Display \n \t\t4.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    //Push Operation
                    System.out.println("!!!!!!!!!!!! Push Operation !!!!!!!!!!!!");
                    if (top == max ) {
                        System.out.println("Stack is Full");
                    } else {
                        top = top + 1;
                        System.out.println("Enter the Element : ");
                        array[top] = sc.nextInt();
                    }
                    break;

                case 2:
                    // Pop operation
                    System.out.println("!!!!!!!!!!!! Pop Operation !!!!!!!!!!!!");
                    if (top == -1) {
                        System.out.println("Stack is Empty");
                    } else {
                        int deleteelement = array[top];
                        top = top - 1;
                        System.out.println("Deleted Element is " + deleteelement);
                    }
                    break;

                case 3:
                    //Display Operation
                    System.out.println("!!!!!!!!!!!! Display Operation !!!!!!!!!!!!");
                    if (top != -1) {
                        for(int i = 0; i < top+1; i++)
                            System.out.println("\t"+array[i]);
                    }else{
                        System.out.println("Staxk  is Empty");
                    }
                    break;

                case 4:
                    //Exit
                    System.out.println("Thank You !!!!!");
                    break;
            }
        }

        sc.close();
    }
}
