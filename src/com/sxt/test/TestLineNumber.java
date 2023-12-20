package com.sxt.test;

import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;

public class TestLineNumber {
    public static void main(String[] args) throws Exception{
        counterDirCodeLines(new File("./src/com"));
        System.out.println("代码行数："+counter);
    }

    static int counter;
    /**
     * 统计指定的目录的代码的行数
     * @return
     */
    public  static void counterDirCodeLines(File file)throws Exception{
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for (File f : files) {
                counterDirCodeLines(f);
            }
        }else{
            counter += counterFileCodeLines(file);
        }
    }

    /**
     * 统计指定文件的代码行数
     * @param file
     * @return
     */
    public static int counterFileCodeLines(File file)throws Exception{
        LineNumberReader lnr = null;
        try {
            lnr = new LineNumberReader(new FileReader(file));
            String str = lnr.readLine();
            while(str != null){
                str = lnr.readLine();
            }
            return  lnr.getLineNumber();
        } finally {
            lnr.close();
        }
    }
}
