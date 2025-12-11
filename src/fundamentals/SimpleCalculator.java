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
        
        //Stopping division by 0
        if(operator.equals(divide) && num2 == 0){
            System.out.print("invalid input");

        //outcome add
        }   else if(operator.equals(add)){
                sum = num1 + num2;
                System.out.print(sum);

        //outcome subtract
        }   else if(operator.equals(subtract)){
                sum = num1 - num2;
                System.out.print(sum);

        //outcome multiply
        }   else if(operator.equals(multiply)){
                sum = num1 * num2;
                System.out.print(sum);

        //outcome divide
        }   else if(operator.equals(divide)){
                sum = num1 / num2;
                System.out.print(sum);
        
        //Incase user puts in something other then prompted        
        }   else{
            System.out.print("Invalid input");
           

        }//end of if/if-else/else sequence

         scanner.close();
        
    }//end of main method

}//end of class
