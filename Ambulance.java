import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ambulance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ambulance extends Actor
{
    int koin = 0;
    public void act() {
        getWorld().showText("koin : " + koin, 70, 30);
        setirAmbulan();
        end();
        addKoin();
        win();
    }
    
    public void setirAmbulan () { //checkKey
        // MAJU
        if(Greenfoot.isKeyDown("w")||Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY()-2);
        }
        // MUNDUR
        if(Greenfoot.isKeyDown("s")||Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY()+2);
        }
        // BELOK KIRI
        if(Greenfoot.isKeyDown("a")||Greenfoot.isKeyDown("left")) {
            setLocation(getX()-2, getY());
        }
        // BELOK KANAN
        if(Greenfoot.isKeyDown("d")||Greenfoot.isKeyDown("right")) {
            setLocation(getX()+2, getY());
        }
    }
    
    public void end(){
        if(isTouching(GreenCar.class)||isTouching(BlueCar.class)){
            getWorld().showText("Game Over \n koin : " + koin, 300,300);
            Greenfoot.stop();
            Greenfoot.playSound("jokowikaget-made-with-Voicemod-[AudioTrimmer.com].mp3");
        }
    }
    
    public void addKoin(){
        if(isTouching(koin.class)){
            koin = koin + 50;
            removeTouching(koin.class);
            Greenfoot.playSound("mixkit-achievement-completed-2068.wav");
        }
    }
    
    public void win(){
        if(koin == 50000){
            Greenfoot.stop();
            Greenfoot.playSound("success-fanfare-trumpets-6185.mp3");
            getWorld().showText("WIN \n koin : " + koin, 300,300);
        }
    }
}
