import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * A class for implementing a graphical interface.
 */
public class TitlesFrame extends JFrame {
   /**
    * Class constructor - initializes the graphic element.
    */
   public TitlesFrame() {
      this.initUI();
   }

   /**
    * A method that adds elements to the canvas of a graphic element.
    * <p>
    * Adds a title, registers standard behavior for a window,
    * sets the figure that will be displayed, sets the dimensions and
    * centers the window on the monitor.
    * </p>
    */
   private void initUI() {
      this.setTitle("Кривые фигуры");
      this.setDefaultCloseOperation(3);
      this.add(new TitlesPanel(34));
      //this.add(new TitlesPanel(Figures.HEXAGON, Styles.RED_COLOR));
      this.setSize(350, 350);
      this.setLocationRelativeTo((Component)null);
   }

   /**
    * The main method that starts the program is the entry point.
    *
    * @param args (not used)
    */
   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            TitlesFrame ps = new TitlesFrame();
            ps.setVisible(true);
         }
      });
   }
}
