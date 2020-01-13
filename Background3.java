import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background3 extends World
{

    /**
     * Constructor for objects of class Background3.
     * 
     */
    public Background3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1);
        addObject(new DK(), 180, 69);
        addObject(new Floor3(), 125, 139);
        addObject(new Floor3(), 375, 139);
    }
}
