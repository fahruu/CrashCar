import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flower extends Level1
{
    /**
     * Act - do whatever the Flower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World world;
    public void act() 
    {
         setLocation(getX(),getY()+4);
         Actor mobil = getOneIntersectingObject(Car.class);
         world = getWorld();
         if (isAtEdge()) {
            world.removeObject(this);
         }
         if(mobil != null){
            getWorld().removeObject(this);
            MyWorld.score+=1;
            MyWorld.scores.setScore(MyWorld.score);
         }
    }    
}