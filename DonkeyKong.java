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
            Greenfoot.setWorld(new Finish());

            Greenfoot.stop();
        }
        if(System.currentTimeMillis() - lastTime > 2500)
        {
            lastTime = System.currentTimeMillis();
            getWorld().addObject(new Barrel(), getX(), getY());
        }
    }    
}
