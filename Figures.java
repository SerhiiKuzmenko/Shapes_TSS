import java.awt.*;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Enumeration of types of figures
 */
public enum Figures implements Creatable{
    HEXAGON(1){
        /**
         *  Implements a method of the Createble interface
         * @param width the width of the figure
         * @param height the height of the figure
         * @return an object of the Shape class representing the created shape
         */
        @Override
        public Shape createFigure(int width, int height){
            return createStar(3, new Point(0, 0), (double)width / 2.0D, (double)width / 2.0D);
        }
    },
    STAR(3){
        /**
         *  Implements a method of the Createble interface
         * @param width the width of the figure
         * @param height the height of the figure
         * @return an object of the Shape class representing the created shape
         */
        @Override
        public Shape createFigure(int width, int height){
            return createStar(5, new Point(0, 0), (double)width / 2.0D, (double)width / 4.0D);
        }
    },
    SQUARE(5){
        /**
         *  Implements a method of the Createble interface
         * @param width the width of the figure
         * @param height the height of the figure
         * @return an object of the Shape class representing the created shape
         */
        @Override
        public Shape createFigure(int width, int height){
            return new Rectangle2D.Double((double)(-width) / 2.0D, (double)(-height) / 2.0D, (double)width, (double)height);
        }
    },
    TRIANGLE(7){
        /**
         *  Implements a method of the Createble interface
         * @param width the width of the figure
         * @param height the height of the figure
         * @return an object of the Shape class representing the created shape
         */
        @Override
        public Shape createFigure(int width, int height){
            return createStar(3, new Point(0, 0), (double)width / 2.0D, (double)width / 2.0D);
        }
    },
    SECTOR(9){
        /**
         *  Implements a method of the Createble interface
         * @param width the width of the figure
         * @param height the height of the figure
         * @return an object of the Shape class representing the created shape
         */
        @Override
        public Shape createFigure(int width, int height){
            GeneralPath path = new GeneralPath();
            double tmp_height = Math.sqrt(2.0D) / 2.0D * (double)height;
            path.moveTo((double)(-width / 2), -tmp_height);
            path.lineTo(0.0D, -tmp_height);
            path.lineTo((double)(width / 2), tmp_height);
            path.closePath();
            return path;
        }
    };

    private final int figureIntType;

    /**
     * A constructor that sets a numeric value.
     * @param _figureIntType the number to which the figure corresponds
     */
    Figures(int _figureIntType){
        this.figureIntType = _figureIntType;
    }

    /**
     * A method that returns a number
     * @return figure integer Type
     */
    public int getValue(){
        return figureIntType;
    }

    /**
     * Creates a figure with the specified number of arms, placed at the specified center and with the specified radii.
     * @param arms the number of arms in the figure
     * @param center the center of the figure
     * @param rOuter the radius of the outer circle of the figure
     * @param rInner the radius of the inner circle of the figure
     * @return a shape (an object of the Shape class) that represents a shape
     */
    private static Shape createStar(int arms, Point center, double rOuter, double rInner) {
        double angle = 3.141592653589793D / (double)arms;
        GeneralPath path = new GeneralPath();

        for(int i = 0; i < 2 * arms; ++i) {
            double r = (i & 1) == 0 ? rOuter : rInner;
            Point2D.Double p = new Point2D.Double((double)center.x + Math.cos((double)i * angle) * r, (double)center.y + Math.sin((double)i * angle) * r);
            if (i == 0) {
                path.moveTo(p.getX(), p.getY());
            } else {
                path.lineTo(p.getX(), p.getY());
            }
        }

        path.closePath();
        return path;
    }

}
