import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Estudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante extends Actor
{
    private int numClases = 0;
    private int fin = 4;
    public Estudiante()
    {
        numClases = 0;
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/12;
        int myNewWidth = (int)myImage.getWidth()/12;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 5, getY());
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 5, getY());
        }
        
        if(isTouching(Clase1.class))
        {
            World myWorld = getWorld();
            Actor1 actor1 = new Actor1();
            myWorld.addObject(actor1, 90, 120); 
            removeTouching(Clase1.class);
            
            numClases++;
        }
        
        if(isTouching(Clase2.class))
        {
            World myWorld = getWorld();
            Actor2 actor2 = new Actor2();
            myWorld.addObject(actor2, 90, 150); 
            removeTouching(Clase2.class);
            
            numClases++;
        }
        
        if(isTouching(Clase3.class))
        {
            World myWorld = getWorld();
            Actor3 actor3 = new Actor3();
            myWorld.addObject(actor3, 90, 180); 
            removeTouching(Clase3.class);
            
            numClases++;
        }
        
        if(isTouching(Clase4.class))
        {
            World myWorld = getWorld();
            Actor4 actor4 = new Actor4();
            myWorld.addObject(actor4, 90, 210); 
            removeTouching(Clase4.class);
            
            numClases++;
        }
        
        if(isTouching(Clase5.class))
        {
            World myWorld = getWorld();
            Actor5 actor5 = new Actor5();
            myWorld.addObject(actor5, 90, 240); 
            removeTouching(Clase5.class);
            
            numClases++;
        }
        
        if(isTouching(Clase6.class))
        {
            World myWorld = getWorld();
            Actor6 actor6 = new Actor6();
            myWorld.addObject(actor6, 90, 270); 
            removeTouching(Clase6.class);
            
            numClases++;
        }
        
        if(isTouching(Clase7.class))
        {
            World myWorld = getWorld();
            Actor7 actor7 = new Actor7();
            myWorld.addObject(actor7, 90, 300); 
            removeTouching(Clase7.class);
            
            numClases++;
        }
        
        if(isTouching(Clase8.class))
        {
            World myWorld = getWorld();
            Actor8 actor8 = new Actor8();
            myWorld.addObject(actor8, 90, 330); 
            removeTouching(Clase8.class);
            
            numClases++;
        }
        
        if(numClases == 4)
        {
            World myWorld = getWorld();
            Greenfoot.stop();
            Fin fin = new Fin();
            myWorld.addObject(fin, 300, 400);
        }
    }
}
