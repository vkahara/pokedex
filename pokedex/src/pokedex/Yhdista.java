package pokedex;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;


public class Yhdista {
    

    public String haePokemoneja() {

        try {

            //String haettuKentasta = Pokedex.
            
            String haePokemoneja = "";

            Connection yhteys = DriverManager.getConnection("jdbc:h2:~/pokemonit", "sa", "");

            PreparedStatement statement = yhteys.prepareStatement("SELECT * FROM Pokemonit WHERE nimi= 'Gyarados'");

            //String hae = "select * from pokemonit where nimi = 'Pikachu'";
            ResultSet rs = statement.executeQuery();

            //System.out.println(rs.getInt("ndex"));
            while (rs.next()) {
                 haePokemoneja = "NDEX: #" + rs.getInt("ndex") + " Nimi: " + rs.getString("nimi") + " Tyypi: " + rs.getString("tyyppi");
                 
            }
            
            
           
            return haePokemoneja;

            //hae = rs.getString(1) + "testi";
            //haePokemoneja = hae;
            //yhteys.close(); muista lisätä myöhemmin tietoturvan vuoksi
        } catch (Exception e) {
            return e.getMessage();
        }

        

    }
    
    

}
