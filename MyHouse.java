
/**
 * This class draws a house onscreen using shapes
 *
 * @author Liam Davidson
 * @version 01-11
 */
public class MyHouse
{
    // instance variables - replace the example below with your own
    private Circle sun;
    private Triangle roof;
    private Square base;
    private Square sky;
    private Square ground;

    /**
     * Constructor for objects of class MyHouse
     */
    public MyHouse()
    {
        // initialise instance variables
        sun = new Circle();
        roof = new Triangle();
        base = new Square();
        sky = new Square();
        ground = new Square();
        
        //invoke the draw house method
        drawHouse();
        
    }

    /**
     * Draw the house for us
     */
    public void drawHouse()
    {
        //draw sky
        sky.makeVisible();
        sky.changeSize(1000);
        sky.changeColor("blue");
        sky.moveHorizontal(-300);
        sky.moveVertical(-300);
        
        //draw the sun
        sun.moveHorizontal(225);
        sun.moveVertical(-50);
        sun.changeSize(100);
        sun.changeColor("yellow");
        sun.makeVisible();
        
        //draw the ground
        ground.makeVisible();
        ground.changeColor("green");
        ground.changeSize(1000);
        ground.moveHorizontal(-300);
        ground.moveVertical(200);
        
        //draw the base
        base.makeVisible();
        base.changeColor("black");
        base.changeSize(120);
        base.moveVertical(100);
        
        //draw the roof
        roof.makeVisible();
        roof.changeColor("red");
        roof.changeSize(70, 200);
        roof.moveVertical(70);
        roof.moveHorizontal(70);
        
        
        
        
        
    }
}


