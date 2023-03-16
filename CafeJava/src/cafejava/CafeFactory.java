package cafejava;

import java.awt.BorderLayout;

public class CafeFactory {
    
    public Cafe CriarCafe(Integer menuCafe){
        
        Cafe cafe = null;
        
        switch(menuCafe){
            case 1 -> cafe = new Expresso(
                    "Expresso", 
                    2.50D, 
                    "Expresso forte",
                    350);
            case 2 -> cafe = new Cappuccino(
                    "Cappuccino", 
                    3.50D, 
                    "Cappuccino cremoso",
                    275);
            case 3 -> System.exit(0);
            default -> throw new AssertionError();
        }
        
        return cafe;        
    }
    
}
