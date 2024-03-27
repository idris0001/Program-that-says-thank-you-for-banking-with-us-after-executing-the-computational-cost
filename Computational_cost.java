/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computational_cost;
import java.util.Scanner; 

/**
 *
 * @author Monet
 */
public class Computational_cost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in); 
//        equation solver for computational cost for the Autonomous Underwater Vehicle vs that of sensors
int c, th, tcp, tse; 
    String re;    
do {
System.out.print("supply th");
      th = input.nextInt();
        
      System.out.print("supply tcp");
      tcp = input.nextInt();
      
       System.out.print("supply tse");
      tse = input.nextInt();
      
      
 c = (16*th)+(4*tcp)+(2*tse); 
        System.out.println("Answer = "+c); 
  
        System.out.println("Coninue? 'yes', 'Yes', 'YES', 'y', 'Y' 'no'");
     re = input.next();
}
//    System.out.println("re");
//
while (re.equals("y") || re.equals ("Yes") || re.equals ("Y") || re.equals ("YES") || re.equals ("yes")); 
        System.out.println("Thank for banking with us");
   }
    
}
