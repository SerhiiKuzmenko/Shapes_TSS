import java.awt.*;

/**
 * Enumeration of shape styles
 */
public enum Styles implements Styleable{
    WIDTH_3(1){
        /**
         * Implements a method of the Styleable interface
         * @param width the width of the area for which you want to select the color
         * @param height the height of the area to select the color for
         * @return the color used for the style
         */
        @Override
        public Paint getColor(int width, int height){
            return Color.DARK_GRAY;
        }
        /**
         * Method to get the line type.
         * @return line type
         * */
        @Override
        public  BasicStroke getStroke(){
            return new BasicStroke(3.0F);
        }
    },
    WIDTH_7(4){
        /**
         * Implements a method of the Styleable interface
         * @param width the width of the area for which you want to select the color
         * @param height the height of the area to select the color for
         * @return the color used for the style
         */
        @Override
        public Paint getColor(int width, int height){
            return Color.DARK_GRAY;
        }
        /**
         * Method to get the line type.
         * @return line type
         * */
        @Override
        public  BasicStroke getStroke(){
            return new BasicStroke(7.0F);
        }
    },
    GRADIENT(7){
        /**
         * Implements a method of the Styleable interface
         * @param width the width of the area for which you want to select the color
         * @param height the height of the area to select the color for
         * @return the color used for the style
         */
        @Override
        public Paint getColor(int width, int height){
            return new GradientPaint((float)(-width), (float)(-height), Color.white, (float)width, (float)height, Color.gray, true);
        }
        /**
         * Method to get the line type.
         * @return line type
         * */
        @Override
        public  BasicStroke getStroke(){
            return new BasicStroke(3.0F);
        }
    },
    RED_COLOR(8){
        /**
         * Implements a method of the Styleable interface
         * @param width the width of the area for which you want to select the color
         * @param height the height of the area to select the color for
         * @return the color used for the style
         */
        @Override
        public Paint getColor(int width, int height){
            return Color.RED;
        }
        /**
         * Method to get the line type.
         * @return line type
         * */
        @Override
        public  BasicStroke getStroke(){
            return new BasicStroke(3.0F);
        }
    };

    private final int value;

    /**
     * A constructor that sets a numeric value
     * @param _value numeric value
     */
    Styles(int _value){
        this.value = _value;
    }

    /**
     * A method that returns a numeric value
     * @return numeric value
     */
    public int getValue(){
        return value;
    }

}
