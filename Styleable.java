import java.awt.*;

/**
 * An interface that defines methods to get style parameters.
 */
public interface Styleable {
    /**
     * Method for obtaining color.
     * @param width the width of the area for which you want to select the color
     * @param height the height of the area to select the color for
     * @return the color used for the style
     */
    public abstract Paint getColor(int width, int height);

    /**
     * Method to get the line type.
     * @return line type
     * */
    public abstract BasicStroke getStroke();
}
