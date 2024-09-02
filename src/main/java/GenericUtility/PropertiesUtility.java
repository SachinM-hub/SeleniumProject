package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
public class PropertiesUtility {
	public String getDataFromProperties(String data) throws Exception {
		FileInputStream fis = new FileInputStream(IconstantUtility.propertiespath);
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(data);
		return value;
		
		
		//public static void main(String[] args) {
						
		}
}
