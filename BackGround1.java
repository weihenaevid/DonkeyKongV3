import greenfoot.*;

/**
 * Write a description of class BackGround1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackGround1 extends World
{
    
    /**
     * Constructor for objects of class BackGround1.
     * 
     */
    public BackGround1()
    {    
        super(1100, 600, 1); 

        //top left floor
        addObject(new DK(), 180, 89);
        addObject(new Floor(), 125, 159);
        addObject(new Floor(), 375, 159);
        addObject(new Floor(), 625, 159);
        addObject(new Floor(), 875, 159);
        //middle left floor
        addObject(new Floor2(), 725, 400);
        addObject(new Floor2(), 975, 400);
        addObject(new Floor2(), 575,400);
        
        //bottom floor
        addObject(new Floor2(), 125, 1000);
        addObject(new Floor2(), 375, 1000);
        addObject(new Floor2(), 625, 1000);
        addObject(new Floor2(), 875, 1000);
        addObject(new Floor2(), 1125, 1000);
        addObject(new Floor2(), 1375, 1000);
        
        addObject(new Mario(), 1050, 940);
        
        GreenfootImage lives = new GreenfootImage("heart.png");
        GreenfootImage explostion = new GreenfootImage("explosion.png");
        lives.scale(30,30);
        getBackground().drawImage(lives, 1045,13);
   
    }
}


