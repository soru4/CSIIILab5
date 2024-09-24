import mayflower.*;

public class Ninja extends AnimatedActor
{
    private Animation walk; 
    
    private Timer animTimer;
    public Ninja() 
    {
         String[] anim = new String[10];
            
         for(int i = 0; i < 10; i++){
                   anim[i] = "img/ninjagirl/Run__00"+i+".png";
         }
             animTimer = new Timer(100000000);
         walk = new Animation(50, anim, 100,100);
         setAnimation(walk);
         walk.setTransparency(0);
    }
    public void act()
    {
       super.act();
    }
}
