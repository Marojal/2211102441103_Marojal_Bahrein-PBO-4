import greenfoot.*;  

public class Obstacle1 extends Obstacle
{
    void createnew(){
        Obstacle1 obs1 = new Obstacle1();
        getWorld().addObject(obs1,Greenfoot.getRandomNumber(600),0);
    }
    void maju(){
        setLocation(getX(), getY()+3);
    } 
    public void act(){
        super.act();
    }    
}
