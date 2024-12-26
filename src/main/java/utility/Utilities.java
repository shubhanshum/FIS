package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utilities {

	public static String getPropFileData(String key) {
		FileInputStream file;
		String value="";
		try {
			file = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//data//projectData.properties");
			Properties prop=new Properties();
			prop.load(file);
			value=prop.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
}
