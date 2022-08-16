import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Clase1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clase1 extends Actor
{
    int limiteMapaY;
    int limiteMapaX;
    
    public void act()
    {
        setLocation(getX(), getY() + 5);
        
        if(getY() >= 790)
        {
            World myWorld = getWorld();
            myWorld.removeObject(this);
        }
    }
    
    public Clase1 ()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/5;
        int myNewWidth = (int)myImage.getWidth()/5;
        myImage.scale(myNewWidth, myNewHeight);
    }
}
