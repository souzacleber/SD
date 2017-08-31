/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.io.IOException;
import java.net.Socket;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author cleber
 */
public class Conexao extends Thread{
    String msg = "cleber";
    public void servidorUm() throws IOException{     
        
        Socket srvUm = new Socket("localhost",12345);
        OutputStream os = srvUm.getOutputStream();
        os.write(msg.getBytes());
        os.flush();
        
       
    }
    public void servidorDois() throws IOException{
        
        
        Socket srvDois = new Socket("localhost",54321);
        OutputStream os = srvDois.getOutputStream();
        os.write(msg.getBytes());
        os.flush();
        
        
    }
}
