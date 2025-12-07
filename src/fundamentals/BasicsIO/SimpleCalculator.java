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

        System.out.print("Choose a number = ");
        num1 = scanner.nextInt();

        //add = +, subtract = -, multiply = *, divide = / 
        System.out.print("Choose between " + add + " ");
        operator = scanner.next();

        System.out.print("Choose another number = ");
        num2 = scanner.nextInt();

        //last update = use operator.equals(add/subtract/multiply/divide)
        if(operator.equals(add)){
            sum = num1 + num2;
            System.out.print(sum);
        }


        scanner.close();

    }//end of main method

}//end of class
