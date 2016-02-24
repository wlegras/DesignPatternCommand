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
public class BuyStock implements Order{
    private Stock ComputerStock;

   public BuyStock(Stock ComputerStock){
      this.ComputerStock = ComputerStock;
   }

   public void execute() {
      ComputerStock.buy();
   }
}