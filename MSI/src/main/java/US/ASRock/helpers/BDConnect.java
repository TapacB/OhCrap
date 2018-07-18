package US.ASRock.helpers;



import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.ResourceBundle;

import static com.sun.xml.internal.messaging.saaj.packaging.mime.util.ASCIIUtility.getBytes;

public class BDConnect {

    private static Properties props = new Properties();

    private ResourceBundle messages = ResourceBundle.getBundle("resources/MessagesBundle");

    public void getConfig(){

        try{
            String st = messages.getString("name");
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }



    static {
        props.setProperty( "user", FileUtils.DatabaseLogin );
        props.setProperty( "password", FileUtils.DatabasePassword);

    }

    public static ArrayList<String> mySQL(String sql) {
        ArrayList<String> query = null;
        try (Connection connSrore = DriverManager.getConnection( FileUtils.DataBasepath, props )) {
            try (Statement stmtStore = connSrore.createStatement()) {
                try (ResultSet rs = stmtStore.executeQuery( sql )) {

                    query = new ArrayList<>();
                    while (rs.next()) {
                        for (int i = 1; i < rs.getMetaData().getColumnCount() + 1; i++) {
                            query.add( String.valueOf( rs.getObject( i ) ) );
                        }
                    }
                }
            }
            return query;
        } catch (Throwable t) {
            t.printStackTrace();
        }
        return null;
    }
}
