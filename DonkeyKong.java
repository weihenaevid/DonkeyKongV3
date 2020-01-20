import greenfoot.*;
public class DonkeyKong extends Actor
{
    long lastTime;
    public World world;
    
    public DonkeyKong(){
        GreenfootImage dk = getImage();
        dk.scale(75,100);
        setImage(dk);
    }
    public void act() 
    {
        
        if(isTouching(Mario.class))
        {
            //Greenfoot.setWorld(new Background2());

            //Greenfoot.stop();
        }
        /*if (background == lvl2){//check if there is a checkWorld function or smthn akin to that
           if(isTouching(Mario.class)){
              Greenfoot.setWorld(new background3());
            }
        }*/
        
        
        if(System.currentTimeMillis() - lastTime > 2500)
        {
            lastTime = System.currentTimeMillis();
            getWorld().addObject(new Barrel(), getX(), getY());
        }
    }    
}
