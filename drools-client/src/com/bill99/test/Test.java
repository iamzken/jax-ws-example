package com.bill99.test;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.bill99.ws.FileWSDelegate;
import com.bill99.ws.FileWSService;

public class Test {

	public static void main(String[] args) {
		FileWSService service = new FileWSService();
		FileWSDelegate delegate = service.getFileWSPort();
		
		byte[] bfile = delegate.getDroolsScript("", "");
		BufferedOutputStream bos = null;  
        FileOutputStream fos = null;  
        File file = null;  
        try {  
            file = new File("D:/temp/xxx.drl");  
            fos = new FileOutputStream(file);  
            bos = new BufferedOutputStream(fos);  
            bos.write(bfile);  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            if (bos != null) {  
                try {  
                    bos.close();  
                } catch (IOException e1) {  
                    e1.printStackTrace();  
                }  
            }  
            if (fos != null) {  
                try {  
                    fos.close();  
                } catch (IOException e1) {  
                    e1.printStackTrace();  
                }  
            }  
        }  
	}

}
