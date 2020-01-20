import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plank_up here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plank_up extends Floor2
{
    public Plank_up(){
        GreenfootImage image = getImage();
        image.scale(50,50);
        setImage(image);
    }
    /**
     * Act - do whatever the Plank_up wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
      
       turn(-90);
       move(2);
       turn(90);
       //move(4);
    }  
    }   

    
        

