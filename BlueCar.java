import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueCar extends Enemy
{
    int speed = 3;
    public void act()
    {
        BlueCar enemyBlue = new BlueCar();
        Actor i = getOneIntersectingObject(BlueCar.class);
        move(speed);
        checkDouble(i);
        end();
    }
}
