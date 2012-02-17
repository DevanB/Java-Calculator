import javax.swing.*;

///////////////////////////////////////////////////////////// class Calc
/** Calc.java - A simple calculator.
  @author  Fred Swartz
  @version 2004-06-22 Rodenbach
*/
class Calc {
    //====================================================== method main
    public static void main(String[] args) {
        JFrame window = new CalcGUI();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }//end main
}//endclass Calc