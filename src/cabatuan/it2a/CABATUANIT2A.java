package cabatuan.it2a;

import java.util.Scanner;
import java.util.Arrays;

public class CABATUANIT2A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fitness[] ft = new Fitness[100];
        
        System.out.print("Enter number of applicants: ");
        int app = sc.nextInt();
        sc.nextLine(); // Consume newline left-over

        for (int i = 0; i < app; i++) {
            ft[i] = new Fitness();
            
            // Collecting details of each applicant
            System.out.println("Enter details of application " + (i + 1) + ": ");
            boolean pass;
            int id;
            
            // Ensure unique ID
            while (true) {
                System.out.print("ID: ");
                id = sc.nextInt();
                sc.nextLine(); // Consume newline left-over

                pass = false;
                for (int x = 0; x < i; x++) {
                    if (ft[x] != null && ft[x].id == id) {
                        pass = true;
                        break;
                    }
                }
                
                if (pass) {
                    System.out.println("ID already exists, try again.");
                } else {
                    ft[i].id = id;
                    break;
                }
            }
            
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("BMI: ");
            double bmi = sc.nextDouble();
            sc.nextLine(); // Consume newline left-over
            
            boolean goalValid = false;
            
            while (!goalValid) {
                System.out.print("Fitness Goals (weight loss, Muscle Gain, General Fitness): ");
                String goals = sc.next();
                
                if (ft[i].Checker(goals)) {
                    ft[i].addProgram(ft[i].id, name, age, bmi, goals);
                    goalValid = true;
                } else {
                    System.out.println("Invalid fitness goals or other details. Please try again.");
                }
            }
        }
        
        // Displaying details of all applicants
        System.out.println("Details of all applicants:");
        for (int i = 0; i < app; i++) {
            if (ft[i] != null) {
                ft[i].viewProgram();
                System.out.println(); // Newline for better readability
            }
        }
        
        sc.close(); // Close the scanner
    }
}
