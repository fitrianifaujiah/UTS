package com.mycompany.uts;

import java.util.Scanner;

public class UTS {
    
    public static void main(String[] args) {
        int berat;
        double tinggi;
        double bmi;
        
       Scanner inputan = new Scanner(System.in);
            System.out.println("berapakah tinggi badan anda:");
                tinggi=inputan.nextInt();
            System.out.println("berapakah berat badan anda:");
                berat=inputan.nextInt();
                
        tinggi/=100;
        
        bmi=berat / (tinggi*tinggi);
            System.out.println("hasil Bmi anda:" + bmi);
            
        if(bmi<20){
            System.out.println("berat badan anda kurang");
        }
        else if (bmi<30){
            System.out.println("berat normal");
        }
        else if (bmi<40){
            System.out.println("berat badan anda agak gemuk");
        }
        else if (bmi>40){
            System.out.println("berat badan anda obesisitas");
        }
    }
    
}
