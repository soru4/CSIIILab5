import mayflower.*;

public class Jack extends AnimatedActor
{
    private Animation walk; 
    
    private Timer animTimer;
    public Jack() 
    {
        String[] anim = new String[10];
            
         for(int i = 0; i < 10; i++){
                   anim[i] = "img/jack/Slide ("+(i + 1)+").png";
         }
             animTimer = new Timer(100000000);
         walk = new Animation(50, anim, 87*2, 100*2);
         setAnimation(walk);
           walk.setTransparency(30);
    }
    public void act()
    {
       super.act();
    }
}
