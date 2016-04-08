/**
 * 
 */
package com.bill99.ws;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author kenan.zhang
 * 
 */
public class FileWS {

	public byte[] getDroolsScript(String userName, String password) {

		File f = new File(this.getClass().getClassLoader().getResource("/").getPath()+"drools.drl");  
        ByteArrayOutputStream bos = new ByteArrayOutputStream((int)f.length());  
        BufferedInputStream in = null;  
        try{  
            in = new BufferedInputStream(new FileInputStream(f));  
            int buf_size = 1024;  
            byte[] buffer = new byte[buf_size];  
            int len = 0;  
            while(-1 != (len = in.read(buffer,0,buf_size))){  
                bos.write(buffer,0,len);  
            }  
            return bos.toByteArray();  
        }catch (IOException e) {  
            e.printStackTrace(); 
            return null;
        }finally{  
            try{  
                in.close();  
                bos.close();
            }catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  

	}

}
