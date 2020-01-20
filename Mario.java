import greenfoot.*;
public class Mario extends Actor
{
    int speed;
    String Marioimage = "mariopixelCopy.png";
    long lastTime;
    int Lives = 3;
    //int level = 0;
    int score = 0;
    
   /* public Mario(){
    GreenfootImage mario = getImage();
        mario.scale(60,60);
        setImage(mario);
    }*/
    
    public void score ()
    {
       if( score == 1 && isTouching(DK.class)){//in level 
        Greenfoot.setWorld(new Background2());
        //level = 2;
        score = 0;
        }
       if (score == 3 && isTouching (DK.class)){
         Greenfoot.setWorld(new Background3());
         //level = 3;
        }
       getWorld().showText("Score:" + score,980, 27);
       
    }
    public void act() 
    {
        
        //level = 1;
        
        score();
        speed= speed + 1;
        setLocation( getX(), getY() + speed);
        getWorld().showText(Lives +"",1080, 27);
             
        if(isTouching(Ladder.class) && Greenfoot.isKeyDown("c"))//if u touch the ladder and press c
        {
            //supposed to have something where it goes up
            
        }
        if(isTouching(Portal.class))//when mario touches portal
        {
            setLocation(500, 550);//supposed to change positions for the portal
        }
        if(isTouching(Barrel.class))//if touching a barrel
        {
            removeTouching(Barrel.class);//remove the barrel
            Lives = Lives - 1;//subtract a life
        }
        if(isTouching(coins.class))//if touching coins
        {
            removeTouching(coins.class);//remove the coin
            score = score +1;//add to the score
            
        }
        if (isTouching(Black.class))//if mario touches the bottom black part he dies
           {
               //getWorld().removeObject(this);
               getWorld().showText("GAME OVER", 550, 300);//if mario dies, tell the user
               Greenfoot.stop();//stop the program from running
              // return;
           }
        if(Lives == 0)
        {
            //Greenfoot.setWorld(new Finish());
            getWorld().showText("GAME OVER", 550, 300);
            Greenfoot.stop();
        }
        if(speed > 0)
        {
            while(isTouching(Floor.class))
            {
                speed = 0;
                setLocation(getX(), getY() - 1);
                if(Greenfoot.isKeyDown("up"))
                {
                    speed = - 22;
                }
            }
        }
        if(speed <= 0)
        {
            while(isTouching(Floor.class))
            {
                speed = 0;
                setLocation(getX(), getY() + 1);
            }
        }    
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
            /*if(System.currentTimeMillis() - lastTime > 500 && Marioimage.equals("mariopixelCopy.png"))
            {
                Marioimage = "marioleft.png";
                setImage("marioleft.png");
                lastTime = System.currentTimeMillis();
            } else {
                if(System.currentTimeMillis() - lastTime > 500)
                {
                    Marioimage = "mariopixelCopy.png";
                    setImage("mariopixelCopy.png");
                    lastTime = System.currentTimeMillis();
                }
            } */
            
           
            setImage("mariopixelCopy.png");
            while(isTouching(Floor.class))
            {
               move(1);
            } 
        } else {
            if(Greenfoot.isKeyDown("right"))
            {
               move(5);
               setImage("mariopixel.png");
                while(isTouching(Floor.class))
                {
                  move(-1);
               }
            } else{
                setImage("mario-big.png");
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            speed = 10;
        }
        
    
}
}
