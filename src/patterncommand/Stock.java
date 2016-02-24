/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterncommand;

/**
 *
 * @author William
 */
public class Stock {
   private String Portable = "Ordinateur Portable";
   private String Fixe = "Ordinateur Fixe";
   private int quantity = 10;

   public void buy(){
      System.out.println("Stock [ Name: "+Portable+", Quantity: " + quantity +" ] bought");
   }
   public void sell(){
      System.out.println("Stock [ Name: "+Fixe+", Quantity: " + quantity +" ] sold");
   }
}