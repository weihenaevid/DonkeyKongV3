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
        
        addObject(new Peach(), 65, 255);
        addObject(new Help(), 110, 185);
        addObject(new Floor(), 125, 139);
        addObject(new Floor(), 375, 139);
        addObject(new Floor(), 625, 139);
        addObject(new Floor(), 875, 139);
        
        addObject(new Portal(), 900, 300);
      
        addObject(new Floor2(), 200, 450);
        addObject(new Floor2(), 80,300);
        addObject(new Floor2(), 550,600);
        
        addObject(new Floor3(), 1050, 139);
        addObject(new Ladder(), 230, 355);
        addObject(new DonkeyKong(), 150, 250);
        addObject(new coins(), 400,500);
        addObject(new Mario(), 50, 90);
        
        showText("Level: 3", 880, 27); 
    }
}
