import java.awt.Color;
import java.util.Random;

/**
 * Class DrawDemo - provides some short demonstrations showing how to use the 
 * Pen class to create various drawings.
 *
 * @author Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class DrawDemo
{
    private Canvas myCanvas;
    private Random random;

    /**
     * Prepare the drawing demo. Create a fresh canvas and make it visible.
     */
    public DrawDemo()
    {
        myCanvas = new Canvas("Drawing Demo", 500, 400);
        random = new Random();
    }

    /**
     * Draw a square on the screen.
     */
    public void drawSquare()
    {
        Pen pen = new Pen(320, 260, myCanvas);
        pen.setColor(Color.BLUE);

        square(pen);
    }

    public void drawTriangle(){
        Pen pen = new Pen(320,260,myCanvas);
        pen.setColor(Color.GREEN);
        triangle(pen);
    }

    public void draw6sider(){
        Pen pen = new Pen(320,260,myCanvas);
        pen.setColor(Color.GREEN);
        sixer(pen);

    }

    public void polygon(int n){
        Pen pen = new Pen(320,260,myCanvas);
        pen.setColor(Color.GREEN);
        int sides = n;
        polygon(pen,sides);

    }

    public void spirale(int n){
        Pen pen = new Pen(320,260,myCanvas);
        pen.setColor(Color.GREEN);
        int limit = n;
        spirale(pen,limit);

    }

    private void spirale(Pen pen, int limit){
        int counter = 0;
        int strong = 100;
        while(counter < limit){
            for (int i=0; i<4; i++) {
                pen.move(strong);
                pen.turn(90);
            }
            strong -= 2;
            counter++;
        }
    }

    private void polygon(Pen pen, int sides){
        for(int i =0; i < sides ;i++){
            pen.move(100);
            int spin = -(360/sides);
            pen.turn(spin);
        }
    }

    private void sixer(Pen pen){
        for(int i = 0; i<6; i++){
            pen.move(100);
            pen.turn(-60);
        }
    }

    /**
     * Draw a wheel made of many squares.
     */
    public void drawWheel()
    {
        Pen pen = new Pen(250, 200, myCanvas);
        pen.setColor(Color.RED);

        for (int i=0; i<36; i++) {
            square(pen);
            pen.turn(10);
        }
    }

    /**
     * Draw a square in the pen's color at the pen's location.
     */
    private void square(Pen pen)
    {   
        for (int i=0; i<4; i++) {
            pen.move(100);
            pen.turn(90);
        }
    }

    private void triangle(Pen pen){
        for( int i = 0; i < 3; i++) {
            pen.move(100);
            pen.turn(-120);
        }
    }

    /**
     * Draw some random squiggles on the screen, in random colors.
     */
    public void colorScribble()
    {
        Pen pen = new Pen(250, 200, myCanvas);

        for (int i=0; i<10; i++) {
            // pick a random color
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            pen.setColor(new Color(red, green, blue));

            pen.randomSquiggle();
        }
    }

    /**
     * Clear the screen.
     */
    public void clear()
    {
        myCanvas.erase();
    }
    
    public void picture(){
        drawTriangle();
        drawSquare();
    
        myCanvas.drawString("Heelo", 200, 160);
        
    }
}
