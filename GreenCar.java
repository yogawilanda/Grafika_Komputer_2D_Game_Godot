import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GreenCar extends Enemy
{
    int speed = -20;
    public void act()
    {
        GreenCar enemyGreen = new GreenCar();
        Actor i = getOneIntersectingObject(GreenCar.class);
        move(speed);
        checkDouble(i);
        end();
    }
}
