/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca2tsktim;

import java.util.Scanner;

import ca2tsktim.MariaEduardaSum;
import ca2tsktim.AurelioSubtraction;
import ca2tsktim.LucasMultiplication;
import ca2tsktim.EliaquimDivision;


public class CA2TSKTIM {

    
    public static void main(String[] args) {
        // Initialyzing Scanner
        Scanner input = new Scanner(System.in);
        
        // Display number, first time the code runs it should be chosen.
        System.out.println("Choose your first number");
        float total = input.nextInt();
        // Iniialyzing flag for choice.
        int choice;
        
        // check for errors.
        try
        {
            // Loop & core logic
            do{    
                // Chosing number for operations
                System.out.println("Choose a number to operate with");
                float num = input.nextFloat();
                
                // Prompt user to choose.
                System.out.println("Choose your operation" + "Sum(1) Subtractio(2) Multiplication(3) Division(4) Stop(0)");
                choice = input.nextInt();
                
                // Operator, calling methods from colaborators if choise is 0, end the loop.
                switch(choice)
                {
                    case 0 :
                        System.out.println("End of operations");
                    case 1 :
                        total = MariaEduardaSum.sum(total, num);
                        break;
                    case 2 :
                        total = AurelioSubtraction.subtraction(total, num);
                        break;
                    case 3 :
                        total = LucasMultiplication.multiplication(total, num);
                        break;
                    case 4 :
                        total = EliaquimDivision.division(total, num);
                        break;
                    default:
                        System.out.println("Error");
                        break;
                } 
                // display results
                System.out.println("result: " + total);
            }while(choice != 0);
        }
        catch(Exception e)
        {
            System.out.println(e); 
        }
        

    }
    
}
