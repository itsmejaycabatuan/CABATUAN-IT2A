
package cabatuan.it2a;


import java.util.Arrays;

public class Fitness {
    int id;
    String name;
    int age;
    double bmi;
    String fgoals;
    
    public void addProgram(int id, String name, int age, double bmi, String fgoals){
        this.id = id;
        this.name = name;
        this.age = age;
        this.bmi = bmi;
        this.fgoals = fgoals;
    }
    public void viewProgram(){
        
       
        System.out.printf("%-10d %-10s %-10d %-10f %-10s",this.id, this.name, this.age, this.bmi, this.fgoals );
   
    }
    
    public boolean Checker(String goals){
        
        String[] validGoals = {"weight loss", "Muscle Gain", "General Fitness"};
        
        if(this.age > 65){
            System.out.println("Not eligible (Age to High) ");
            return false;
        }
        if(this.age < 18){
            System.out.println("Not Eligible (Age to low) ");
            return false;
        }
        if (this.bmi < 18.5 || this.bmi > 30.0){
            return false;
        }
        if(Arrays.asList(validGoals).contains(fgoals)){
            return true;
        }
        return true;
        
    }
    
}
