package Calculator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int x,y,choice=0;
        Scanner scan= new Scanner(System.in);
        while (choice!=5){
            System.out.println("Select an option from the menu-");
            System.out.println("1. ADDITION");
            System.out.println("2. SUBTRACTION");
            System.out.println("3. MULTIPLICATION");
            System.out.println("4. DIVISION");
            System.out.println("5. Exit");
            System.out.println("Enter the operation to be performed=");
            choice = scan.nextInt();
            switch (choice){
                case 1:
                    Addition addObj = new Addition();
                    System.out.print("Enter the first operand-");
                    x=scan.nextInt();
                    System.out.print("Enter the second operand-");
                    y=scan.nextInt();
                    System.out.println("Addition result= "+addObj.add(x,y));
                    break;
                case 2:
                    Subtraction subObj = new Subtraction();
                    System.out.print("Enter the first operand-");
                    x=scan.nextInt();
                    System.out.print("Enter the second operand-");
                    y=scan.nextInt();
                    System.out.println("Subtraction result= "+subObj.sub(x,y));
                    break;
                case 3:
                    Multiplication mulObj = new Multiplication();
                    System.out.print("Enter the first operand-");
                    x=scan.nextInt();
                    System.out.print("Enter the second operand-");
                    y=scan.nextInt();
                    System.out.println("Multiplication Result="+mulObj.mul(x,y));
                    break;
                case 4:
                    Division divObj=new Division();
                    System.out.print("Enter the first operand-");
                    x=scan.nextInt();
                    System.out.print("Enter the second operand-");
                    y=scan.nextInt();
                    System.out.println("Division result");
                    System.out.println("Quotient="+divObj.quotient(x,y));
                    System.out.println("Reminder="+divObj.reminder(x,y));
                    break;
                case 5:
                    System.out.println("Successful exit");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }



    }
}
