package fundamentals.BasicsIO;

import java.util.Scanner;

public class EchoInput{
    public static void main(String[] args){

        String name;
        int age;
        double height;
        boolean confirm;
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("What's your name?");
        name = scanner.nextLine();
        
        System.out.println("What age are you?");
        age = scanner.nextInt();
        
        System.out.println("What height are you?");
        height = scanner.nextDouble();
        
        System.out.println("Your name is " + name + ". You're " + age + " years old. You're height is " + height);

        System.out.println("Is this information correct? (True/False)");
        confirm = scanner.nextBoolean();

        System.out.println("You have pressed: " + confirm + ". This information can be updated at anytime.");
    
        scanner.close();

    }

}