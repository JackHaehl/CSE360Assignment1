package cse360assignment02;

/**
 * A class that enables a total variable and a history of all operations done to that variable to exist.
 * @author Jack Haehl 1216722936
 *
 */ 
public class AddingMachine {
  private int total;
  private String receipt;
  
  
  /**
   * A Constructor that initializes the total and the beginning of the receipt.
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    receipt = "0";
  }
  
  /**
   * 
   * @return The current total after all adding and subtracting.
   */
  public int getTotal () {
    return total;
  }
  
  
  /**
   * 
   * @param Value to be added to the total.
   */
  public void add (int value) {
	  total += value;
	  receipt += (" + "+value);
  }
 
  
  /**
   * 
   * @param Value to be subtracted from the total.
   */
  public void subtract (int value) {
	  total -= value;
	  receipt += (" - "+value);
  }

  
  /**
   * @return The initial total value and a list of all operations done to it.
   */
  public String toString () {
    return receipt;
  }

  /**
   * Clears the receipt.
   */
  public void clear() {
	  receipt = ""+total;
  }
}