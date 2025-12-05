package fundamentals.BasicsIO;

import java.util.Scanner;

public class EchoInput{
    public static void main(String[] args){

        String name;
        int age;
        double height;
        boolean student;
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("What's your name?");
        name = scanner.nextLine();
        
        System.out.println("What age are you?");
        age = scanner.nextInt();
        
        System.out.println("What height are you?");
        height = scanner.nextDouble();
        
        System.out.println("Are you a student? (True/False)");
        student = scanner.nextBoolean();

        
        
        


        

        scanner.close();

    }

}