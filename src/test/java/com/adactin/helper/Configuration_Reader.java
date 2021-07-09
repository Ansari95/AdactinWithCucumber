package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class Configuration_Reader {
	public static Properties ps;
	public Configuration_Reader() throws IOException{
		
		File file = new File("src\\test\\java\\com\\adactin\\properties\\config.properties");
		FileInputStream fileinput = new FileInputStream(file);
		ps = new Properties();
		ps.load(fileinput);
	}

	public static String getBrowserName(){
		String browsername = ps.getProperty("browser");
		return browsername;
		
	}
	
	public static String getUrl(){
		String url= ps.getProperty("url");
		return url;
		
	}
	
	
}