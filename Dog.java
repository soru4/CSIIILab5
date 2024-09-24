import mayflower.*;

public class Dog extends AnimatedActor
{
    private Animation walk; 
    
    private Timer animTimer;
    public Dog() 
    {
         String[] anim = new String[10];
            
         for(int i = 0; i < 10; i++){
                   anim[i] = "img/dog/Walk ("+(i + 1)+").png";
         }
             animTimer = new Timer(100000000);
         walk = new Animation(50, anim);
         setAnimation(walk);
    }
    public void act()
    {
       super.act();
    }
}
