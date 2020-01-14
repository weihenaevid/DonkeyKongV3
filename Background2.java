import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background2 extends World
{

    /**
     * Constructor for objects of class Background2.
     * 
     */
    public Background2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
        
        //top right floor
        addObject(new DK(), 180, 69);
        addObject(new Floor(), 125, 139);
        addObject(new Floor(), 375, 139);
        addObject(new Floor(), 625, 139);
                
        addObject(new Floor2(), 975, 250);
        addObject(new Platform1(), 700,350);
        addObject(new Platform1(), 375,450);
        
        //bottom floor
        addObject(new Floor2(), 125, 1000);
        addObject(new Floor2(), 375, 1000);
        addObject(new Floor2(), 625, 1000);
        addObject(new Floor2(), 875, 1000);
        addObject(new Floor2(), 1125, 1000);
        addObject(new Floor2(), 1375, 1000);
        
        addObject(new Mario(), 1050, 940);
        
        GreenfootImage lives = new GreenfootImage("heart.png");
        lives.scale(30,30);
        getBackground().drawImage(lives, 1045,13);
    }
}
