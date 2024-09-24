import mayflower.*;
/**
 * Write a description of class Animation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Animation
{
    private MayflowerImage[] frames;
    private int framerate;
    private int currentFrame; 
   
    public Animation(int f, String[] fileName)
    {
        this.framerate = f; 
        currentFrame = 0;
        frames = new MayflowerImage[fileName.length];
        for(int i = 0; i < fileName.length;  i++){
            frames[i] = new MayflowerImage(fileName[i]);
            frames[i].scale(100,87);

        }
        
    }
    public Animation(int f, String[] fileName, int w, int h)
    {
        this.framerate = f; 
        currentFrame = 0;
        frames = new MayflowerImage[fileName.length];
        for(int i = 0; i < fileName.length;  i++){
            frames[i] = new MayflowerImage(fileName[i]);
            frames[i].scale(w, h);

        }
        
    }
    
    public int getFrameRate(){
        return framerate;
        
    }
    public MayflowerImage getNextFrame(){
          currentFrame++;
          currentFrame = currentFrame % frames.length;
          
          return frames[currentFrame];
        
    }
    
    public void setTransparency(int percent){
    
     for(int i = 0; i < frames.length;  i++){
          
            frames[i].setTransparency(percent);

        }
    }

}
