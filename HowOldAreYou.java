/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howoldareyou;

    import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class HowOldAreYou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String name;
        int age;
        
        System.out.print("Hey, whats your name? ");
        name = keyboard.next();
        
        
        System.out.print("Ok, " + name + " how old are you? ");
        age = keyboard.nextInt();
        
        if(age < 16){
            System.out.println("You can't even drive " + name);
        }
        if(age < 18){
             System.out.println("You can't even vote " + name);
        }
        if(age < 25){
             System.out.println("You can't even rent a car " + name);
        }
        if(age > 25){
             System.out.println("You can do anything thats legal " + name);
        }
    }
    
}
