import java.awt.*;


/**
 * An interface that defines methods for creating shapes.
 */
public interface Creatable {
    /**
     * A method for creating a figure.
     * @param width the width of the figure
     * @param height the height of the figure
     * @return an object of the Shape class representing the created shape
     */
    public abstract Shape createFigure(int width, int height);
}
