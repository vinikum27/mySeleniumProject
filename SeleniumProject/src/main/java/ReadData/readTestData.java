package ReadData;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readTestData { //1. Loading the file using load method, 2. Reading the keys
	
	Properties prop; //Reference variable of the properties class to read this property
	
	static String file = "./src/main/resources/data/testData.properties";
	
public readTestData() {
		File src = new File(file);
		try {
			FileInputStream fis = new FileInputStream(src); //Creating the Object FileInputStream
			prop = new Properties();
			prop.load(fis); // Loading the file using load method,
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
    }

//Reading the Keys to the values from(testData.properties), we have used in loginScenerios class

public String getuserName() {
	return prop.getProperty("userName");
}


public String getPassword() {
	return prop.getProperty("password");
}

public String getErr() {
	return prop.getProperty("Error");  //value is: Epic sadface: Username and password do not match any user in this service
}

public String getEmptyErr() {
	return prop.getProperty("emptyError");
}

public String getInvalidUname() {
	return prop.getProperty("invaliduserName");
}

public String getinvalidPwd() {
	return prop.getProperty("invalidPassword");
}
}
