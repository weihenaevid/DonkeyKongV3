import greenfoot.*;

/**
 * Write a description of class Finish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Finish extends World
{

    /**
     * Constructor for objects of class Finish.
     * 
     */
    public Finish()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
        addObject(new Floor2(), 125, 580);
        addObject(new Floor2(), 375, 580);
        addObject(new Floor2(), 625, 580);
        addObject(new Floor2(), 875, 580);
        addObject(new Floor2(), 1125, 580);
        addObject(new Floor2(), 1375, 580);
        showText("YOU WIN", 600, 300);
    }
}
