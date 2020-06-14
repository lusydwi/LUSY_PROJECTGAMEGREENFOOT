import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Seal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seal extends Player
{
    /**
     * Act - do whatever the Seal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MyWorld myw1 = (MyWorld)getWorld();
        getWorld().showText("SCORE : " +myw1.getskorseal(),60,20);
        gerak();
        tangkap();
        pindah();
        musuh();
    }    
    
    public void musuh()
    {
        if (isTouching (Rock.class)){
            MyWorld myw1 = (MyWorld)getWorld();
            myw1.updnyawa();
        
        if (myw1.getnyawaseal()<1){
            Greenfoot.setWorld (new Gameover(myw1.getskorseal()));
        }}
    }      
}
