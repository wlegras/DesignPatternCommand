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
public class SellStock implements Order{
    private Stock ComputerStock;

   public SellStock(Stock ComputerStock){
      this.ComputerStock = ComputerStock;
   }

   public void execute() {
      ComputerStock.sell();
   }
}