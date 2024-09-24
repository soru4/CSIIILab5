import mayflower.*;


public class MyWorld extends World {

    private Cat cat;
    private Dog cat1;
    private Ninja cat2;
    private Jack cat3;
    
    private String[][] tiles; 
    public MyWorld() 
    {
        setBackground("img/BG/BG.png");
        tiles = new String[6][8];
        
        buildWorld();
        addRandomObjects();
        cat = new Cat();
        addMainCharachter();
        //addObject(cat, 100, 100);
        //cat1 = new Dog();
        //addObject(cat1, 200, 200);
        //cat3 = new Jack();
        //addObject(cat3, 300, 300);
        cat2 = new Ninja();
        addNinjaCharachter();
        addStoneObjects();
        //addObject(cat2, 500, 400);
        
    }
    public void buildWorld(){
        for(int  i = 0; i < tiles.length; i++){
            for( int c = 0; c < tiles[i].length; c++){
                tiles[i][c] = "";
            }
        }
        
        for(int i = 0; i < tiles[5].length; i++){
            tiles[5][i] = "ground";
        }
        
        for (int i = 0; i < tiles.length; i++){
            for(int x = 0; x < tiles[i].length; x++){
            
                if(tiles[i][x].equals("ground")){
                    addObject(new Block(), x*100, i*100);
                }
            } }
    
    }
       public void addRandomObjects(){
       
        for (int i = 0; i < tiles.length; i++){
            for(int x = 0; x < tiles[i].length; x++){
            
                if(tiles[i][x] != "ground" &&(int)(Math.random()* tiles[0].length) < 2){
                    tiles[i][x] = "yarn";
                    addObject(new Yarn(), x*100, i*100);
                }
            } }
    
    }
     public void addMainCharachter(){
         boolean added = false;
         int row = (int) (Math.random()*tiles.length);
         int col = (int) (Math.random()*tiles[0].length);
         while(!added){
             row = (int) (Math.random()*tiles.length);
             col = (int) (Math.random()*tiles[0].length);
             if(tiles[row][col] == ""){
                 tiles[row][col] = "cat";
                 addObject(cat, col * 100, row* 100); 
                 added = true;
            }
        }
    }
       public void addNinjaCharachter(){
         boolean added = false;
         int row = (int) (Math.random()*tiles.length);
         int col = (int) (Math.random()*tiles[0].length);
         while(!added){
             row = (int) (Math.random()*tiles.length);
             col = (int) (Math.random()*tiles[0].length);
             if(tiles[row][col] == ""){
                 tiles[row][col] = "ninja";
                 addObject(cat2, col * 100, row* 100); 
                 added = true;
            }
        }
    }
     public void addStoneObjects(){
       
        for (int i = 0; i < tiles.length; i++){
            for(int x = 0; x < tiles[i].length; x++){
            
                if(tiles[i][x] == "" &&(int)(Math.random()* tiles[0].length) < 1){
                    tiles[i][x] = "stone";
                    addObject(new Tree(), x*100, i*100);
                }
            } }
    
    }
    public void act()
    {
    }
    
}