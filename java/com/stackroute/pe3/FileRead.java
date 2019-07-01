package com.stackroute.pe3;
import java.io.*;
import java.nio.file.FileAlreadyExistsException;

public class FileRead {
    public static void main(String args[]) {
        File file = new File("/home/abinash/Desktop/exercise2");
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                String output = "";
                if (name.toLowerCase().endsWith(".csv")) {
                    InputStream text = null;
                    try {
                        text = new FileInputStream(name);
                        byte file_content[] = new byte[2 * 1024];
                        int read_count = 0;

                        while ((read_count = text.read()) > 0) {
                            output = output + (new String(file_content, 0, read_count - 1));
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            if (text != null) text.close();
                        } catch (Exception e) {
                        }
                    }
                }

                return true;
            }

        });
    }
}
