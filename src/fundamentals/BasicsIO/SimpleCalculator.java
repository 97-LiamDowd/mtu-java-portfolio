package fundamentals.BasicsIO;

import java.util.Scanner;

public class SimpleCalculator{
    public static void main(String[] args){
        
        //declaring variables
        int sum;
        int num1, num2;
        String operator;
        
        //for user input
        Scanner scanner = new Scanner(System.in);

        //Last updated: create each operator as such - String name = "Symbol"
        String add = "+";
        String subtract = "-";
        String multiply = "*";
        String divide = "/";

        //first user input
        System.out.print("Choose a number = ");
        num1 = scanner.nextInt();

        //add = +, subtract = -, multiply = *, divide = /
        //prompting user input an operator
        System.out.print("Choose between " + add + " " + subtract + " " + multiply + " " + divide + " = ");
        operator = scanner.next();

        //second user input
        System.out.print("Choose another number = ");
        num2 = scanner.nextInt();

        //last update = use operator.equals(add/subtract/multiply/divide)

        //outcome add
        if(operator.equals(add)){
            sum = num1 + num2;

        //outcome subtract
        }   else if(operator.equals(subtract)){
                sum = num1 - num2;

        //outcome multiply
        }   else if(operator.equals(multiply)){
                sum = num1 * num2;

        //outcome divide
        }   else if(operator.equals(divide)){
                sum = num1 / num2;

        }   else{
            System.out.print("Invalid input");
            return;
        }
        
        System.out.print(sum);
        
        scanner.close();

    }//end of main method

}//end of class
