import mayflower.*;

public class AnimatedActor extends Actor
{
    private Animation animation;
    private Timer animationTimer;
    
    public AnimatedActor(){animationTimer = new Timer(100000000);}
   
    void setAnimation(Animation a){
        animation = a; 
    }
    
    public void act(){
         MayflowerImage nextFrame = animation.getNextFrame();
        if(animationTimer.isDone()){
            setImage(nextFrame);
            animationTimer.reset();
        }
    }
    

}
