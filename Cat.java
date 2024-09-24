import mayflower.*;

public class Cat extends AnimatedActor
{
    private Animation walk; 
    
    private Timer animTimer;
    public Cat() 
    {
         String[] anim = {"img/cat/Walk (1).png","img/cat/Walk (2).png","img/cat/Walk (3).png",
             "img/cat/Walk (4).png","img/cat/Walk (5).png","img/cat/Walk (6).png",
             "img/cat/Walk (7).png","img/cat/Walk (8).png",
             "img/cat/Walk (9).png","img/cat/Walk (10).png"};
             animTimer = new Timer(100000000);
         walk = new Animation(50, anim, 100, 100);
         setAnimation(walk);
         
         walk.setTransparency(0);
    }
    public void act()
    {
       super.act();
    }
}
