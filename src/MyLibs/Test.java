/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static javafx.application.Platform.exit;

/**
 *
 * @author Masay
 */
public class Test {

    
    public static void main(String[] args) throws IOException {
        BufferedReader bv = new
        BufferedReader (new InputStreamReader(System.in));
        String x,z;
        boolean y = true;
        
        Product p1 =new Product(40,50,30);
        
        Add a1 = new Add(0,0);
        Add a2 = new Add(0,0);
        Add a3 = new Add(0,0);
        int choice,addchoice,deletechoice;
      
        
        do
        {
        
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                 Construction Supply Inventory ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("[1] Add items");
        System.out.println("[2] Delete items");
        System.out.println("[3] Check Supplies");
        System.out.println("[4] Exit");
        System.out.print("Option: ");
        x = bv.readLine();
        choice = Integer.parseInt(x);
        switch (choice){
            case 1: System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("Choose Option 1\n");
                    System.out.println("Available Products:");
                    System.out.println("Current Amount | Product");
                    System.out.println("Choose from the option: ");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println(" [1]  " + p1.concrete +" || Concrete     ");
                    System.out.println(" [2]  " + p1.steel   +" || Steel   ");
                    System.out.println(" [3]  " + p1.lumber   +" || Lumber     ");
                    System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.print("Enter chosen option        : ");
            x = bv.readLine();
            addchoice = Integer.parseInt(x);
        ///////////////////////////////////////////////////////////////////
        if (addchoice==1) {
            
                               

                System.out.println("Product Name               : Concrete");
                System.out.println("Current Amount             : "+ p1.concrete);
                System.out.print("How many you want to add?  : ");
                x = bv.readLine();
                a1.addAmount = Integer.parseInt(x);
                a1.NewAmount = (p1.concrete+a1.addAmount);
                System.out.println("New Amount:"+a1.NewAmount);
                
                System.out.print("Do you want to try again? ");
                z = bv.readLine();
                break;
        }

        ////////////////////////////////////////////////////////////////////////
        else if (addchoice==2)  {             

                System.out.println("Product Name               : Steel");
                System.out.println("Current Amount             : "+ p1.steel);
                System.out.print("How many you want to add?  : ");
                x = bv.readLine();
                a2.addAmount = Integer.parseInt(x);
                a2.NewAmount = (p1.steel+a2.addAmount);
                System.out.println("New Amount:"+a2.NewAmount);
                break;
        }              
                
        else    if (addchoice==3)  {              

                System.out.println("Product Name               : Steel");
                System.out.println("Current Amount             : "+ p1.steel);
                System.out.print("How many you want to add?  : ");
                x = bv.readLine();
                a3.addAmount = Integer.parseInt(x);
               a3.NewAmount = (p1.steel+a3.addAmount);
                System.out.println("New Amount:"+a3.NewAmount);
                break;
        }          
              
                
                
            
             
        
            
        case 2:System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("Choose Option 1\n");
                    System.out.println("Available Products:");
                    System.out.println("Current Amount | Product");
                    System.out.println("Choose from the option: ");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println(" [1]  " + p1.concrete +" || Concrete     ");
                    System.out.println(" [2]  " +p1.steel   +" || Steel   ");
                    System.out.println(" [3]  " + p1.lumber   +" || Lumber     ");
                    System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.print("Enter chosen option        : ");
            x = bv.readLine();
            deletechoice = Integer.parseInt(x);
            if (deletechoice==1) {
                               

                System.out.println("Product Name               : Concrete");
                System.out.println("Current Amount             : "+ p1.concrete);
                System.out.print("How many you want to remove?  : ");
                x = bv.readLine();
                a1.addAmount = Integer.parseInt(x);
                a1.NewAmount = (p1.concrete-a1.addAmount);
                System.out.println("New Amount:"+a1.NewAmount);
               break;                
            }
                

              
        ////////////////////////////////////////////////////////////////////////
          else  if (deletechoice==2)  {           

                System.out.println("Product Name               : Steel");
                System.out.println("Current Amount             : "+p1.steel);
                System.out.print("How many you want to remove?  : ");
                x = bv.readLine();
                a2.addAmount = Integer.parseInt(x);
                a2.NewAmount = (p1.steel-a2.addAmount);
                System.out.println("New Amount:"+a2.NewAmount);
                break;
          }               
                
          else if (deletechoice==3){               

                System.out.println("Product Name               : Steel");
                System.out.println("Current Amount             : "+ p1.steel);
                System.out.print("How many you want to remove?  : ");
                x = bv.readLine();
                a3.addAmount = Integer.parseInt(x);
                a3.NewAmount = (p1.steel-a3.addAmount);
                System.out.println("New Amount:"+a3.NewAmount);
                break;
                       
          }
                
                
            
         
        
            
            ///////////////////////////////////////////////////////////////////
            case 3:
                
        int concrete3= a1.NewAmount+p1.concrete;
        int steel3= a2.NewAmount+p1.steel;
        int lumber3=a3.NewAmount+p1.lumber;
        System.out.println("\n\n\n\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                 O F F I C I A L   R E C E I P T");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println(" Product Name            : Concrete ");
        System.out.println(" Current Amount          : "+concrete3);
        System.out.println(" Product Name            : Steel ");
        System.out.println(" Current Amount          : "+steel3);
        System.out.println(" Product Name            : Lumber ");
        System.out.println(" Current Amount          : "+lumber3);
        
        break;
            
            case 4:
                 System.exit(0);
        }
        }
        
    
       while(y);
    }     

    
 
    
    
}
    
    

