import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class koin extends Enemy
{
    int speed = 3;
    public void act()
    {
        GreenCar enemyGreen = new GreenCar();
        Actor i = getOneIntersectingObject(koin.class);
        move(speed);
        checkDouble(i);
        end();
    }
}
