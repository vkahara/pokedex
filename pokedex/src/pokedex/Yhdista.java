package pokedex;

import java.sql.Connection;
import java.sql.DriverManager;

public class Yhdista {
    public void yhdista() {
        try {
            Connection yhteys = DriverManager.getConnection("jdbc:h2:~/test","sa","");
            
            yhteys.close();
            
        } catch (Exception e) {
            
        }
    }
  
    
}
