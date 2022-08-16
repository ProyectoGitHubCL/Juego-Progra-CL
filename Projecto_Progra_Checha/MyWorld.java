import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    //Clases
    static final int max_clase1 = 1;
    static final int min_clase1 = 1;
    
    private Actor Horarios = new Actor0();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 800, 1); 
        
        
        addObject(Horarios, 90, 70);
        addObject(new Estudiante(), 300, 750);
        Horarios.setImage(new GreenfootImage("Horarios \n seleccionados: ", 24, null, null));
    }
    
    public void act()
    {
        clase1();
        clase2();
        clase3();
        clase4();
        clase5();
        clase6();
        clase7();
        clase8();
    }
    
    public void clase1()
    {
        if( Greenfoot.getRandomNumber(1000)==10)
        {
            for (int x = 0; x < Greenfoot.getRandomNumber(max_clase1 + 1 - min_clase1) + min_clase1; x++)
                addObject(new Clase1(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(100));
        }
    }
    
    public void clase2()
    {
        if( Greenfoot.getRandomNumber(1000)==10)
        {
            for (int x = 0; x < Greenfoot.getRandomNumber(max_clase1 + 1 - min_clase1) + min_clase1; x++)
                addObject(new Clase2(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(100));
        }
    }
    
    public void clase3()
    {
        if( Greenfoot.getRandomNumber(1000)==10)
        {
            for (int x = 0; x < Greenfoot.getRandomNumber(max_clase1 + 1 - min_clase1) + min_clase1; x++)
                addObject(new Clase3(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(100));
        }
    }
    
    public void clase4()
    {
        if( Greenfoot.getRandomNumber(1000)==10)
        {
            for (int x = 0; x < Greenfoot.getRandomNumber(max_clase1 + 1 - min_clase1) + min_clase1; x++)
                addObject(new Clase4(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(100));
        }
    }
    
    public void clase5()
    {
        if( Greenfoot.getRandomNumber(1000)==10)
        {
            for (int x = 0; x < Greenfoot.getRandomNumber(max_clase1 + 1 - min_clase1) + min_clase1; x++)
                addObject(new Clase5(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(100));
        }
    }
    
    public void clase6()
    {
        if( Greenfoot.getRandomNumber(1000)==10)
        {
            for (int x = 0; x < Greenfoot.getRandomNumber(max_clase1 + 1 - min_clase1) + min_clase1; x++)
                addObject(new Clase6(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(100));
        }
    }
    
    public void clase7()
    {
        if( Greenfoot.getRandomNumber(1000)==10)
        {
            for (int x = 0; x < Greenfoot.getRandomNumber(max_clase1 + 1 - min_clase1) + min_clase1; x++)
                addObject(new Clase7(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(100));
        }
    }
    
    public void clase8()
    {
        if( Greenfoot.getRandomNumber(1000)==10)
        {
            for (int x = 0; x < Greenfoot.getRandomNumber(max_clase1 + 1 - min_clase1) + min_clase1; x++)
                addObject(new Clase8(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(100));
        }
    }
    
}
