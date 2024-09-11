

package cabatuan.it2a;
import java.util.Scanner;


public class CABATUANIT2A {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Fitness[] ft = new Fitness[100];
        
        System.out.print("Enter number of applicants:");
        int app = sc.nextInt();
        
        int i, id;
        
        for ( i = 0; i < app; i++){
            ft[i] = new Fitness();
            
            System.out.println("Enter details of application:"+(i + 1)+": ");
            boolean pass;
            while(true){
                System.out.print("ID: ");
                 id = sc.nextInt();
                pass = false;
            for (int x = 0; x < i; x++){
                if(ft[x] != null && ft[x].id == id){
                    pass = true;
                    break;
                }
            }  
            if(pass){
                System.out.println("- Id Already Exist - , Try Again");
            }else{
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
            
            boolean goal = false;
            
            while(!goal){
                
            System.out.print("Fitness Goals: ");
            String goals = sc.next();
            
            if(ft[i].Checker(goals)){
            ft[i].addProgram(ft[i].id, name, age, bmi, goals);
            goal = true;
            }else{
                System.out.println(" - Invalid -");
            }
                
                
            }
        }
            for ( i = 0; i < app; i++){
             ft[i].viewProgram();
            }
    }
    
}
