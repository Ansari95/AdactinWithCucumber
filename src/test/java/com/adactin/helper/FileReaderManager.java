package com.adactin.helper;

import java.io.IOException;

public class FileReaderManager {
	
	private FileReaderManager(){
		
	}
	

	public static FileReaderManager getfilereader(){
		
		FileReaderManager frm = new FileReaderManager();
		return frm;
	}
	
	public Configuration_Reader getCrInstance() throws IOException{
		
		Configuration_Reader cr = new Configuration_Reader();
		return cr;
	}


}
