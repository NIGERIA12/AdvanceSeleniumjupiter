package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass implements IAutoConstants{
public String propertyFileReader(String Key) throws IOException {
	FileInputStream fis=new FileInputStream(PROPERTYFILEPATH);
	Properties property=new Properties();
	property.load(fis);
	String Value=property.getProperty(Key);
	return Value;
}
public String propertyFileReader1(String Key) throws IOException {
	FileInputStream fis=new FileInputStream(PROPERTYFILEPATH1);
	Properties property=new Properties();
	property.load(fis);
	String Value=property.getProperty(Key);
	return Value;
}
}
