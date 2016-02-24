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
public class PatternCommand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Stock ComputerStock = new Stock();

      BuyStock buyStockOrder = new BuyStock(ComputerStock);
      SellStock sellStockOrder = new SellStock(ComputerStock);

      Broker broker = new Broker();
      broker.takeOrder(buyStockOrder);
      broker.takeOrder(sellStockOrder);

      broker.placeOrders();
    }
    
}