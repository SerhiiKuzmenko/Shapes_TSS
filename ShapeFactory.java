import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Shape;


/**
 * A class that represents the factory entity for creating shapes
 */
public class ShapeFactory {
   public Shape shape;
   public BasicStroke stroke = new BasicStroke(3.0F);
   public Paint paint = Color.DARK_GRAY;;
   public int width = 25;
   public int height = 25;

   /**
    * Constructor of the ShapeFactory class
    *
    * @param figure figure type
    * @param style figure style
    */
   public ShapeFactory(Figures figure, Styles style){
      this.shape = figure.createFigure(this.width, this.height);
      this.paint = style.getColor(this.width, this.height);
      this.stroke = style.getStroke();
   }
   
   /**
    * Overloaded constructor of the ShapeFactory class
    *
    * Initialize the fields of the object depending
    * on the conditions of the task.
    *
    * @param shape_type
    */
   public ShapeFactory(int shape_type) {
      //Figures figure_type = Figures.HEXAGON;
      for (Figures fg : Figures.values()) {
         if (fg.getValue() == shape_type / 10) {
            this.shape = fg.createFigure(this.width, this.height);
            break;
         }
      }

      if (this.shape == null) {
         throw new Error("type is unsupported");
      }

      for (Styles sl : Styles.values()) {
         if (sl.getValue() == shape_type % 10) {
            this.paint = sl.getColor(this.width, this.height);
            this.stroke = sl.getStroke();
            break;
         }
      }
   }
}

