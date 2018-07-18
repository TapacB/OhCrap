package US.ASRock.helpers;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class FileUtils {

    public static String DataBasepath;
    public static String DatabasePassword;
    public static String DatabaseLogin;


    public static void getConfig() throws UnsupportedEncodingException {
        FileInputStream fis;
        Properties property = new Properties();
        try {
            fis = new FileInputStream("config.properties");
            try {
                property.load(fis);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        DataBasepath = property.getProperty("DataBasepath");
        DatabasePassword = property.getProperty("DatabasePassword");
        DatabaseLogin = property.getProperty("DatabaseLogin");
    }
}
