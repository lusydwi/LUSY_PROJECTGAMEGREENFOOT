import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void gerak()
    {
        move(1);
        if (isAtEdge()){
            turn(40);
        }
    }
    
    public void tangkap()
    {
        if (isTouching (Connect.class)){
            removeTouching (Connect.class);
            MyWorld myw1 = (MyWorld)getWorld();
            myw1.upskor(20);
        }
        if (isTouching (Need.class)){
            removeTouching (Need.class);
            MyWorld myw1 = (MyWorld)getWorld();
            myw1.upskor(-10);
        }    
    }
    
    public void pindah()
    {
        if (Greenfoot.isKeyDown("left")){
            turn(-8);
        }
        if (Greenfoot.isKeyDown("right")){
            turn(8);
        }
        if (Greenfoot.isKeyDown("up")){
            turn(8);
        }
        if (Greenfoot.isKeyDown("down")){
            turn(-8);
        }
    }
    
}
        
 

