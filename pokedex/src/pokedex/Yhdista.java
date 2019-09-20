package pokedex;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Yhdista {

    public String haePokemoneja() {
        
        String haePokemoneja = "bbbbb";

        try {
            Connection yhteys = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

            
            Statement statement = yhteys.createStatement();
            

            String hae = "select * from pokemonit where nimi = 'Pikachu'";

            ResultSet rs = statement.executeQuery(hae);

            hae = rs.getString(1) + "testi";

            haePokemoneja = hae;

            //yhteys.close(); muista lisätä myöhemmin tietoturvan vuoksi
        } catch (Exception e) {

        }

        return haePokemoneja;

    }

}
