import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BridgeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BridgeWorld4 extends World
{
    /**
     * Constructor for objects of class BridgeWorld.
     * 
     */
    public BridgeWorld4()
    {   
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setPaintOrder(PapanNyawa4.class, papanscore4.class,Crash.class,car4.class,cewek4.class,other_car4.class,flower4.class,Asphalt2.class,tree4.class,rock4.class,Background2.class);
        
        level4.scores = new papanscore4();
        addObject(level4.scores,486,50); 
        level4.scores.setScore(level4.score);
        
        level4.lives = new PapanNyawa4();
        addObject(level4.lives,85,54); 
        level4.lives.setLives(level4.nyawa);
        
        cewek4 cewek = new cewek4();
        addObject(cewek,485,159);
       
        prepare();
    }
    
    
    public void prepare(){
        
        
        car4 car = new car4();
        addObject(car, 300, 363);
        car.setLocation(292, 359);
       
        
        car.setLocation(291, 360);
        car.setLocation(221, 349);
        removeObject(car);
        car4 car2 = new car4();
        addObject(car2, 342, 347);
        car2.setLocation(297, 359);
        
        
        
    }
}

