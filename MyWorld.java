import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int skorseal;
    private int ball;
    private int cactus;
    private int nyawaseal = 1;

    public int getskorseal(){
        return skorseal;
    }

    public int getball(){
        return ball;
    }

    public int getcactus(){
        return cactus;
    }

    public void upskor(int x) {
        skorseal+=x;
    }

    public int getnyawaseal(){
        return nyawaseal;
    }

    public void updnyawa(){
        nyawaseal--;
    }

    
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ball ball = new Ball();
        addObject(ball,503,92);
        Fish fish = new Fish();
        addObject(fish,126,51);
        Fish fish2 = new Fish();
        addObject(fish2,76,143);
        Cactus cactus = new Cactus();
        addObject(cactus,50,57);
        Ball ball2 = new Ball();
        addObject(ball2,521,213);
        Fish fish3 = new Fish();
        addObject(fish3,510,153);
        Ball ball3 = new Ball();
        addObject(ball3,17,191);
        Fish fish4 = new Fish();
        addObject(fish4,215,136);
        Fish fish5 = new Fish();
        addObject(fish5,334,53);
        Rock rock = new Rock();
        addObject(rock,244,51);
        Cactus cactus2 = new Cactus();
        addObject(cactus2,570,64);
        Fish fish6 = new Fish();
        addObject(fish6,387,179);
        Rock rock2 = new Rock();
        addObject(rock2,445,57);
        Fish fish7 = new Fish();
        addObject(fish7,560,307);
        Ball ball4 = new Ball();
        addObject(ball4,145,117);
        Fish fish8 = new Fish();
        addObject(fish8,133,220);
        Cactus cactus3 = new Cactus();
        addObject(cactus3,297,227);
        Ball ball5 = new Ball();
        addObject(ball5,306,133);
        Seal seal = new Seal();
        addObject(seal,67,326);
        Rock rock3 = new Rock();
        addObject(rock3,372,358);
        Cactus cactus4 = new Cactus();
        addObject(cactus4,452,298);
        Fish fish9 = new Fish();
        addObject(fish9,254,338);
    }
}
