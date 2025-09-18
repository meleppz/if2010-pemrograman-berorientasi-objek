public class Shape {
    private Color color;
    private String name;

    /**
     * Konstruktor Shape
     * 
     * @param color
     * @param name
     */
    public Shape(Color color, String name) {
        System.out.printf("Shape is being built with color RGB(%d, %d, %d) and name '%s'\n", color.getRed(), color.getGreen(), color.getBlue(), name);
        this.color = color;
        this.name = name;
    }

    /**
     * Default constructor for Shape
     */
    public Shape() {
        // TODO: Print constructor message 
        System.out.println("Shape is being built with default color and name 'Default'");

        this.color = new Color(0, 0, 0);
        this.name = "Default";
        // TODO: Initialize color with a new Color(0, 0, 0)
        // TODO: Initialize name with "Default"
    }

    /**
     * Constructor with name parameter
     * 
     * @param name the name of the shape
     */
    public Shape(String name) {
        // TODO: Print constructor message 
        System.out.printf("Shape is being built with default color and name '%s'\n", name);
        this.color = new Color(0, 0, 0);
        this.name = name;

        // TODO: Initialize color with a new Color(0, 0, 0)
        // TODO: Initialize name with the parameter value
    }

    /**
     * Constructor with RGB parameters
     * 
     * @param r red component (0-255)
     * @param g green component (0-255)
     * @param b blue component (0-255)
     */
    public Shape(int r, int g, int b) {
        // TODO: Print constructor message 
        System.out.printf("Shape is being built with color RGB(%d, %d, %d) and default name 'Default'\n", r, g, b);
        // Example: if r=255, g=0, b=0, print
        // "Shape is being built with color RGB(255, 0, 0) and default name 'Default'"

        this.color = new Color(r, g, b);
        this.name = "Default";
    }

    /**
     * getColor
     * 
     * @return color
     */
    public Color getColor() {
        return this.color;
    }

    /**
     * setColor
     * 
     * @param color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * getName
     * 
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * setName
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}