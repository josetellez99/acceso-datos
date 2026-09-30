package Externo;

import java.io.FileOutputStream;
import java.io.IOException;

public class write_two {

    public static FileOutputStream fos = null;

    public static void setFos() {
        try {
            fos = new FileOutputStream("ar.xls");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void send() {
        byte b = 0;

        for (byte c = 0; c < send.length; c++) {

            b = (byte)(send.charAt(c));

            try {
                fos.write(b);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close() {
        
        try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main (String[] args) {
        setFos();
        close();
    }
}
