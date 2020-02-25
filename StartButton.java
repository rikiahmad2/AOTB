import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Button
{
    public void act(){
        if(Greenfoot.mouseClicked(this)){
            status = new Status(false);
            getWorldOfType(StartMenu.class).stopMusic();
            Greenfoot.setWorld(new EnergyWorld(status));
            //Greenfoot.setWorld(new BirdWorld(status));
        }
    } 
}
