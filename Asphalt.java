import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asphalt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asphalt extends Asphalts
{
    /**
     * Act - do whatever the Asphalt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        public void act() 
    {
        setLocation(getX(),getY()+4);
        if (isAtEdge()){
            setLocation(getX(),0);
        }
    }    
}  

