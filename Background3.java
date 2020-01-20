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
        addObject(new Floor(), 875, 139);//top floor
        
        addObject(new Portal(), 900, 300);//portal
      
        addObject(new Floor(), 200, 450);//the other 3 floors
        addObject(new Floor(), 80,300);
        addObject(new Floor(), 500,550);
        
        addObject(new Floor3(), 1050, 139);//plank that moves up and down
     //   addObject(new Plank_up(), 1050, 300);
        addObject(new Ladder(), 230, 355);//ladder
        addObject(new DonkeyKong(), 150, 250);//dk
        addObject(new coins(), 100,360);//coin
        addObject(new Mario(), 50, 90);//mario
        
        
        GreenfootImage lives = new GreenfootImage("heart.png");//lives
        lives.scale(30,30);
        getBackground().drawImage(lives, 1045,13);
        showText("Level: 3", 880, 27); 
    }
}
