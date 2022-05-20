/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package stuednt_spring_friday_week1;
import java.util.Scanner ;
public class Stuednt_spring_friday_week1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String");
            String str = sc.nextLine();
           
            //myWord = 
            char[] myLetter = new char[str.length()]; 
                    
            for (int i = 0; i<myLetter.length;i++) {
                myLetter[i] = str.charAt(i);
            }
            // i;
            for (int i = 0; i<myLetter.length;i++) {
            System.out.println(myLetter[i]);
            }
            System.out.println("Printing in reverse order.....");
            for (int i = myLetter.length-1; i>=0; i-- ) {
                System.out.println(myLetter[i]);
            
                  
            }
            
            }
        
    }
    

