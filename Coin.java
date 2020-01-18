
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Actor
{
    int level = 0;
    int score = 0;
    public Coin(){
      GreenfootImage coin = getImage();
      coin.scale(30,30);
      setImage(coin);
    }
    
     /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       level = 1;
       if(getOneIntersectingObject(Mario.class)!=null)
        {
            //getWorld().removeObject(getOneIntersectingObject(Mario.class));
            getWorld().removeObject(this);
            //Greenfoot.setWorld(new Finish());
            score += 1;
            
       }
       
       if( score == 1 && isTouching(DK.class)){
        Greenfoot.setWorld(new Background2());
        level = 2;
        score = 0;
        }
       if (score == 3&& isTouching (DK.class)){
         Greenfoot.setWorld(new Background3());
         level = 3;
        }
       getWorld().showText("Score:" + score,980, 27);
       getWorld().showText("Level:" + level, 880, 27); 
    }    
}
