package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * @param args
     */
    public static void main( String[] args )
    {
        try {
            Socket s = new Socket("localhost", 3000);

            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

            out.writeBytes("ciao mondo \n");
            System.out.println(in.readLine());

            
            s.close();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
