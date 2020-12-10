import greenfoot.*;


public class Menu extends Window
{
    private static final GreenfootImage fondoMenu = new GreenfootImage("images/main-menu.jpg");

    public Menu()
    {
       fondoMenu.scale(WIDTH_WORLD,HEIGHT_WORLD);
       setBackground(fondoMenu);
        
       prepareButtons();
        
    }
   
    
    private void prepareButtons(){        
        addObject(new BtnNewGame(),BUTTON_X,BUTTON_Y);
        addObject(new BtnRecord(),BUTTON_X,BUTTON_Y + BUTTON_GAP);       
        addObject(new BtnHelp(),BUTTON_X,BUTTON_Y + BUTTON_GAP*2);        
        addObject(new BtnExit(),BUTTON_X,BUTTON_Y + BUTTON_GAP*3);
        
        showText("UnderWorld Land", 250, 100);
        
    }
    
    
   
}